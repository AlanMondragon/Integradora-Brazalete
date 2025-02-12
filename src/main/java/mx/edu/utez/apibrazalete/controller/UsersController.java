package mx.edu.utez.apibrazalete.controller;

import jakarta.validation.Valid;
import mx.edu.utez.apibrazalete.entitys.UsersEntity;
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
    public List<UsersEntity> getAllUsers() {
        return usersServices.getAllUsers();
    }

    @PostMapping()
    public UsersEntity createUser( @RequestBody UsersEntity user) {
        return usersServices.addUser(user);
    }

    @GetMapping("/{id}")
    public UsersEntity getUserById(@PathVariable("id") String id) {
        return usersServices.getUserById(id);
    }

}
