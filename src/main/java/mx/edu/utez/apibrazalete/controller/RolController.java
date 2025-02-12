package mx.edu.utez.apibrazalete.controller;

import mx.edu.utez.apibrazalete.rol.RolesEntity;
import mx.edu.utez.apibrazalete.service.RolesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rol")
public class RolController {
    @Autowired
    private RolesServices services;

    @PostMapping("/save")
    public RolesEntity saveRole(@RequestBody RolesEntity role) {
        return services.saveRol(role);
    }

}
