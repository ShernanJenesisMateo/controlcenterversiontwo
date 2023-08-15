package controlcenterversiontwopackage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import controlcenterversiontwopackage.service.UserDaoImpl;
import controlcenterversiontwopackage.model.User;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class UserController {

    private UserDaoImpl userDaoImpl;

    public UserController(UserDaoImpl userDaoImpl) {
        this.userDaoImpl = userDaoImpl;
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userDaoImpl.findAll();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = userDaoImpl.getUserById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/user/create")
    public String createUser(@RequestBody User user) {
        userDaoImpl.insertUser(user);
        return "User created successfully";
    }

    @PostMapping("/user/createBatch")
    public String createUser(@RequestBody List<User> user) {
        userDaoImpl.insertUserBatch(user);
        return "Multiple users created successfully";
    }
    
    @GetMapping("/")
    public String greet(){
        return "Hello!";
    }
    
}

