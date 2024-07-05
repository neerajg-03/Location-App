package com.example.musicapp

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable

@Composable
fun Browse(){
    val category = listOf("Romantic", "Soothing", "Punjabi", "Party", "TGIF", "Yoga")
    LazyVerticalGrid(GridCells.Fixed(2)) {
        items(category) { cat ->
            BrowserItem(cat = cat, drawable = R.drawable.baseline_apps_24)
        }
    }
}