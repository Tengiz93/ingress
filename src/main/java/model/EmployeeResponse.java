package model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse {

    private Integer id;
    private String surName;
    private String name;
    private Integer age;


}
