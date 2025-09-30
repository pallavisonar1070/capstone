package com.projects.backend.inheritance.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "st_students")
@DiscriminatorValue("2")
public class Students extends User {
    String course;
    String batch;

}
