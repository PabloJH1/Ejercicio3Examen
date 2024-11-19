package com.pablojesushurtadohidalgo.examenej3.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@Composable
fun Screen2(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        val valor=""
        Text(text="Pantalla 2")
        Spacer(modifier = Modifier.padding(8.dp))
        Button(
            onClick = {}
        ) {
            Text(text="Ir a la primera pantalla")
        }
        Spacer(modifier = Modifier.padding(8.dp))
        //TextField(TextFieldValue(valor),valor)
        Button(
            onClick = {}
        ) {
            Text(text="Ir a la tercera pantalla")
        }
    }
}
