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
    public Clas (int id, String type, int vmest){
        this.id=id;
        this.type = type;
        this.vmestimost = vmest;
    }
    @Override
    public String toString() {
        return id + ", " + type+", "+vmestimost+"\n" ;
    }

    public String getType(){
        return type;
    }
    public int getVmestimost(){
        return vmestimost;
    }
    public Exam getExam(){
        return  exam;
    }

    public void setType(String type){
        this.type=type;
    }
    public void setVmestimost(int vmest){
        this.vmestimost=vmest;
    }
    public  void setExam(Exam exam){
        this.exam=exam;
    }
}
