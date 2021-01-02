package com.example.takenotes.repository;

import com.example.takenotes.domain.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface NoteRepository extends JpaRepository<Note, Long> {

}

