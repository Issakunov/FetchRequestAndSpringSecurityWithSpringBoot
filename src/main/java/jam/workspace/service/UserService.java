package jam.workspace.service;

import jam.workspace.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(int id);
    User saveUser(User user);
    void deleteUserById(int id);
    User getUserByName(String name);
}
