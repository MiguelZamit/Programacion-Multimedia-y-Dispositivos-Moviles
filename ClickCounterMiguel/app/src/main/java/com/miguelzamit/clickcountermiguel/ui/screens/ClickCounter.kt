package com.miguelzamit.clickcountermiguel.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.miguelzamit.clickcountermiguel.R

@Composable
fun ClickCounter(modifier: Modifier = Modifier) {

    var times by rememberSaveable() { mutableIntStateOf(0) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .then(modifier),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )

    {
        Text(
            text = stringResource(R.string.text_nTimes, times),
            fontSize = 25.sp
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {

                times++

            })

        {
            Text(
                text = stringResource(R.string.ClickMeButton),
                fontSize = 30.sp,
                modifier = Modifier.padding(16.dp)
            )


        }

        Button(
            onClick = {

                times--

            })

        {
            Text(
                text = "Restar",
                fontSize = 30.sp,
                modifier = Modifier.padding(16.dp)
            )


        }

        Button(
            onClick = {

                times = 0

            })

        {
            Text(
                text = "Volver a 0",
                fontSize = 30.sp,
                modifier = Modifier.padding(16.dp)
            )


        }


    }


}