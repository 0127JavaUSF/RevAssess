package Views;

import model.User;

import java.util.Set;

public interface CrudRepository<T> {

    public T save(T t);
    public Set<User> findAll();
    public T findById(int id);
    public boolean update(T t);
    public boolean deleteById(int id);
}
