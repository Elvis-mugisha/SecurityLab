package application.controller;

import application.model.UserModel;
import application.service.UserServices; // Ensure the service name matches your updated service class

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserServices userService; // Ensure this is the correct service class name

    @PostMapping
    public ResponseEntity<UserModel> createUser(@Valid @RequestBody UserModel user) {
        UserModel createdUser = userService.saveUser(user);
        System.out.println(createdUser);
        return ResponseEntity.ok(createdUser);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<UserModel>> getUserById(@PathVariable int id) {
        Optional<UserModel> user = userService.getUserById(id); // Correct method name to getUserById
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build(); // Return 404 Not Found if user is null
        }
    }

    @GetMapping
    public ResponseEntity<List<UserModel>> getAllUsers() {
        List<UserModel> users = userService.getAllUsers(); // Corrected variable name to users
        return ResponseEntity.ok(users);
    }
}
