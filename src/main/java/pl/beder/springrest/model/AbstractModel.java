package pl.beder.springrest.model;

import lombok.Data;

@Data
public abstract class AbstractModel {

    protected static int lastId = 0;
    protected int id;

    public AbstractModel() {
        lastId++;
        this.id = lastId;
    }
}
