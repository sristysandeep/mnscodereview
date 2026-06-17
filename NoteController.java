
package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.model.Note;

import java.util.*;

@RestController
@RequestMapping("/notes")
public class NoteController {

    private List<Note> notes = new ArrayList<>();

    @PostMapping
    public Note createNote(@RequestBody Note note) {
        note.setId(new Random().nextInt(1000));
        notes.add(note);
        return note;
    }

    @GetMapping("/{id}")
    public Note getNote(@PathVariable int id) {
        for (Note note : notes) {
            if (note.getId() == id) {
                return note;
            }
        }
        return null;
    }
}
