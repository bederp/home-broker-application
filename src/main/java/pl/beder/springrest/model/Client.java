package pl.beder.springrest.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Client extends AbstractModel {

    private final String firstName;
    private final String lastName;

    public Client(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
