package pp.config;

import org.springframework.stereotype.Component;
import pp.models.User;
import pp.service.UserService;

import javax.annotation.PostConstruct;

@Component
public class DataInitializer {
    private final UserService userService;

    public DataInitializer(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    private void init() {

        User user = new User();
        user.setName("Oleg");
        user.setAge(25);
        user.setEmail("oleg@mail.ru");
        userService.save(user);

        User user2 = new User();
        user2.setName("Vasily");
        user2.setAge(24);
        user2.setEmail("vasily@mail.ru");
        userService.save(user2);

    }
}
