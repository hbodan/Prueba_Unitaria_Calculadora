package com.example.pruebaunitaria

class Calculadora {

    fun sumar(a: Int, b: Int): Int {
        return a + b
    }

    // Actividad 1: Resta
    fun restar(a: Int, b: Int): Int {
        return a - b
    }

    // Actividad 2: Multiplicación
    fun multiplicar(a: Int, b: Int): Int {
        return a * b
    }

    // Actividad 3: División
    fun dividir(a: Int, b: Int): Double {
        require(b != 0) { "No se puede dividir por cero" } // Validación de seguridad
        return a.toDouble() / b.toDouble()
    }

}