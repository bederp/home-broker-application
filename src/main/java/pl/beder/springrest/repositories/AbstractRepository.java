package pl.beder.springrest.repositories;

import pl.beder.springrest.model.AbstractModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AbstractRepository<E extends AbstractModel> {

    final protected Map<Integer, E> repository = new HashMap<>();

    public List<E> getAll() {
        return new ArrayList<>(repository.values());
    }

    public E findById(int id) {
        return repository.get(id);
    }

    public E add(E element) {
        repository.put(element.getId(), element);
        return repository.get(element.getId());
    }

    public E deleteById(int id) {
        return repository.remove(id);
    }

    public E updateById(int id, E element) {
        return repository.put(id, element);
    }


}
