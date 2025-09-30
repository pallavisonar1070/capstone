package com.projects.backend.inheritance.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "st_mentors")
@DiscriminatorValue("4")
public class Mentor extends User {
    String company;
    int avgRating;

}
