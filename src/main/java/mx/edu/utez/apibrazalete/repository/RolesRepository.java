package mx.edu.utez.apibrazalete.repository;

import mx.edu.utez.apibrazalete.rol.RolesEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends MongoRepository<RolesEntity, String> {
}
