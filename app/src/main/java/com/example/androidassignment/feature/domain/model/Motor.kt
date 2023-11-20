package com.example.androidassignment.feature.domain.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "motor_table",
    foreignKeys = [ForeignKey(
        entity = Kendaraan::class,
        parentColumns = ["id"],
        childColumns = ["kendaraanId"],
        onDelete = ForeignKey.CASCADE
    )]
)
data class Motor(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "kendaraanId") val kendaraanId: Int,
    val mesin: String,
    val tipeSuspensi: String,
    val tipeTransmisi: String
)
