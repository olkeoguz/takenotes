package com.example.takenotes.controller;

import com.example.takenotes.domain.NoteCreateForm;
import com.example.takenotes.service.note.NoteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("note")
public class NoteController {
    private static final Logger LOGGER = LoggerFactory.getLogger(NoteController.class);
    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }
    @GetMapping(value = "/create")
    public ModelAndView getNoteCreatePage() {
        LOGGER.debug("Getting note create form");
        return new ModelAndView("note_create", "form", new NoteCreateForm());
    }

    @PostMapping(value = "/create")
    public String handleNoteCreateForm(@Valid @ModelAttribute("form") NoteCreateForm form, BindingResult bindingResult) {
        LOGGER.debug("Processing note create form={}, bindingResult={}", form, bindingResult);
        if (bindingResult.hasErrors()) {
            // failed validation
            return "note_create";
        }
        noteService.create(form);
        return "redirect:/notes";
    }
}
