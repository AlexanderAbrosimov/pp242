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
        userService.save(new User("Oleg", 25, "oleg@mail.ru"));
        userService.save(new User("Vasily", 24, "vasily@mail.ru"));
    }
}
