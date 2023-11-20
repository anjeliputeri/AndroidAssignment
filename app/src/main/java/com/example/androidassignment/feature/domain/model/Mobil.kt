package com.example.androidassignment.feature.domain.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "mobil_table",
    foreignKeys = [ForeignKey(
        entity = Kendaraan::class,
        parentColumns = ["id"],
        childColumns = ["kendaraanId"],
        onDelete = ForeignKey.CASCADE
    )]
)
data class Mobil(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "kendaraanId") val kendaraanId: Int,
    val mesin: String,
    val kapasitasPenumpang: Int,
    val tipe: String
)

