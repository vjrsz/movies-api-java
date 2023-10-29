package com.vjrszcode.movies.adapters.resources;

import com.vjrszcode.movies.adapters.presenters.user.UserPresenter;
import com.vjrszcode.movies.adapters.presenters.user.UsersPresenter;
import org.springframework.http.ResponseEntity;

public interface UserResource {
    public ResponseEntity<UsersPresenter> getAll();
    public ResponseEntity<UserPresenter> getById(Long id);

}
