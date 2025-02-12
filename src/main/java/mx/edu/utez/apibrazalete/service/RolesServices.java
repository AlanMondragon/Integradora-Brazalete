package mx.edu.utez.apibrazalete.service;

import mx.edu.utez.apibrazalete.repository.RolesRepository;
import mx.edu.utez.apibrazalete.rol.RolesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolesServices {

    @Autowired
    private RolesRepository rolesRepository;

    public RolesEntity saveRol(RolesEntity rolesEntity) {
        return rolesRepository.save(rolesEntity);
    }

}
