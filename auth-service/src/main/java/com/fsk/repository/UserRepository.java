package com.fsk.repository;

import com.fsk.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Kullanıcının oturum açabilmesi için kullanılır.
     * @param username
     * @param password
     * @return
     */
    Optional<User> findByUsernameAndPassword(String username, String password);
}
