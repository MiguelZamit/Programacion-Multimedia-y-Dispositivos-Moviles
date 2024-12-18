package com.miguelzamit.statisticsmiguel

import android.icu.text.CaseMap.Title
import android.os.Bundle
import android.service.quicksettings.Tile
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.miguelzamit.statisticsmiguel.ui.theme.StatisticsMiguelTheme
import androidx.compose.ui.unit.sp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StatisticsMiguelTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Content(
                        modifier = Modifier.padding(innerPadding),
                        name = "Miguel"
                    )


                }
            }
        }
    }
}

@Composable
fun Content (modifier: Modifier = Modifier, name: String) {



    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
            .then(modifier),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        var timesTotal by rememberSaveable() { mutableIntStateOf(0) }
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Estadisticas de $name"

            )
        }


        Row (
        ) {
            Text(
                text = "Total: $timesTotal",
                modifier = Modifier.padding(10.dp)
            )

            Button(
                onClick = {

                    timesTotal = 0;

                })
            {

                Text(
                    text = "Volver a 0",
                    fontSize = 12.sp,


                )

            }


        }


        Text(
            text = "Personas: "

        )

        var timesPersonas by rememberSaveable (){ mutableIntStateOf(0)}
        Row () {

            Text(

                text = "$timesPersonas",
                modifier = Modifier.padding(10.dp)
            )

            Button(
                onClick = {
                    timesPersonas++;

                }

            ) {

                Text(
                    text = "+",

                )

            }

            Button(
                onClick = {
                    timesPersonas--;

                }

            ) {

                Text(
                    text = "-",

                    )

            }

        }

        Text(
            text = "Patinetes: "

        )

        var timesPatinetes by rememberSaveable (){ mutableIntStateOf(0)}
        Row () {

            Text(

                text = "$timesPatinetes",
                modifier = Modifier.padding(10.dp)
            )

            Button(
                onClick = {
                    timesPatinetes++;

                }

            ) {

                Text(
                    text = "+",

                    )

            }

            Button(
                onClick = {
                    timesPatinetes--;

                }

            ) {

                Text(
                    text = "-",

                    )

            }

        }



        Text(
            text = "Bicicletas: "

        )

        var timesBicicletas by rememberSaveable (){ mutableIntStateOf(0)}
        Row () {

            Text(

                text = "$timesBicicletas",
                modifier = Modifier.padding(10.dp)
            )

            Button(
                onClick = {
                    timesBicicletas++;

                }

            ) {

                Text(
                    text = "+",

                    )

            }

            Button(
                onClick = {
                    timesBicicletas--;

                }

            ) {

                Text(
                    text = "-",

                    )

            }

        }


        Text(
            text = "Coches: "

        )

        var timesCoches by rememberSaveable (){ mutableIntStateOf(0)}
        Row () {

            Text(

                text = "$timesCoches",
                modifier = Modifier.padding(10.dp)
            )

            Button(
                onClick = {
                    timesCoches++;

                }

            ) {

                Text(
                    text = "+",

                    )

            }

            Button(
                onClick = {
                    timesCoches--;

                }

            ) {

                Text(
                    text = "-",

                    )

            }

        }

        Text(
            text = "Estaditicas: ",
            fontWeight = 200.sp

        )


    }


}

