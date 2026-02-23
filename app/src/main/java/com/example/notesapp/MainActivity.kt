
package com.example.notesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.notesapp.data.NoteDatabase
import com.example.notesapp.viewmodel.NotesViewModel
import com.example.notesapp.ui.NotesScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val dao = NoteDatabase.getDatabase(this).noteDao()

        setContent {
            val viewModel: NotesViewModel = viewModel(
                factory = object : ViewModelProvider.Factory {
                    override fun <T : ViewModel> create(modelClass: Class<T>): T {
                        return NotesViewModel(dao) as T
                    }
                }
            )
            NotesScreen(viewModel)
        }
    }
}
