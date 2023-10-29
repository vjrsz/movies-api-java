package com.vjrszcode.movies.core.entities;

import com.vjrszcode.movies.core.entities.enums.MovieStatus;
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
@Table(name = "tb_movies")
public class Movie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private MovieStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    public Movie(Long id, String name, String description, MovieStatus status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
    }
}
