package com.example.lab9f


import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Book::class], version = 1)
abstract class BooksDB : RoomDatabase() {
    abstract fun bookDao(): BookDao
}