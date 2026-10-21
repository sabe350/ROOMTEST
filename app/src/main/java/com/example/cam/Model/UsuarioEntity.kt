package com.example.cam.Model

import androidx.room3.Entity
import androidx.room3.PrimaryKey
import java.util.Date

@Entity(tableName = "usuarios")
data class UsuarioEntity (
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val nombre: String,
    val correo: String,
    val clave:  String,
    val direccion: String,
    val modoEspecial: Boolean,
    val fotoPath: String,
    val fechaRegistro: Date
)
