package com.miguelzamit.dicegamemiguel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
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
    var infoMessage by rememberSaveable (){ mutableStateOf("")}
    val context = LocalContext.current

    @Composable
    fun showDice(randomNumber: Int) {

        when (randomNumber) {

            1 -> {


                // Para hacer un 1
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


                            ) { }
                            Column() {}
                            Column(
                                modifier = Modifier
                                    .width(12.dp)
                                    .height(12.dp)

                            ) { }


                        }

                        Spacer(modifier = Modifier.height(20.dp))
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(30.dp),

                            ) {

                            Column(
                                modifier = Modifier
                                    .width(5.dp)

                            ) { }
                            Column(
                                modifier = Modifier
                                    .width(17.dp)
                                    .height(17.dp)
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

                            ) { }
                            Column() {}
                            Column(
                                modifier = Modifier
                                    .width(12.dp)
                                    .height(12.dp)

                            ) { }


                        }


                    }


                }


            }

            2 -> {

                // Para hacer un 2
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
                            horizontalArrangement = Arrangement.spacedBy(25.dp)
                        ) {

                            Column(
                                modifier = Modifier
                                    .width(12.dp)
                                    .height(12.dp)


                            ) { }
                            Column() {}
                            Column(
                                modifier = Modifier
                                    .width(17.dp)
                                    .height(17.dp)
                                    .background(Color.White, shape = CircleShape)
                            ) { }


                        }

                        Spacer(modifier = Modifier.height(15.dp))
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

                            ) { }
                            Column() { }


                        }

                        Spacer(modifier = Modifier.height(19.dp))

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(27.dp)
                        ) {

                            Column(
                                modifier = Modifier
                                    .width(17.dp)
                                    .height(17.dp)
                                    .background(Color.White, shape = CircleShape)
                            ) { }
                            Column() {}
                            Column(
                                modifier = Modifier
                                    .width(12.dp)
                                    .height(12.dp)

                            ) { }


                        }


                    }


                }

            }

            3 -> {

                // Para hacer un 3
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
                            horizontalArrangement = Arrangement.spacedBy(23.dp)
                        ) {

                            Column(
                                modifier = Modifier
                                    .width(17.dp)
                                    .height(17.dp)


                            ) { }
                            Column() {}
                            Column(
                                modifier = Modifier
                                    .width(17.dp)
                                    .height(17.dp)
                                    .background(Color.White, shape = CircleShape)
                            ) { }


                        }

                        Spacer(modifier = Modifier.height(17.dp))
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(30.dp),

                            ) {

                            Column(
                                modifier = Modifier
                                    .width(2.dp)

                            ) { }
                            Column(
                                modifier = Modifier
                                    .width(17.dp)
                                    .height(17.dp)
                                    .background(Color.White, shape = CircleShape)
                            ) { }
                            Column() { }


                        }

                        Spacer(modifier = Modifier.height(11.dp))

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(22.dp)
                        ) {

                            Column(
                                modifier = Modifier
                                    .width(17.dp)
                                    .height(17.dp)
                                    .background(Color.White, shape = CircleShape)
                            ) { }
                            Column() {}
                            Column(
                                modifier = Modifier
                                    .width(17.dp)
                                    .height(17.dp)

                            ) { }


                        }


                    }


                }

            }

            4 -> {

                // Para hacer un 4
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
                            horizontalArrangement = Arrangement.spacedBy(23.dp)
                        ) {

                            Column(
                                modifier = Modifier
                                    .width(17.dp)
                                    .height(17.dp)
                                    .background(Color.White, shape = CircleShape)

                            ) { }
                            Column() {}
                            Column(
                                modifier = Modifier
                                    .width(17.dp)
                                    .height(17.dp)
                                    .background(Color.White, shape = CircleShape)
                            ) { }


                        }

                        Spacer(modifier = Modifier.height(17.dp))
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(30.dp),

                            ) {

                            Column(
                                modifier = Modifier
                                    .width(2.dp)

                            ) { }
                            Column(
                                modifier = Modifier
                                    .width(17.dp)
                                    .height(17.dp)

                            ) { }
                            Column() { }


                        }

                        Spacer(modifier = Modifier.height(11.dp))

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(22.dp)
                        ) {

                            Column(
                                modifier = Modifier
                                    .width(17.dp)
                                    .height(17.dp)
                                    .background(Color.White, shape = CircleShape)
                            ) { }
                            Column() {}
                            Column(
                                modifier = Modifier
                                    .width(17.dp)
                                    .height(17.dp)
                                    .background(Color.White, shape = CircleShape)
                            ) { }


                        }


                    }


                }

            }

            5 -> {

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
                            horizontalArrangement = Arrangement.spacedBy(23.dp)
                        ) {

                            Column(
                                modifier = Modifier
                                    .width(17.dp)
                                    .height(17.dp)
                                    .background(Color.White, shape = CircleShape)

                            ) { }
                            Column() {}
                            Column(
                                modifier = Modifier
                                    .width(17.dp)
                                    .height(17.dp)
                                    .background(Color.White, shape = CircleShape)
                            ) { }


                        }

                        Spacer(modifier = Modifier.height(17.dp))
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(30.dp),

                            ) {

                            Column(
                                modifier = Modifier
                                    .width(2.dp)

                            ) { }
                            Column(
                                modifier = Modifier
                                    .width(17.dp)
                                    .height(17.dp)
                                    .background(Color.White, shape = CircleShape)
                            ) { }
                            Column() { }


                        }

                        Spacer(modifier = Modifier.height(11.dp))

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(22.dp)
                        ) {

                            Column(
                                modifier = Modifier
                                    .width(17.dp)
                                    .height(17.dp)
                                    .background(Color.White, shape = CircleShape)
                            ) { }
                            Column() {}
                            Column(
                                modifier = Modifier
                                    .width(17.dp)
                                    .height(17.dp)
                                    .background(Color.White, shape = CircleShape)
                            ) { }


                        }


                    }


                }

            }

            6 -> {

                // Para hacer un 6
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
                            horizontalArrangement = Arrangement.spacedBy(14.dp)
                        ) {

                            Column(
                                modifier = Modifier
                                    .width(17.dp)
                                    .height(17.dp)
                                    .background(Color.White, shape = CircleShape)

                            ) { }
                            Column(
                                modifier = Modifier
                                    .width(17.dp)
                                    .height(17.dp)
                                    .background(Color.White, shape = CircleShape)
                            ) { }
                            Column(
                                modifier = Modifier
                                    .width(17.dp)
                                    .height(17.dp)
                                    .background(Color.White, shape = CircleShape)
                            ) { }


                        }

                        Spacer(modifier = Modifier.height(17.dp))
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(30.dp),

                            ) {

                            Column(
                                modifier = Modifier
                                    .width(2.dp)

                            ) { }
                            Column(
                                modifier = Modifier
                                    .width(17.dp)
                                    .height(17.dp)

                            ) { }
                            Column() { }


                        }

                        Spacer(modifier = Modifier.height(11.dp))

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(14.dp)
                        ) {

                            Column(
                                modifier = Modifier
                                    .width(17.dp)
                                    .height(17.dp)
                                    .background(Color.White, shape = CircleShape)

                            ) { }
                            Column(
                                modifier = Modifier
                                    .width(17.dp)
                                    .height(17.dp)
                                    .background(Color.White, shape = CircleShape)
                            ) { }
                            Column(
                                modifier = Modifier
                                    .width(17.dp)
                                    .height(17.dp)
                                    .background(Color.White, shape = CircleShape)
                            ) { }


                        }


                    }


                }

            }


        }

    }

    Column() {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier
                    .background(color = Color(0xEB960B0B))
                    .fillMaxWidth()
                    .border(5.dp, Color(0xB55CFD1D), shape = RoundedCornerShape(13.dp))
                    .padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(35.dp))
                Text(
                    text = stringResource(R.string.title),
                    fontSize = 40.sp,
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.Black,
                    fontFamily = FontFamily.Cursive,
                    color = Color.Yellow,
                    modifier = Modifier
                        .border(2.dp, Color.Yellow, shape = CircleShape)
                        .padding(7.dp)
                )
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    text = stringResource(R.string.subtitle),
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Black,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(10.dp))
            }

            Column(

                modifier = Modifier
                    .background(color = Color(0xEB960B0B))
                    .fillMaxWidth()
                    .border(7.dp, Color(0xB55CFD1D), shape = RoundedCornerShape(13.dp))
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {

                Text(
                    text = infoMessage,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Black
                )

                Row(
                    modifier = Modifier.padding(15.dp),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    showDice(randomNumber)
                    Column(
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Button(
                            onClick = {
                                points--
                                val newNumber = Dice.throwDiceNFaces(6)
                                if (newNumber > randomNumber){
                                    points += 3
                                    infoMessage = context.getString(R.string.WinMessage)
                                }else{
                                    infoMessage = context.getString(R.string.LoseMessage)
                                }
                                randomNumber = newNumber
                            },
                            enabled = points > 0,
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Green
                            ),
                            modifier = Modifier.border(2.dp, Color.Black, shape = CircleShape)
                        ) {
                            Text(
                                text = "↑",
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Black
                            )

                        }

                        Button(

                            onClick = {
                                points--
                                val newNumber = Dice.throwDiceNFaces(6)
                                if (newNumber < randomNumber){
                                    points += 3
                                    infoMessage = context.getString(R.string.WinMessage)
                                }else{
                                    infoMessage = context.getString(R.string.LoseMessage)
                                }
                                randomNumber = newNumber
                            },
                            enabled = points > 0,
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Red
                            ),
                            modifier = Modifier.border(2.dp, Color.Black, shape = CircleShape)
                        ) {

                            Text(
                                text = "↓",
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Black
                            )
                        }

                    }


                }


                Column(

                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {

                    Text(
                        text = stringResource(R.string.panelNumbers),
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Button(
                            onClick = {
                                points -= 3
                                val newNumber = Dice.throwDiceNFaces(6)
                                if (newNumber == 1){
                                    points += 15
                                    infoMessage = context.getString(R.string.WinMessage)
                                }else{
                                    infoMessage = context.getString(R.string.LoseMessage)
                                }
                                randomNumber = newNumber

                            },
                            enabled = points > 0,
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFFFFAB40)
                            ),
                            border = BorderStroke(2.dp, Color.Black)
                        ) {

                            Text(
                                text = "1",
                                fontWeight = FontWeight.Black
                            )

                        }

                        Button(
                            onClick = {
                                points -= 3
                                val newNumber = Dice.throwDiceNFaces(6)
                                if (newNumber == 2){
                                    points += 15
                                    infoMessage = context.getString(R.string.WinMessage)
                                }else{
                                    infoMessage = context.getString(R.string.LoseMessage)
                                }
                                randomNumber = newNumber
                            },
                            enabled = points > 0,
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFFFFAB40)
                            ),
                            border = BorderStroke(2.dp, Color.Black)
                        ) {
                            Text(
                                text = "2",
                                fontWeight = FontWeight.Black

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
                                if (newNumber == 3){
                                    points += 15
                                    infoMessage = context.getString(R.string.WinMessage)
                                }else{
                                    infoMessage = context.getString(R.string.LoseMessage)
                                }
                                randomNumber = newNumber
                            },
                            enabled = points > 0,
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFFFFAB40)
                            ),
                            border = BorderStroke(2.dp, Color.Black)
                        ) {

                            Text(
                                text = "3",
                                fontWeight = FontWeight.Black

                            )

                        }

                        Button(
                            onClick = {
                                points -= 3
                                val newNumber = Dice.throwDiceNFaces(6)
                                if (newNumber == 4){
                                    points += 15
                                    infoMessage = context.getString(R.string.WinMessage)
                                }else{
                                    infoMessage = context.getString(R.string.LoseMessage)
                                }
                                randomNumber = newNumber
                            },
                            enabled = points > 0,
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFFFFAB40)
                            ),
                            border = BorderStroke(2.dp, Color.Black)
                        ) {

                            Text(
                                text = "4",
                                fontWeight = FontWeight.Black

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
                                if (newNumber == 5){
                                    points += 15
                                    infoMessage = context.getString(R.string.WinMessage)
                                }else{
                                    infoMessage = context.getString(R.string.LoseMessage)
                                }
                                randomNumber = newNumber
                            },
                            enabled = points > 0,
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFFFFAB40)
                            ),
                            border = BorderStroke(2.dp, Color.Black)
                        ) {

                            Text(
                                text = "5",
                                fontWeight = FontWeight.Black

                            )

                        }

                        Button(
                            onClick = {
                                points -= 3
                                val newNumber = Dice.throwDiceNFaces(6)
                                if (newNumber == 6){
                                    points += 15
                                    infoMessage = context.getString(R.string.WinMessage)
                                }else{
                                    infoMessage = context.getString(R.string.LoseMessage)
                                }
                                randomNumber = newNumber
                            },
                            enabled = points > 0,
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFFFFAB40)
                            ),
                            border = BorderStroke(2.dp, Color.Black)
                        ) {

                            Text(
                                text = "6",
                                fontWeight = FontWeight.Black
                            )
                        }
                    }

                    Row(

                        modifier = Modifier.padding(30.dp)

                    ) {

                        Text(
                            text = stringResource(R.string.points, points),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White

                        )

                    }

                    Button(
                        onClick = {

                            points = 20
                            playAgain = 0
                            infoMessage = ""
                        },
                        enabled = playAgain == 1,
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xDF00D5FF)
                        )

                    ) {
                        Text(
                            text = stringResource(R.string.playAgain),
                            fontWeight = FontWeight.Black
                        )

                    }


                    if (points <= 0) {

                        playAgain = 1
                        points = 0

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {

                            Spacer(modifier = Modifier.height(5.dp))

                            Text(
                                text = stringResource(R.string.gameOverMessage).trimIndent(),
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold

                            )

                        }

                        Column (){
                            Spacer(modifier = Modifier.height(87.dp))
                            Row (){

                                Spacer(modifier = Modifier.width(170.dp))

                                Text(
                                    text = stringResource(R.string.Autor),
                                    fontWeight = FontWeight.Black
                                )

                            }
                        }


                    }

                    Column (){
                        Spacer(modifier = Modifier.height(140.dp))
                        Row (){

                            Spacer(modifier = Modifier.width(170.dp))

                            Text(
                                text = stringResource(R.string.Autor),
                                fontWeight = FontWeight.Black
                            )

                        }
                    }


                }


            }


        }


    }
}