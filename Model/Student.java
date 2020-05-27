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

    public void Constructor(int id, String f, String n, String o, int pasport,String phone, String email, int spec_id){
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
                email + ", ";
    }
}
