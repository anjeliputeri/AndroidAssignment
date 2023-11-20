package com.example.androidassignment.feature.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "kendaraan_table")
data class Kendaraan(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val tahunKeluaran: Int,
    val warna: String,
    val harga: Double
)
