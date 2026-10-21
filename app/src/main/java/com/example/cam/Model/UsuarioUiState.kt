package com.example.cam.Model
import android.net.Uri

data class UsuarioUiState(
    val nombre: String = "",
    val correo: String = "",
    val clave:  String = "",
    val direccion: String = "",
    val aceptaTerminos: Boolean,
    val fotoUri: Uri?,
    val modoEspecial: Boolean
    )