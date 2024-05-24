package com.example.lab9f

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import com.example.lab9f.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    companion object {
        lateinit var database: BooksDB
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        database = Room.databaseBuilder(
            applicationContext,
            BooksDB::class.java, "book_database"
        ).build()
        val bookDao = database.bookDao()

        binding.addBookButton.setOnClickListener {
            val title = binding.titleEdit.text.toString()
            val author = binding.authorEdit.text.toString()
            val rating = binding.ratingEdit.text.toString().toIntOrNull() ?: 0
            val book = Book(title = title, author = author, rating = rating)
            GlobalScope.launch {
                bookDao.insertAll(book)
            }

            Toast.makeText(
                applicationContext,
                "Book added",
                Toast.LENGTH_LONG
            ).show()
        }

        binding.allBooksButton.setOnClickListener {
            GlobalScope.launch {
                val books = bookDao.getAll()
                var booksInfo = ""
                books.forEach {
                    booksInfo += "Title: ${it.title}, Author: ${it.author}, Rating: ${it.rating}\n"
                }
                runOnUiThread {
                    binding.textView.text = booksInfo
                }
            }
        }

        binding.deleteButton.setOnClickListener {
            val id = binding.idEdit.text.toString().toIntOrNull()

            if (id == null || id < 0) {
                Toast.makeText(this, "Invalid ID. Please enter a valid number.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            lifecycleScope.launch(Dispatchers.IO) {
                val books = bookDao.getAll()
                val bookToDelete = books.find { it.id == id }
                if (bookToDelete != null) {
                    bookDao.deleteById(bookToDelete.id)
                    withContext(Dispatchers.Main) {
                        Toast.makeText(this@MainActivity, "Book deleted successfully", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    withContext(Dispatchers.Main) {
                        Toast.makeText(this@MainActivity, "Invalid ID. No book deleted.", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }
}