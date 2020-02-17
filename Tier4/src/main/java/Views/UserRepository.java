package Views;

import model.User;

import java.util.Set;

public abstract class UserRepository implements CrudRepository<User>  {
    @Override
    public User save(User t) {


        return null;
    }

    @Override
    public Set<User> findAll() {
        return null;
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public boolean update(User t) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
