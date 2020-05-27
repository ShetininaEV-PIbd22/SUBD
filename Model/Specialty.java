package com.company.Model;

import javax.persistence.*;
import java.util.List;

public class Specialty {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    private String name;
    @OneToOne
    private Subject subject;
    @OneToMany
    public void Constructor(int id, String name){
        this.id=id;
        this.name=name;
    }
    private List<Student> students;
    public String toString() {
        return  id + ", " + name + ", ";
    }
}
