package mx.edu.utez.apibrazalete.service;

import mx.edu.utez.apibrazalete.entitys.UsersEntity;
import mx.edu.utez.apibrazalete.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.LookupOperation;
import org.springframework.data.mongodb.core.aggregation.MatchOperation;
import org.springframework.data.mongodb.core.aggregation.UnwindOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersServices {

    @Autowired
    private UsersRepository usersRepository;


    public List<UsersEntity> getAllUsers(){
        return usersRepository.findAll();
    }

    public UsersEntity getUserById(String id){
        Optional<UsersEntity> user = usersRepository.findById(id);
        return user.orElse(null);
    }

    public UsersEntity addUser(UsersEntity user){
        return usersRepository.save(user);
    }

    public UsersEntity updateUser(UsersEntity user){
         getUserById(user.getId());
         return usersRepository.save(user);
    }


}
