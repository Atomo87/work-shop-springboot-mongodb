package com.leandroramos.workshopmongo.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.leandroramos.workshopmongo.domain.User;
//   parametro mongo repository primeiro objeto segundo tipo do id
@Repository
public interface UserRepository extends MongoRepository<User, String>{
}
