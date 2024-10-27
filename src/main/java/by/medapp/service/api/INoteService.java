package by.medapp.service.api;

import by.medapp.core.entity.NoteEntity;

import java.util.List;

public interface INoteService {
    public List<NoteEntity> getAllNotes(String agency, String clientGuid);
}
