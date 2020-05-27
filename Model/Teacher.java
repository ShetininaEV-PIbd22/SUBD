package com.company.Model;

import javax.persistence.OneToOne;

public class Teacher {
    public int id;
    private String familia;
    private String name;
    private String otchestvo;
    @OneToOne
    private Exam exam;
    public void Constructor(int id, String f, String n, String o){
        this.id=id;
        this.familia=f;
        this.name=n;
        this.otchestvo=o;
    }
    @Override
    public String toString() {
        return  id + ", " + familia + ", " +
                name + ", " + otchestvo + ", ";
    }
}
