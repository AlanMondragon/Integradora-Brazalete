package mx.edu.utez.apibrazalete.controller;

import mx.edu.utez.apibrazalete.entitys.Users;
import mx.edu.utez.apibrazalete.repository.UsersRepository;
import mx.edu.utez.apibrazalete.service.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UsersController {
    @Autowired
    private UsersServices usersServices;

    @GetMapping()
    public List<Users> getAllUsers() {
        return usersServices.getAllUsers();
    }

    @PostMapping()
    public Users createUser(@RequestBody Users user) {
        return usersServices.addUser(user);
    }

    @GetMapping("/{id}")
    public Users getUserById(@PathVariable("id") String id) {
        return usersServices.getUserById(id);
    }

}
