package com.example.androidassignment.feature.data.data_source

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.androidassignment.feature.domain.model.Mobil

@Dao
interface MobilDao {
    @Insert
    suspend fun insertMobil(mobil: Mobil): Long

    @Query("SELECT * FROM mobil_table")
    fun getAllMobil(): LiveData<List<Mobil>>
}
