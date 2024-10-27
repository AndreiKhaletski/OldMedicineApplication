package by.medapp.dao;

import by.medapp.core.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClientResource extends JpaRepository<ClientEntity, Long> {
}
