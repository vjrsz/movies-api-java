package com.vjrszcode.movies.core.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "tb_users")
@ToString
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private Set<Movie> movie;

    public User(Long id, String name) {
        this.id = id;
        Name = name;
    }
}
