package com.example.p1_tarjetapresentacion_cristina_andres

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.p1_tarjetapresentacion_cristina_andres.ui.theme.P1_TarjetaPresentacion_Cristina_AndresTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            P1_TarjetaPresentacion_Cristina_AndresTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PresentacionCentral(
                        modifier = Modifier,
                    )
                }
            }
        }
    }
}
// Fragmento de presentacion central
@Composable
fun PresentacionCentral(modifier: Modifier = Modifier) {
    // Recurso de imagen del logo del Virgen de la Paloma
    val image = painterResource(R.drawable.tafad_virgen_de_la_paloma_3257292920)
    // Columna de contenido
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        // Contenedor de imagen
        Box (
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth(),
        ) {
            Image(
                painter = image,
                contentDescription = stringResource(R.string.descripcionImagenPaloma),
                modifier = Modifier.size(150.dp)
            )
        }
        // Contenedor de Nombre
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Text(
                text = stringResource(R.string.nombre),
                fontSize = 35.sp,
            )
        }
        // Contenedor de Rol
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = stringResource(R.string.rol),
                fontSize = 20.sp,
            )
        }
        
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    P1_TarjetaPresentacion_Cristina_AndresTheme {
        PresentacionCentral()
    }
}