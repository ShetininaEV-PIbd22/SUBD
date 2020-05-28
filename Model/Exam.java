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

    public Exam(int id, Date db, Date de, int subject_id, int clas_id, int teacher_id){
        this.id=id;
        this.dateBegin=db;
        this.dateEnd=de;
        this.subject.id=subject_id;
        this.clas.id=clas_id;
        this.teacher.id=teacher_id;
    }
    @Override
    public String toString() {
        return  id + ", " + dateBegin + ", " + dateEnd + ", "+subject.id+", "+clas.id+", "+teacher.id+"\n" ;
    }

    public Date getDateBegin(){
        return dateBegin;
    }
    public Date getDateEnd(){
        return dateEnd;
    }
    public int getSubjectId(){
        return  subject.id;
    }
    public int getClassId(){
        return clas.id;
    }
    public int getTeacherId(){
        return teacher.id;
    }

    public void setDateBegin(Date dateBegin){
        this.dateBegin=dateBegin;
    }
    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }
    public void setSubjectId(Subject sub){
        this.subject=sub;
    }
    public void setClas(Clas clas){
        this.clas=clas;
    }
    public void setTeacher(Teacher teacher){
        this.teacher=teacher;
    }
}
