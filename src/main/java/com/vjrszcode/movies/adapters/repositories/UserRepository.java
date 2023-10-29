package com.vjrszcode.movies.adapters.repositories;

import com.vjrszcode.movies.core.entities.User;

import java.util.List;

public interface UserRepository {
    List<User> getAll();
    List<User> saveAll(List<User> movies);
    User findById(Long id);
}
