package com.vjrszcode.movies.core.useCases.user;

import com.vjrszcode.movies.core.entities.User;
import com.vjrszcode.movies.core.useCases.UseCase;
import lombok.Value;

public interface GetByIdUserUseCase extends UseCase<GetByIdUserUseCase.InputValues, GetByIdUserUseCase.OutputValues> {

    @Value
    class InputValues implements InputUseCase {
        Long id;
    }

    @Value
    class OutputValues implements OutputUseCase {
        User user;
    }
}
