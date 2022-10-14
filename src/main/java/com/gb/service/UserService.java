package com.gb.service;

import com.gb.persist.User;
import com.gb.persist.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.userRepository.save(new User("John Smith"));
        this.userRepository.save(new User("Christopher Brandt"));
        this.userRepository.save(new User("Oliver Watson"));
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> findById(long id) {
        return userRepository.findById(id);
    }

}
