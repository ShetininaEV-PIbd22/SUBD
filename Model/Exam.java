package com.company.Model;

import javax.persistence.*;
import java.sql.Date;

public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date dateBegin;
    private Date dateEnd;
    @OneToOne
    private Clas clas;
    @ManyToOne
    private Subject subject;
    @OneToOne
    private Teacher teacher;
    public void Constructor(int id, Date db, Date de, int subject_id, int clas_id, int teacher_id){
        this.id=id;
        this.dateBegin=db;
        this.dateEnd=de;
        this.subject.id=subject_id;
        this.clas.id=clas_id;
        this.teacher.id=teacher_id;
    }
    @Override
    public String toString() {
        return  id + ", " + dateBegin + ", " + dateEnd + ", " ;
    }
}
