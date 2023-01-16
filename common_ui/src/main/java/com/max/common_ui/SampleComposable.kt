package com.max.common_ui

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun SampleComposable() {
    Text("This composable came from git submodule!", color = Color.Blue, softWrap = true, maxLines = 4)
}
