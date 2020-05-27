package com.company.Model;

import javax.persistence.*;
import java.util.List;

public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    private String name;
    @OneToMany
    private List<Exam> exams;
    @ManyToOne
    private Specialty specialty;
    public void Constructor(int id, String name, int spec_id){
        this.id=id;
        this.name=name;
        this.specialty.id=spec_id;
    }
    @Override
    public String toString() {
        return  id + ", " + name + ", ";
    }
}
