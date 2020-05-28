package com.company.Model;

import javax.persistence.*;

public class Specialty {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    private String name;

    public Specialty(int id, String name){
        this.id=id;
        this.name=name;
    }
    public String toString() {
        return  id + ", " + name+"\n";
    }

    public  String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
