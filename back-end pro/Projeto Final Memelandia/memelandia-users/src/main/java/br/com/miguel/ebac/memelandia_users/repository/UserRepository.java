package br.com.miguel.ebac.memelandia_users.repository;


import br.com.miguel.ebac.memelandia_users.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
