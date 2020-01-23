package pl.beder.springrest.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.beder.springrest.model.Client;
import pl.beder.springrest.services.ClientService;

import java.util.List;

@RestController
@RequestMapping("/client")
@AllArgsConstructor
public class ClientController {


    private ClientService service;

    @GetMapping
    List<Client> getClients() {
        return service.getClients();
    }

    @GetMapping("/{id}")
    Client getClient(@PathVariable int id) {
        return service.getClient(id);
    }

    @PostMapping("/create")
    Client createClient(@RequestBody Client client) {
        return service.add(client);
    }

    @PutMapping("/{id}")
    Client updateById(@PathVariable int id, @RequestBody Client client) {
        return service.updateById(id, client);
    }

    @DeleteMapping("/{id}")
    Client deleteById(@PathVariable int id) {
        return service.deleteById(id);
    }

}
