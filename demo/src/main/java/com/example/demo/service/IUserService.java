package com.example.demo.service;

import com.example.demo.model.User;

import java.util.Optional;

public interface IUserService {
    Iterable<User> findAll();
    User save (User user);
    User remove (Long id);
    Optional<User> findById(Long id);
}
