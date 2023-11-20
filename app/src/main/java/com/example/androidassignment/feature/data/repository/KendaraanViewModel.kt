package com.example.androidassignment.feature.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidassignment.feature.data.data_source.KendaraanDao
import com.example.androidassignment.feature.data.data_source.MobilDao
import com.example.androidassignment.feature.data.data_source.MotorDao
import com.example.androidassignment.feature.domain.model.Kendaraan
import com.example.androidassignment.feature.domain.model.Mobil
import com.example.androidassignment.feature.domain.model.Motor
import kotlinx.coroutines.launch

class KendaraanViewModel(private val kendaraanDao: KendaraanDao, private val motorDao: MotorDao, private val mobilDao: MobilDao) : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }
    val text: LiveData<String> = _text

    fun insertKendaraan(kendaraan: Kendaraan) {
        viewModelScope.launch {
            kendaraanDao.insertKendaraan(kendaraan)
        }
    }

    fun getAllKendaraan(): LiveData<List<Kendaraan>> {
        return kendaraanDao.getAllKendaraan()
    }

    fun insertMotor(motor: Motor) {
        viewModelScope.launch {
            motorDao.insertMotor(motor)
        }
    }

    fun getAllMotor(): LiveData<List<Motor>> {
        return motorDao.getAllMotor()
    }

    fun insertMobil(mobil: Mobil) {
        viewModelScope.launch {
            mobilDao.insertMobil(mobil)
        }
    }

    fun getAllMobil(): LiveData<List<Mobil>> {
        return mobilDao.getAllMobil()
    }
}

