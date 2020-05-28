package com.company.Model;

import javax.persistence.OneToOne;

public class Teacher {
    public int id;
    private String familia;
    private String name;
    private String otchestvo;
    @OneToOne
    private Exam exam;
    public Teacher(int id, String f, String n, String o){
        this.id=id;
        this.familia=f;
        this.name=n;
        this.otchestvo=o;
    }
    @Override
    public String toString() {
        return  id + ", " + familia + ", " +
                name + ", " + otchestvo + "\n";
    }
    public String getFamilia(){
        return familia;
    }
    public String getName(){
        return name;
    }
    public String getOtchestvo(){
        return otchestvo;
    }
    public Exam getExam(){return  exam;}

    public void setFamilia(String f){
        this.familia=f;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setOtchestvo(String o){
        this.otchestvo=o;
    }
    public void setExam(Exam exam){this.exam=exam;}
}
