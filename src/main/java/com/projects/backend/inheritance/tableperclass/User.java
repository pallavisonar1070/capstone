package com.projects.backend.inheritance.tableperclass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Getter;
import lombok.Setter;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
@Entity(name = "tpc_user")
public class User {
    String name;
    @Id
    Long id;
    String password;
    String email;
}
