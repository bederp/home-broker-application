package pl.beder.springrest.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.beder.springrest.model.Client;
import pl.beder.springrest.repositories.ClientRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class ClientService {

    private ClientRepository repository;

    public List<Client> getClients() {
        return repository.getAll();
    }

    public Client getClient(int id) {
        return repository.findById(id);
    }

    public Client add(Client client) {
        return repository.add(client);
    }

    public Client updateById(int id, Client client) {
        return repository.updateById(id, client);
    }

    public Client deleteById(int id) {
        return repository.deleteById(id);
    }
}
