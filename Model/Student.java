package com.company.Model;

import javax.persistence.*;

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String familia;
    private String name;
    private String otchestvo;
    private Integer number_pasport;
    private String phone_number;
    private String email;

    @ManyToOne
    private Specialty specialty;

    public Student (int id, String f, String n, String o, int pasport,String phone, String email, int spec_id){
        this.id=id;
        this.familia = f;
        this.name = n;
        this.otchestvo=o;
        this.number_pasport = pasport;
        this.phone_number = phone;
        this.email=email;
        this.specialty.id=spec_id;
    }
    public String toString() {
        return id + ", " + familia + ", "
                + name + ", " + otchestvo + ", " +
                number_pasport + ", " + phone_number + ", " +
                email +"\n";
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
    public String getPhone_number(){
        return  phone_number;
    }
    public String getEmail(){return  email;}
    public int getNumberPasport(){return  number_pasport;}
    public Specialty getSpecialty(){return  specialty;}

    public void setFamilia(String f){
        this.familia=f;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setOtchestvo(String o){
        this.otchestvo=o;
    }
    public void setPhone_number(String pn){
        this.phone_number=pn;
    }
    public void setEmail(String email){this.email=email;}
    public void setNumberPasport(int np){this.number_pasport=np;}
    public void setSpecialty(Specialty sp){this.specialty=sp;}

}
