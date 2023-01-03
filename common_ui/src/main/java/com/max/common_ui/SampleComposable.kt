package com.max.common_ui

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun SampleComposable() {
    Text("This composable came from common ui library!", color = Color.Green, softWrap = true)
}
