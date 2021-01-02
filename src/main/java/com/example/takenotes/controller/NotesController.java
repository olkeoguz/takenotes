package com.example.takenotes.controller;

import com.example.takenotes.service.note.NoteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NotesController {
    private static final Logger LOGGER = LoggerFactory.getLogger(NotesController.class);
    private final NoteService noteService;

    @Autowired
    public NotesController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping("/notes")
    public ModelAndView getNotesPage() {
        LOGGER.debug("Getting notes page");
        return new ModelAndView("notes", "notes", noteService.getAllNotes());
    }
}
