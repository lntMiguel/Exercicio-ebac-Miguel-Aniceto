package br.com.miguel.ebac.memelandia_users.service;

import br.com.miguel.ebac.memelandia_users.models.User;
import br.com.miguel.ebac.memelandia_users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user){
        return userRepository.insert(user);
    }

    public List<User> listarTodos(){

        return userRepository.findAll();

    }

    public boolean findById(String id){
        Optional<User> userOptional = userRepository.findById(id);

        return userOptional.isPresent();

    }

}
