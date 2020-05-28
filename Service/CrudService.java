package com.company.Service;

import com.company.Model.*;

import java.sql.Date;

public class CrudService {
    StudentService sts= new StudentService();
    ClassService cs= new ClassService();
    TeacherService ts=new TeacherService();
    ExamService ex=new ExamService();
    SpecialtyService spx=new SpecialtyService();
    SubjectService subx=new SubjectService();

    public void creteStudent(int id, String f, String n, String o, int pasport,String phone, String email, int spec_id){
       Student student= new Student(id, f, n, o, pasport, phone, email, spec_id);
        sts.create(student);
        sts.findAll();
    }
    public void createClas(int id, String type, int vmes){
        Clas clas=new Clas(id, type, vmes);
        cs.create(clas);
        cs.findAll();
    }
    public void createExam(int id, Date db, Date de, int subject_id, int clas_id, int teacher_id){
        Exam exam=new Exam(id, db, de, subject_id, clas_id, teacher_id);
        ex.create(exam);
        ex.findAll();
    }
    public void createSpecialty(int id, String name){
        Specialty spec=new Specialty(id, name);
        spx.create(spec);
        spx.findAll();
    }
    public void createSubject(int id, String name, int spec_id){
        Subject sub=new Subject(id, name, spec_id);
        subx.create(sub);
        subx.findAll();
    }
    public  void createTeacher(int id, String f, String n, String o){
        Teacher teacher= new Teacher(id, f, n, o);
        ts.create(teacher);
        ts.findAll();
    }

    public void firstZapros(){
        System.out.println("Запрос 1");
        subx.zapros();
        subx.findAll();
    }
    public void secondZapros(){
        System.out.println("Запрос 2");
        sts.zapros();
        sts.findAll();
    }
    public void zapros3(){
        System.out.println("Запрос 3");
        ex.zapros();
        ex.findAll();
    }

    public void updateStudent(int id, String f, String n, String o, int pasport,String phone, String email, int spec_id){
        Student student= new Student(id, f, n, o, pasport, phone, email, spec_id);
        sts.update(student);
        sts.findAll();
    }
    public void updateClas(int id, String type, int vmes){
        Clas clas=new Clas(id, type, vmes);
        cs.update(clas);
        cs.findAll();
    }
    public void updateExam(int id, Date db, Date de, int subject_id, int clas_id, int teacher_id){
        Exam exam=new Exam(id, db, de, subject_id, clas_id, teacher_id);
        ex.update(exam);
        ex.findAll();
    }
    public void updateSpecialty(int id, String name){
        Specialty spec=new Specialty(id, name);
        spx.update(spec);
        spx.findAll();
    }
    public void updateSubject(int id, String name, int spec_id){
        Subject sub=new Subject(id, name, spec_id);
        subx.update(sub);
        subx.findAll();
    }
    public  void updateTeacher(int id, String f, String n, String o){
        Teacher teacher= new Teacher(id, f, n, o);
        ts.update(teacher);
        ts.findAll();
    }

    public void deleteStudent(int id){
        sts.delete(id);
        sts.findAll();
    }
    public void deleteClas(int id){
        cs.delete(id);
        cs.findAll();
    }
    public void deleteExam(int id){
        ex.delete(id);
        ex.findAll();
    }
    public void deleteSpecialty(int id){
        spx.delete(id);
        spx.findAll();
    }
    public void deleteSubject(int id){
        subx.delete(id);
        subx.findAll();
    }
    public  void deleteTeacher(int id){
        ts.delete(id);
        ts.findAll();
    }
}
