package com.projects.backend.inheritance.joinedtable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "jt_instructors")
public class Instructor extends User {
    String specialization;
}
