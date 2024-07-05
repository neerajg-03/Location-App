package com.example.musicapp

import androidx.annotation.DrawableRes
//This annotation is often used in Android development with Kotlin.
// It indicates that the integer value stored in icon is expected to refer to a drawable resource ID.
data class Lib(@DrawableRes val icon: Int, val name:String)

val libraries = listOf<Lib>(
    Lib(R.drawable.ic_playlist_green, "Playlist"),
    Lib(R.drawable.ic_microphone,"Artists"),
    Lib(R.drawable.ic_baseline_album_24,"Album"), Lib(
        R.drawable.ic_baseline_music_note_24,"Songs"
    ),Lib(R.drawable.ic_genre,"Genre")
)