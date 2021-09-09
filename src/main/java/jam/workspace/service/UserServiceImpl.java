package jam.workspace.service;

import jam.workspace.dao.UserDao;
import jam.workspace.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User saveUser(User user) {
        return userDao.save(user);
    }
    @Override
    public List<User> getAllUsers() {
        return userDao.findAll();
    }
    @Override
    public void deleteUserById(int id ) {
        userDao.deleteById(id);
    }
    @Override
    public User getUserByName(String name) {
        List<User> users = userDao.findAll();
        for (User user : users) {
            if (user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }
    @Override
    public User getUserById(int id) {
        return userDao.findById(id).get();
    }
}
