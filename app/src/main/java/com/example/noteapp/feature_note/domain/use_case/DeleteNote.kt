package com.example.noteapp.feature_note.domain.use_case

import com.example.noteapp.feature_note.domain.model.Note
import com.example.noteapp.feature_note.domain.repository.NoteRepository

class DeleteNote(
    private val repo:NoteRepository
) {
    suspend operator fun invoke(note: Note){
        repo.deleteNote(note)
    }
}