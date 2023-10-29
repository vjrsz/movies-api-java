package com.vjrszcode.movies.core.useCases.user;

import com.vjrszcode.movies.core.entities.User;
import com.vjrszcode.movies.core.useCases.UseCase;
import lombok.Value;

import java.util.List;

public interface GetAllUserUseCase extends UseCase<GetAllUserUseCase.InputValues, GetAllUserUseCase.OutputValues>{
    @Value
    class InputValues implements InputUseCase { }

    @Value
    class OutputValues implements OutputUseCase {
        List<User> users;
    }

}
