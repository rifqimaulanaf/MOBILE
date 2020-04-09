package com.example.tugasdb

class WordRepository(private val wordDao: WordDAO) {
    val allWords= wordDao.getAlphabetizedWords()
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}