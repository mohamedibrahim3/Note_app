package com.example.noteapp.feature_note.data.repository

import com.example.noteapp.feature_note.data.data_sourse.NoteDao
import com.example.noteapp.feature_note.domain.model.Note
import com.example.noteapp.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow


class NoteRepositoryImpl(
    private val dao: NoteDao
):NoteRepository {
    override fun getNote(): Flow<List<Note>> {
        return dao.getNote()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }
}