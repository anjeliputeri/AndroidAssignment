package com.example.androidassignment.feature.data.repository

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.androidassignment.feature.data.data_source.AppDatabase

class KendaraanViewModelFactory(private val application: Application) : ViewModelProvider.Factory {
    private val repository: KendaraanRepository

    init {
        val kendaraanDao = AppDatabase.getDatabase(application).kendaraanDao()
        val motorDao = AppDatabase.getDatabase(application).motorDao()
        val mobilDao = AppDatabase.getDatabase(application).mobilDao()
        repository = KendaraanRepository(kendaraanDao, motorDao, mobilDao)
    }

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(KendaraanViewModel::class.java)) {
            return KendaraanViewModel(repository) as T
        }

        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
