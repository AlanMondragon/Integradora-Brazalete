package mx.edu.utez.apibrazalete.repository;

import mx.edu.utez.apibrazalete.entitys.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends MongoRepository<Users, String> {

    Users findByUsername(String username);

}
