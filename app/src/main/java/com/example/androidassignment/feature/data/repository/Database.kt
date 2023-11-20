package com.example.androidassignment.feature.data.repository

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.androidassignment.feature.data.data_source.KendaraanDao
import com.example.androidassignment.feature.data.data_source.MobilDao
import com.example.androidassignment.feature.data.data_source.MotorDao
import com.example.androidassignment.feature.domain.model.Kendaraan
import com.example.androidassignment.feature.domain.model.Mobil
import com.example.androidassignment.feature.domain.model.Motor

@Database(entities = [Kendaraan::class, Motor::class, Mobil::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun kendaraanDao(): KendaraanDao
    abstract fun motorDao(): MotorDao
    abstract fun mobilDao(): MobilDao

    companion object {
        private var instance: AppDatabase? = null

        @Synchronized
        fun getDatabase(context: Context): AppDatabase {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java, "app_database"
                ).build()
            }
            return instance as AppDatabase
        }
    }
}
