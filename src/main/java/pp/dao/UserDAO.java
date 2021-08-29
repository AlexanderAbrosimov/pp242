package pp.dao;

import pp.models.Role;
import pp.models.User;
import java.util.List;

public interface UserDAO {

    List<User> index();
    User show(int id);
    void save(User user);
    void update(User user);
    void delete(int id);
    User getUserByName(String name);

}
