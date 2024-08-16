package library.man.app.library.services;

import library.man.app.library.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public User createUser(User user);

    public List<User> getUsers();

    public Optional<User> getUserById(int id);
}
