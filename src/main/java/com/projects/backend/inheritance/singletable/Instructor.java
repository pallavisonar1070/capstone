package com.projects.backend.inheritance.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "st_instructors")
@DiscriminatorValue("3")
public class Instructor extends User {
    String specialization;
}
