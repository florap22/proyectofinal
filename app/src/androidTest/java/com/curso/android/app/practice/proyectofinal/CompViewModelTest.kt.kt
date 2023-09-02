package com.curso.android.app.practice.proyectofinal

import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.Assert.*

class CompViewModelTest{

    private lateinit var viewModel: CompViewModel

    @Before
    fun setUp() {
        viewModel = CompViewModel()
    }

    @After
    fun tearDown() {
        // Limpiar recursos después de cada prueba si es necesario
    }

    @Test
    fun testCompNum_Num1mayorNum2() {
        val result = viewModel.compNum(5, 3)
        assertEquals("El Num del casillero 1 es mayor", result)
    }

    @Test
    fun testCompNum_Num2mayorNum1() {
        val result = viewModel.compNum(3, 5)
        assertEquals("El Num del casillero 2 es mayor", result)
    }

    @Test
    fun testCompNum_Num1igualNum2() {
        val result = viewModel.compNum(4, 4)
        assertEquals("Los Numeros son iguales", result)
    }
}