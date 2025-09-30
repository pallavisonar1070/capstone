package com.projects.backend.inheritance.mappedsuperclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Students extends User{
    String course;
    String batch;

}
