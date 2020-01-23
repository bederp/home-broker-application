package pl.beder.springrest.utils;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.beder.springrest.model.City;
import pl.beder.springrest.model.Client;
import pl.beder.springrest.model.HomeType;
import pl.beder.springrest.model.Offer;
import pl.beder.springrest.repositories.ClientRepository;
import pl.beder.springrest.repositories.OfferRepository;

@AllArgsConstructor
@Component
public class BootStrap {

    private ClientRepository clientRepository;
    private OfferRepository offerRepository;

    public void initializeRepository() {
        Client jan = addClient("Jan", "Nowak");
        Client adam = addClient("Adam", "Kowalski");

        addOffer(adam.getId(), HomeType.HOUSE, City.WARSZAWA, "Testowa 1", 120.0, 6);
        addOffer(adam.getId(), HomeType.FLAT, City.WARSZAWA, "Testowa 10", 30.0, 3);
        addOffer(jan.getId(), HomeType.HOUSE, City.KATOWICE, "Testowa 10", 30.0, 2);
        addOffer(jan.getId(), HomeType.APARTMENT, City.KRAKÓW, "Testowa 20", 80.0, 4);
    }

    private void addOffer(int id, HomeType house, City warszawa, String street, double size, int rooms) {
        offerRepository.add(Offer.builder()
                .ownerId(id)
                .homeType(house)
                .city(warszawa)
                .street(street)
                .size(size)
                .rooms(rooms)
                .build());
    }

    private Client addClient(String firstName, String lastName) {
        return clientRepository.add(Client.builder()
                .firstName(firstName)
                .lastName(lastName)
                .build());
    }
}
