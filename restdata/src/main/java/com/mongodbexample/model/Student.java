package com.mongodbexample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Student {
    @Id
    private String id;
    private String name;
    private int age;
    private String grade;
    private String email;
}
