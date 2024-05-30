package org.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.cydeo.enums.Gender;

@Data
@AllArgsConstructor
public class Mentor {



    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;

}
