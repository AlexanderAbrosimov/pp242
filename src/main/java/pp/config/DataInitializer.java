package pp.config;

import org.springframework.stereotype.Component;
import pp.models.Role;
import pp.models.User;
import pp.service.RoleService;
import pp.service.UserService;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Component
public class DataInitializer {
    private final UserService userService;
    private final RoleService roleService;

    public DataInitializer(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }


    @PostConstruct
    private void init() {

        User user = new User();
        Role role = new Role();
        Set<Role> roles = new HashSet<>();
        role.setRole("ROLE_ADMIN");
        roles.add(role);
        user.setUsername("root");
        user.setPassword("1");
        user.setRoles(roles);
        userService.save(user);


    }
}
