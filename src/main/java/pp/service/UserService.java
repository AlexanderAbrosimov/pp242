package pp.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import pp.models.Role;
import pp.models.User;

import java.util.List;

public interface UserService extends UserDetailsService {

    List<User> index();
    User show(int id);
    void save(User user);
    void update(User user);
    void delete(int id);

}
