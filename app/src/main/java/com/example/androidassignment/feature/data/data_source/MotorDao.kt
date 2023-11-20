package com.example.androidassignment.feature.data.data_source

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.androidassignment.feature.domain.model.Motor

@Dao
interface MotorDao {
    @Insert
    suspend fun insertMotor(motor: Motor): Long

    @Query("SELECT * FROM motor_table")
    fun getAllMotor(): LiveData<List<Motor>>
}
