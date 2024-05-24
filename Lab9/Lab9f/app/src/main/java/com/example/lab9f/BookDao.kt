package com.example.lab9f

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface BookDao {
    @Query("SELECT * FROM books")
    fun getAll(): List<Book>

    @Insert
    fun insertAll(vararg books: Book)

    @Delete
    fun delete(book: Book)

    @Query("DELETE FROM books WHERE id = :bookId")
    fun deleteById(bookId: Int)
}