package com.example.androidassignment.feature.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.androidassignment.feature.domain.model.Kendaraan
import com.example.androidassignment.feature.domain.model.Mobil
import com.example.androidassignment.feature.domain.model.Motor

@Database(entities = [Kendaraan::class,
    Motor::class, Mobil::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun kendaraanDao(): KendaraanDao
    abstract fun motorDao(): MotorDao
    abstract fun mobilDao(): MobilDao
}
