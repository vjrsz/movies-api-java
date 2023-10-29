package com.vjrszcode.movies.infra.controlllers;

import com.vjrszcode.movies.adapters.presenters.user.UserPresenter;
import com.vjrszcode.movies.adapters.presenters.user.UsersPresenter;
import com.vjrszcode.movies.adapters.resources.UserResource;
import com.vjrszcode.movies.core.useCases.user.GetAllUserUseCase;
import com.vjrszcode.movies.core.useCases.user.GetByIdUserUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
@AllArgsConstructor
public class UserController implements UserResource {

    private final GetAllUserUseCase getAllUserUseCase;
    private final GetByIdUserUseCase getByIdUserUseCase;

    @GetMapping
    public ResponseEntity<UsersPresenter> getAll(){
        UsersPresenter usersPresenter = UsersPresenter.fromListUsers(getAllUserUseCase.execute(new GetAllUserUseCase.InputValues()).getUsers());

        return ResponseEntity.ok().body(usersPresenter);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserPresenter> getById(@PathVariable Long id){
        UserPresenter userPresenter = new UserPresenter(getByIdUserUseCase.execute(new GetByIdUserUseCase.InputValues(id)).getUser());
        return ResponseEntity.ok().body(userPresenter);
    }
}
