package by.medapp.controller;

import by.medapp.core.NoteRequest;
import by.medapp.core.entity.NoteEntity;
import by.medapp.service.NoteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping("/notes")
    public List<NoteEntity> getNotes(@RequestBody NoteRequest request) {
        return noteService.getAllNotes(request.getAgency(), request.getClientGuid());
    }
}
