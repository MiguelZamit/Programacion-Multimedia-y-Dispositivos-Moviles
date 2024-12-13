package com.miguelzamit.dicegamemiguel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.miguelzamit.dicegamemiguel.model.Dice
import com.miguelzamit.dicegamemiguel.ui.theme.DiceGameMiguelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DiceGameMiguelTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Component(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Composable
fun Component(modifier: Modifier) {

    var randomNumber by rememberSaveable() { mutableIntStateOf(Dice.throwDiceNFaces(6)) } // Viene con una tirada por defecto. Preguntar si la debo contar
    var points by rememberSaveable() { mutableIntStateOf(20) }
    var playAgain by rememberSaveable() { mutableIntStateOf(0) } // Esto solo tendra o 0 o 1 -> 0 False, 1 True

    Column(
        modifier = modifier
    ) {

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Text(
                text = stringResource(R.string.title),
                fontSize = 40.sp,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold
            )

            Text(
//                text = """
//                    A simple game:
//                            - Arrows: +1/-1 poits.
//                            - Numbers: +15/-3 points.
//                """.trimIndent(),
                text = stringResource(R.string.subtitle),
                fontSize = 15.sp
            )

            Row(

                modifier = Modifier.padding(20.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)

            ) {


                Button(
                    onClick = {

                    },
                    shape = RectangleShape,
                    enabled = false
                ) {

                    Text(
                        modifier = Modifier.padding(30.dp),
                        text = "$randomNumber",
                        fontSize = 50.sp

                    )

                }



                Column(

                    verticalArrangement = Arrangement.spacedBy(10.dp)

                ) {
                    Button(
                        onClick = {
                            points--
                            val newNumber = Dice.throwDiceNFaces(6)
                            if (newNumber > randomNumber) points++
                            randomNumber = newNumber
                        },
                        enabled = points > 0
                    ) {
                        Text(
                            text = "↑",
                            fontSize = 30.sp
                        )

                    }

                    Button(

                        onClick = {
                            points--
                            val newNumber = Dice.throwDiceNFaces(6)
                            if (newNumber < randomNumber) points++
                            randomNumber = newNumber
                        },
                        enabled = points > 0
                    ) {

                        Text(
                            text = "↓",
                            fontSize = 30.sp
                        )
                    }

                }


            }


            Column(

                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {


                Text(


                    text = stringResource(R.string.panelNumbers),

                    )


                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp)

                ) {


                    Button(
                        onClick = {
                            points -= 3
                            val newNumber = Dice.throwDiceNFaces(6)
                            if (newNumber == 1) points += 15
                            randomNumber = newNumber

                        },
                        enabled = points > 0
                    ) {

                        Text(
                            text = "1"

                        )

                    }

                    Button(
                        onClick = {
                            points -= 3
                            val newNumber = Dice.throwDiceNFaces(6)
                            if (newNumber == 2) points += 15
                            randomNumber = newNumber
                        },
                        enabled = points > 0
                    ) {
                        Text(
                            text = "2"

                        )
                    }
                }

                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {

                    Button(
                        onClick = {
                            points -= 3
                            val newNumber = Dice.throwDiceNFaces(6)
                            if (newNumber == 3) points += 15
                            randomNumber = newNumber
                        },
                        enabled = points > 0
                    ) {

                        Text(
                            text = "3"

                        )

                    }

                    Button(
                        onClick = {
                            points -= 3
                            val newNumber = Dice.throwDiceNFaces(6)
                            if (newNumber == 4) points += 15
                            randomNumber = newNumber
                        },
                        enabled = points > 0
                    ) {

                        Text(
                            text = "4"

                        )

                    }

                }

                Row(

                    horizontalArrangement = Arrangement.spacedBy(10.dp)

                ) {

                    Button(
                        onClick = {
                            points -= 3
                            val newNumber = Dice.throwDiceNFaces(6)
                            if (newNumber == 5) points += 15
                            randomNumber = newNumber
                        },
                        enabled = points > 0
                    ) {

                        Text(
                            text = "5"

                        )

                    }

                    Button(
                        onClick = {
                            points -= 3
                            val newNumber = Dice.throwDiceNFaces(6)
                            if (newNumber == 6) points += 15
                            randomNumber = newNumber
                        },
                        enabled = points > 0
                    ) {

                        Text(
                            text = "6"

                        )

                    }

                }


            }

            Row(

                modifier = Modifier.padding(60.dp)

            ) {

                Text(
                    text = stringResource(R.string.points, points),
                    fontSize = 20.sp

                )

            }

            Button(
                onClick = {

                    points = 20

                },
                enabled = playAgain == 1

            ) {
                Text(

                    text = stringResource(R.string.playAgain)
                )

            }

            // Diablo
            // Para hacer un 5, falta por hacer lo demas y sera ponerle un when para cada una de las caras
            Column(
                modifier = Modifier
                    .width(120.dp)
                    .height(120.dp)
                    .background(color = Color.Red, shape = RoundedCornerShape(16.dp))
                    .border(3.dp, Color.Black, shape = RoundedCornerShape(16.dp))
            ) {

                Column(

                    modifier = Modifier.padding(20.dp)

                ) {

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(27.dp)
                    ) {

                        Column(
                            modifier = Modifier
                                .width(12.dp)
                                .height(12.dp)
                                .background(Color.White, shape = CircleShape)

                        ) { }
                        Column() {}
                        Column(
                            modifier = Modifier
                                .width(12.dp)
                                .height(12.dp)
                                .background(Color.White, shape = CircleShape)
                        ) { }


                    }

                    Spacer(modifier = Modifier.height(20.dp))
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(30.dp),

                        ) {

                        Column(
                            modifier = Modifier
                                .width(6.dp)

                        ) { }
                        Column(
                            modifier = Modifier
                                .width(12.dp)
                                .height(12.dp)
                                .background(Color.White, shape = CircleShape)
                        ) { }
                        Column() { }


                    }

                    Spacer(modifier = Modifier.height(22.dp))

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(27.dp)
                    ) {

                        Column(
                            modifier = Modifier
                                .width(12.dp)
                                .height(12.dp)
                                .background(Color.White, shape = CircleShape)
                        ) { }
                        Column() {}
                        Column(
                            modifier = Modifier
                                .width(12.dp)
                                .height(12.dp)
                                .background(Color.White, shape = CircleShape)
                        ) { }


                    }


                }


            }

            if (points <= 0) {

                playAgain = 1
                points = 0

                Column(

                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {

                    Spacer(modifier = Modifier.height(40.dp))

                    Text(
                        text = stringResource(R.string.gameOverMessage).trimIndent(),
                        fontSize = 20.sp

                    )

                }

            }

            Button(
                onClick = {

                    points = 0

                }

            ) { }


        }


    }
}