package com.vjrszcode.movies.infra.repositories.user;

import com.vjrszcode.movies.adapters.repositories.UserRepository;
import com.vjrszcode.movies.core.entities.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final UserRepositoryJpa repository;

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }

    @Override
    public List<User> saveAll(List<User> users) {
        return repository.saveAll(users);
    }

    @Override
    public User findById(Long id) {
        return repository.findById(id).get();
    }
}
