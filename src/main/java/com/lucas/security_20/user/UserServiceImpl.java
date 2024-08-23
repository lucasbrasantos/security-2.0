package com.lucas.security_20.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Autowired
    UserRepository userRepository;

    @Override
    public User create(User user){
        User exitingUser = userRepository.findByUsername(user.getUsername());

        if (exitingUser != null) {
            throw new RuntimeException("User already exists");
        }

        user.setPassword(passwordEncoder().encode(user.getPassword()));
        User createdUser = userRepository.save(user);
        return createdUser;
    }
}
