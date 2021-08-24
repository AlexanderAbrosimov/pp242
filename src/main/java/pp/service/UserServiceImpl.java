package pp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pp.dao.UserDAO;
import pp.models.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    UserDAO userDAO;

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> index() {
        return userDAO.index();
    }

    @Override
    public User show(int id) {
        return userDAO.show(id);
    }

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public void update(int id, User updatedUser) {
        userDAO.update(id, updatedUser);
    }

    @Override
    public void delete(int id) {
        userDAO.delete(id);
    }
}
