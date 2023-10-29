package com.vjrszcode.movies.core.entities;

import com.vjrszcode.movies.core.entities.enums.MovieStatus;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Table(name = "tb_movies")
public class Movie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private MovieStatus status;

    @OneToMany(mappedBy = "id.movie")
    private Set<UserMovie> userMovies = new HashSet<>();

    public Movie(Long id, String name, String description, MovieStatus status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
    }

    public Set<User> getUsers(){
        Set<User> users = new HashSet<>();
        userMovies.forEach((um) -> users.add(um.getUser()));
        return users;
    }
}
