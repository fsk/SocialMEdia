package com.fsk.service;

import com.fsk.entity.User;
import com.fsk.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void save(User user) {
        userRepository.save(user);
    }

    public void update(User user) {
        userRepository.save(user);
    }


    public Optional<User> findByUsernameAndPassword(String username, String password) {
        return Optional.ofNullable(userRepository.findByUsernameAndPassword(username, password)
                .orElseThrow(() -> new IllegalArgumentException("Kullanici adi ya da sifre hatali")));
    }


}
