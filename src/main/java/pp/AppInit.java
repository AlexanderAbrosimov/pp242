package pp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pp.service.UserService;

@Component
public class AppInit {

    UserService userService;

    @Autowired
    public void setUserDAO(UserService userService) {
        this.userService = userService;
    }

//    @Bean
//    void addUsers() {
//        userService.save(new User());
//    }
}
