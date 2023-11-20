package com.example.androidassignment.feature.data.data_source

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.androidassignment.feature.domain.model.Kendaraan

@Dao
interface KendaraanDao {
    @Insert
    suspend fun insertKendaraan(kendaraan: Kendaraan): Long

    @Query("SELECT * FROM kendaraan_table")
    fun getAllKendaraan(): LiveData<List<Kendaraan>>
}
