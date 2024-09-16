package library.man.app.library.controllers;

import library.man.app.library.models.User;
import library.man.app.library.servicesImpl.UserServiceImpl;
import library.man.app.library.utils.ResponseObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/users/")
@CrossOrigin(origins="http://localhost:3000")
public class UserController {

    @Autowired
    public UserServiceImpl userService;

    @PostMapping("")
    public ResponseObj createUser(@RequestBody User user) {
        System.out.println("User "+ user.getUserName() + " " + user.getName() + " " + user.getPhoneNumber());
        User newUser = userService.createUser(user);
        ResponseObj response;

        if(newUser != null) {
            response = new ResponseObj(201, "User Registered Successfully");
        } else {
            response = new ResponseObj(500, "User Registration failed / Internal server error");
        }

        return response;
    }

    @GetMapping("")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("{id}")
    public Optional<User> getUserById(@PathVariable("id") int id) {
        return userService.getUserById(id);
    }

    @PutMapping("/")
    public String updateUser() {
        return "";
    }

    @DeleteMapping("/")
    public String deleteUser() {
        return "";
    }
}
