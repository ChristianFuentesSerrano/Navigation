package com.example.navigation

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Registro(
    val nombre: String,
    val apellidoPaterno: String,
    val apellidoMaterno: String,
    val nombreUsuario: String,
    val correo: String
): Parcelable {
    override fun toString(): String {
        return "Nombre: $nombre \n\nApellido Paterno: $apellidoPaterno \n\nApellido Materno: $apellidoMaterno \n\nNombre Usuario: $nombreUsuario \n\nCorreo: $correo"
    }
}