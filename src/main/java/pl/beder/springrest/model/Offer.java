package pl.beder.springrest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Offer extends AbstractModel {

    private int ownerId;
    private HomeType homeType;
    private City city;
    private String street;
    private double size;
    private int rooms;

    public Offer() {
        super();
    }


    public Offer(Client client, HomeType homeType, City city, String street, double size, int rooms) {
        this.ownerId = client.id;
        this.homeType = homeType;
        this.city = city;
        this.street = street;
        this.size = size;
        this.rooms = rooms;
    }
}
