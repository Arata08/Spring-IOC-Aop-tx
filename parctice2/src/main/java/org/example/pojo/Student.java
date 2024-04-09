package org.example.pojo;

import lombok.Data;
import lombok.Setter;

@Setter
public class Student {

    private Integer id;
    private String name;
    private String gender;
    private Integer age;
    private String classes;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", classes='" + classes + '\'' +
                '}';
    }
}
