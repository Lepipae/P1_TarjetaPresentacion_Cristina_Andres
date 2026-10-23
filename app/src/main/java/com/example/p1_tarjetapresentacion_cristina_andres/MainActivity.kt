package com.example.p1_tarjetapresentacion_cristina_andres

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.p1_tarjetapresentacion_cristina_andres.ui.theme.P1_TarjetaPresentacion_Cristina_AndresTheme


// TRABAJO REALIZADO POR CRISTINA XU Y ANDRÉS LÓPEZ
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            P1_TarjetaPresentacion_Cristina_AndresTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = colorResource(R.color.fondo)
                ) { innerPadding ->
                    PresentacionCentral(
                        modifier = Modifier.padding(innerPadding),
                    )
                    informacionContacto(
                        modifier = Modifier.padding(innerPadding),
                    )
                }
            }
        }
    }
}

// Fragmento de Presentacion central
@Composable
fun PresentacionCentral(modifier: Modifier = Modifier) {
    // Recurso de imagen del logo del Virgen de la Paloma
    val image = painterResource(R.drawable.tafad_virgen_de_la_paloma_3257292920)
    val fuente = FontFamily(
        Font(R.font.aoboshi_one, FontWeight.Normal)
    )
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
                modifier = Modifier.size(150.dp),
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
                fontFamily = fuente
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
                fontFamily = fuente
            )
        }
    }
}

@Composable
fun informacionContacto(modifier: Modifier = Modifier) {
    val fuente = FontFamily(
        Font(R.font.golos_text, FontWeight.Normal)
    )
    val imagenTelefono = painterResource(R.drawable.telefono)
    val imagenEnviar = painterResource(R.drawable.enviar)
    val imagenCorreo = painterResource(R.drawable.correo_vector)

    Column(verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize().padding(bottom = 25.dp)) {

        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.padding(3.dp).fillMaxWidth()) {
            Image(
                painter = imagenTelefono,
                contentDescription = null,
                modifier = Modifier.height(35.dp).width(35.dp).padding(end = 12.dp)
            )

            Text(
                text = stringResource(R.string.telefono),
                modifier = Modifier.width(160.dp),
                fontFamily = fuente
            )
        }

        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.padding(3.dp).fillMaxWidth()) {

            Image(
                painter = imagenEnviar,
                contentDescription = null,
                modifier = Modifier.height(35.dp).width(35.dp).padding(end = 12.dp)
            )

            Text(
                text = stringResource(R.string.redesSociales),
                modifier = Modifier.width(160.dp),
                fontFamily = fuente

            )
        }

        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.padding(3.dp).fillMaxWidth()) {

            Image(
                painter = imagenCorreo,
                contentDescription = null,
                modifier = Modifier.height(35.dp).width(35.dp).padding(end = 12.dp)
            )

            Text(
                text = stringResource(R.string.correo),
                modifier = Modifier.width(160.dp),
                fontFamily = fuente
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    P1_TarjetaPresentacion_Cristina_AndresTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            containerColor = colorResource(R.color.fondo)
        ) { innerPadding ->
            PresentacionCentral(
                modifier = Modifier.padding(innerPadding)
            )
            informacionContacto(
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}
