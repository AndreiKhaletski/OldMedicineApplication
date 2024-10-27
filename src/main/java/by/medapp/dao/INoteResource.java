package by.medapp.dao;

import by.medapp.core.entity.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface INoteResource extends JpaRepository<NoteEntity, Long> {
    List<NoteEntity> findByAgencyAndClientGuid(String agency, String clientGuid);
}
