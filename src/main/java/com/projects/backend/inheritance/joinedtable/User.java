package com.projects.backend.inheritance.joinedtable;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@Entity(name = "jt_user")
public class User {
    String name;
    @Id
    Long id;
    String password;
    String email;
}
