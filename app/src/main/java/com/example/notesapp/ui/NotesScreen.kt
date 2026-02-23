
package com.example.notesapp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.notesapp.viewmodel.NotesViewModel
import com.example.notesapp.data.Note

@Composable
fun NotesScreen(viewModel: NotesViewModel) {

    val notes by viewModel.notes.collectAsState()
    var showDialog by remember { mutableStateOf(false) }

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { showDialog = true }) {
                Text("+")
            }
        }
    ) { padding ->

        LazyColumn(
            modifier = Modifier
                .padding(padding)
                .padding(8.dp)
        ) {
            items(notes) { note ->
                NoteItem(note, onDelete = { viewModel.deleteNote(note) })
            }
        }

        if (showDialog) {
            AddNoteDialog(
                onDismiss = { showDialog = false },
                onSave = { title, content ->
                    viewModel.addNote(title, content)
                    showDialog = false
                }
            )
        }
    }
}
