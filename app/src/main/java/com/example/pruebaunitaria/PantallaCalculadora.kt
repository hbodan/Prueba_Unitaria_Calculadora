package com.example.pruebaunitaria

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag

@Composable
fun PantallaCalculadora() {

    val calculadora = Calculadora()
    var resultado1 by remember { mutableStateOf("") }
    var resultado2 by remember { mutableStateOf("") }


    Column {

        Button(
            onClick = {
                resultado1 = calculadora.sumar(5, 3).toString()
            }
        ) {
            Text("Calcular")
        }

        Text(
            text = resultado1,
            modifier = Modifier.testTag("resultado")
        )

        Button(
            onClick = {
                resultado2 = calculadora.restar(5, 3).toString()
            }
        ) {
            Text("Restar")
        }

        Text(
            text = resultado2,
            modifier = Modifier.testTag("resultado")
        )
    }
}