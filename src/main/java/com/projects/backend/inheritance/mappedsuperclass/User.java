package com.projects.backend.inheritance.mappedsuperclass;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter

public class User {
    String name;
    Long id;
    String password;
    String email;
}
