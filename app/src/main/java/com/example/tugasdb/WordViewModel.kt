package com.example.tugasdb

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class WordViewModel (application: Application):AndroidViewModel(application){
    private val repesitory: WordRepository
    val allWord:LiveData<List<Word>>

    init {
        val wordDAO=WordRoomDatabase.getDatabase(application,
            viewModelScope).wordDao()
        repesitory= WordRepository(wordDAO)
        allWord= repesitory.allWords
    }
    fun insert(word:Word)=viewModelScope.launch {
        repesitory.insert(word)
    }
}