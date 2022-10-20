package com.exampleerror.demo2.entity;

import lombok.*;
import javax.persistence.*;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name= "user", schema = "public" ) //In PostgreSQL you have to specify the name of schema like so : @Table(name="table_name", schema = "myapp")


public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private  int age;
    @Column(name = "salary")
    private int salary;
}
