package mx.edu.utez.apibrazalete.service;

import mx.edu.utez.apibrazalete.entitys.Users;
import mx.edu.utez.apibrazalete.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersServices {

    @Autowired
    private UsersRepository usersRepository;

    public List<Users> getAllUsers(){
        return usersRepository.findAll();
    }

    public Users getUserById(String id){
        Optional<Users> user = usersRepository.findById(id);
        return user.orElse(null);
    }

    public Users addUser(Users user){
        return usersRepository.save(user);
    }

}
