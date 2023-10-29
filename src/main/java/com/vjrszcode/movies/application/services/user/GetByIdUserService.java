package com.vjrszcode.movies.application.services.user;

import com.vjrszcode.movies.adapters.repositories.UserRepository;
import com.vjrszcode.movies.core.useCases.user.GetByIdUserUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetByIdUserService implements GetByIdUserUseCase {
    private final UserRepository repository;

    @Override
    public OutputValues execute(InputValues input) {
        return new OutputValues(repository.findById(input.getId()));
    }
}
