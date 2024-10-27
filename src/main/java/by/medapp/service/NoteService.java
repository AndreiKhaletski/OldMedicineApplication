package by.medapp.service;

import by.medapp.core.NoteRequest;
import by.medapp.core.dto.NoteDTO;
import by.medapp.core.entity.NoteEntity;
import by.medapp.dao.IClientResource;
import by.medapp.dao.INoteResource;
import by.medapp.service.api.INoteService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class NoteService implements INoteService {

    private final INoteResource noteResource;

    public NoteService(INoteResource noteResource) {
        this.noteResource = noteResource;
    }

    @Override
    public List<NoteEntity> getAllNotes(String agency, String clientGuid) {
        return noteResource.findByAgencyAndClientGuid(agency, clientGuid);
    }
}
