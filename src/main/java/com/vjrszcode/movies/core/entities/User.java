package com.vjrszcode.movies.core.entities;

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
@Table(name = "tb_users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "id.user")
    private Set<UserMovie> userMovies = new HashSet<>();

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Set<Movie> getMovies(){
        Set<Movie> movies = new HashSet<>();
        userMovies.forEach((um) -> movies.add(um.getMovie()));
        return movies;
    }
}
