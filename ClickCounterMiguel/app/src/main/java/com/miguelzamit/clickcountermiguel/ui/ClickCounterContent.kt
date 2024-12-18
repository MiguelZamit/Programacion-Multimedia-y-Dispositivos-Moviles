package com.miguelzamit.clickcountermiguel.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.miguelzamit.clickcountermiguel.ui.theme.ClickCounterMiguelTheme

@Composable
fun ClickCounterContent(content: @Composable (modifier: Modifier) -> Unit){
    ClickCounterMiguelTheme {
        Scaffold (
            modifier = Modifier.fillMaxSize()
        ){  innerPadding ->
            content(Modifier.padding(innerPadding))
        }
    }
}