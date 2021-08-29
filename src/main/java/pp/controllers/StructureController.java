package pp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pp.service.UserService;

import java.security.Principal;

@Controller
@RequestMapping(value = "/")
public class StructureController {

    private UserService userService;

    public StructureController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginPage() {
        return "users/login";
    }

}
