package com.example.androidassignment.feature.data.repository

import androidx.lifecycle.LiveData
import com.example.androidassignment.feature.data.data_source.KendaraanDao
import com.example.androidassignment.feature.data.data_source.MobilDao
import com.example.androidassignment.feature.data.data_source.MotorDao
import com.example.androidassignment.feature.domain.model.Kendaraan
import com.example.androidassignment.feature.domain.model.Mobil
import com.example.androidassignment.feature.domain.model.Motor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class KendaraanRepository(private val kendaraanDao: KendaraanDao, private val motorDao: MotorDao, private val mobilDao: MobilDao) {

    suspend fun insertKendaraan(kendaraan: Kendaraan) {
        withContext(Dispatchers.IO) {
            kendaraanDao.insertKendaraan(kendaraan)
        }
    }

    fun getAllKendaraan(): LiveData<List<Kendaraan>> {
        return kendaraanDao.getAllKendaraan()
    }

    suspend fun insertMotor(motor: Motor) {
        withContext(Dispatchers.IO) {
            motorDao.insertMotor(motor)
        }
    }

    fun getAllMotor(): LiveData<List<Motor>> {
        return motorDao.getAllMotor()
    }

    suspend fun insertMobil(mobil: Mobil) {
        withContext(Dispatchers.IO) {
            mobilDao.insertMobil(mobil)
        }
    }

    fun getAllMobil(): LiveData<List<Mobil>> {
        return mobilDao.getAllMobil()
    }
}

