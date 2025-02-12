package mx.edu.utez.apibrazalete.repository;

import mx.edu.utez.apibrazalete.entitys.UsersEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends MongoRepository<UsersEntity, String> {

    UsersEntity findByUsername(String username);

}
