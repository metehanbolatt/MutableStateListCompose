package com.metehanbolat.mutablestatelistcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HomeScreen(homeViewModel: HomeViewModel = viewModel()) {

    val elements = homeViewModel.elements

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(state = rememberScrollState())
    ) {
        Button(
            onClick = {
                homeViewModel.addElement()
            }
        ) {
            Text(text = "Add the number")
        }
        elements.forEach {
            Text(
                text = "Number: $it",
                style = TextStyle(
                    fontSize = MaterialTheme.typography.h6.fontSize,
                    fontWeight = FontWeight.Bold
                )
            )
        }
    }
}