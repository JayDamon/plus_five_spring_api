package plusfive.spring_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import plusfive.spring_api.model.User;
import plusfive.spring_api.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public Iterable<User> getUsers() {
        Iterable<User> users = userRepository.findAll();
        if (users == null) {
            //ToDo Return error if necessary
        }
        return users;
    }
}
