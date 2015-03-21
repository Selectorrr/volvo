package com.volvo.metis.repository;

import com.volvo.metis.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

/**
 * Spring Data MongoDB repository for the User entity.
 */
public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findOneByEmail(String email);

    Optional<User> findOneByLogin(String login);

    void delete(User t);

}
