package com.projects.backend.inheritance.singletable;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Getter
@Setter
@Entity(name = "st_user")
@DiscriminatorValue("1")
public class User {
    String name;
    @Id
    Long id;
    String password;
    String email;
}
