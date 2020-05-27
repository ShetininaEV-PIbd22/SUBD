package com.company.Model;

import javax.persistence.*;

//@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class Clas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    private String type;
    private int vmestimost;

    @OneToOne
    private Exam exam;
    public void Constructor(int id, String type, int vmest){
        this.id=id;
        this.type = type;
        this.vmestimost = vmest;
    }
    @Override
    public String toString() {
        return id + ", " + type+", "+vmestimost + ", ";
    }
}
