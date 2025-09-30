package com.projects.backend.inheritance.joinedtable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "jt_mentors")
public class Mentor extends User {
    String company;
    int avgRating;

}
