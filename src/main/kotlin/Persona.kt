package org.example

import java.util.Date


open class Persona(val nombre: String, private val fechaNacimiento: Int, var edad: Int) {

    fun mostrarEdad(anioActual: Int): Int{
        edad = anioActual - fechaNacimiento
        return edad
    }

    fun cumple(): Int{
        edad += 1
        return edad
    }

    open fun actividad(): String{
        return "$nombre está realizando una actividad."
    }

    override fun toString(): String {
        return "Persona(Nombre: $nombre, Edad: $edad)"
    }
}