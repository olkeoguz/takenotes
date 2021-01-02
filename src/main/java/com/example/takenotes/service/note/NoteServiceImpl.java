package com.example.takenotes.service.note;

import com.example.takenotes.domain.Note;
import com.example.takenotes.domain.NoteCreateForm;
import com.example.takenotes.repository.NoteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class NoteServiceImpl implements NoteService {

    private static final Logger LOGGER = LoggerFactory.getLogger(NoteServiceImpl.class);
    private final NoteRepository noteRepository;

    @Autowired
    public NoteServiceImpl(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }


    @Override
    public Collection<Note> getAllNotes() {
        LOGGER.debug("Getting all notes");
        return noteRepository.findAll();
    }

    @Override
    public Note create(NoteCreateForm form) {
        Note note = new Note();
        note.setTitle(form.getTitle());
        note.setContent(form.getContent());
        return noteRepository.save(note);
    }

}

