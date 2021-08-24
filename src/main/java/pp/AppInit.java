package pp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import pp.dao.UserDAO;
import pp.models.User;

@Component
public class AppInit {

    UserDAO userDAO;

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

//    @Bean
//    void addUsers() {
//        userDAO.save(new User());
//    }
}
