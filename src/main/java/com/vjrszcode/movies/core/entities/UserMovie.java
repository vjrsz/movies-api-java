package com.vjrszcode.movies.core.entities;

import com.vjrszcode.movies.core.entities.pk.UserMoviePK;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Table(name = "tb_user_movie")
public class UserMovie implements Serializable{
    @EmbeddedId
    private UserMoviePK id = new UserMoviePK();

    public UserMovie(User user, Movie movie) {
        id.setUser(user);
        id.setMovie(movie);
    }

    public Movie getMovie(){
        return id.getMovie();
    }

    public User getUser(){
        return id.getUser();
    }
}
