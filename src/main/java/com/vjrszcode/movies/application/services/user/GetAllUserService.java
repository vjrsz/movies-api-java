package com.vjrszcode.movies.application.services.user;

import com.vjrszcode.movies.adapters.repositories.UserRepository;
import com.vjrszcode.movies.core.useCases.user.GetAllUserUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetAllUserService implements GetAllUserUseCase {
    private final UserRepository repository;

    @Override
    public OutputValues execute(InputValues input) {
        return new OutputValues(repository.getAll());
    }
}
