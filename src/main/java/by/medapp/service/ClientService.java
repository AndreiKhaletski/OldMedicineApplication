package by.medapp.service;

import by.medapp.core.dto.ClientDTO;
import by.medapp.core.entity.ClientEntity;
import by.medapp.dao.IClientResource;
import by.medapp.service.api.IClientService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ClientService implements IClientService {

    private final IClientResource clientResource;

    public ClientService(IClientResource clientResource) {
        this.clientResource = clientResource;
    }

    @Override
    public List<ClientEntity> getAllClients() {
        return clientResource.findAll();
    }
}
