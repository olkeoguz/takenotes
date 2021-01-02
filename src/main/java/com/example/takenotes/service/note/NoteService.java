package com.example.takenotes.service.note;

import com.example.takenotes.domain.Note;
import com.example.takenotes.domain.NoteCreateForm;

import java.util.Collection;

public interface NoteService {
    Collection<Note> getAllNotes();

    Note create(NoteCreateForm noteCreateForm);
}
