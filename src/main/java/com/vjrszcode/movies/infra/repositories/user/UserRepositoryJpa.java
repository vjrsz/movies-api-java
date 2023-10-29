package com.vjrszcode.movies.infra.repositories.user;

import com.vjrszcode.movies.core.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryJpa extends JpaRepository<User, Long> {
}
