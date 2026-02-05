package com.example.noteapp

data class Note(
    val id: Long = System.currentTimeMillis(),
    val title: String,
    val body: String
)
