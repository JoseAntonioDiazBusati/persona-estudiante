package org.example

class Estudiante(nombre: String, fechaNacimiento: Int, edad: Int, val carrera: String): Persona(nombre, fechaNacimiento , edad) {

    override fun actividad(): String{
        return "$nombre, que estudia la carrera de $carrera está realizando una actividad."
    }

    override fun toString(): String {
        return super.toString()
    }
}