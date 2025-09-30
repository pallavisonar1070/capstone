package com.projects.backend.inheritance.mappedsuperclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mentor extends User{
    String company;
    int avgRating;

}
