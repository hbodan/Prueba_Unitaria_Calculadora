package com.example.pruebaunitaria

import org.junit.Assert.assertEquals
import org.junit.Test

class CalculadoraTest {
    private val calculadora = Calculadora()
    @Test
    fun verificarSuma() {
        val resultado = calculadora.sumar(5, 3)
        assertEquals(8, resultado)
    }

    @Test
    fun verificarResta() {
        val resultado = calculadora.restar(10, 4)
        assertEquals(6, resultado)
    }

    @Test
    fun verificarMultiplicacion() {
        val resultado = calculadora.multiplicar(5, 3)
        assertEquals(15, resultado)
    }

    @Test
    fun verificarDivision() {
        val resultado = calculadora.dividir(5, 2)
        // Se usa un tercer parámetro (delta) al comparar Doubles por precisión de decimales
        assertEquals(2.5, resultado, 0.001)
    }

    @Test
    fun verificarOperacionesConNumerosNegativos() {
        // Suma de negativos
        assertEquals(-8, calculadora.sumar(-5, -3))
        // Multiplicación con un negativo
        assertEquals(-15, calculadora.multiplicar(-5, 3))
        // Resta de negativos
        assertEquals(-2, calculadora.restar(-5, -3))
    }

    @Test
    fun verificarFalloIntencional() {
        val resultado = calculadora.sumar(2, 2)
        // El resultado real es 4, pero le decimos a la prueba que espere un 5
        assertEquals(5, resultado)
    }
}