package com.vjrszcode.movies.adapters.presenters.user;

import com.vjrszcode.movies.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class UsersPresenter {

    private final List<UserPresenter> users;

    public static UsersPresenter fromListUsers(List<User> users){
        List<UserPresenter> listUsers = new ArrayList<>();
        users.forEach(user -> { listUsers.add(new UserPresenter(user)); });
        return new UsersPresenter(listUsers);
    }

}
