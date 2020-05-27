package com.company;


import com.company.Model.*;
import com.company.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.sql.Date;
import java.sql.Timestamp;


@SpringBootApplication
public class Main {
    private ClassRepository classRepository;
    private ExamRepository examRepository;
    private SpecialtyRepository specialtyRepository;
    private StudentRepository studentRepository;
    private SubjectRepository subjectRepository;
    private TeacherRepository teacherRepository;
    Timestamp start, end;
    @Autowired
    public Main(ClassRepository classRepository,
                ExamRepository examRepository,
                SpecialtyRepository specialtyRepository,
                StudentRepository studentRepository,
                SubjectRepository subjectRepository,
                TeacherRepository teacherRepository) {
        this.classRepository = classRepository;
        this.examRepository = examRepository;
        this.specialtyRepository = specialtyRepository;
        this.studentRepository = studentRepository;
        this.subjectRepository = subjectRepository;
        this.teacherRepository = teacherRepository;
    }
    public Main(){

    }
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
   @EventListener(ApplicationReadyEvent.class)
    public void onStart() {
       System.out.println("Запрос 3");
        start=new Timestamp(System.currentTimeMillis());
        System.out.println(examRepository.getExamByDateBetween());
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");

       System.out.println("----------------------------------------------------------");
       System.out.println("Запрос 2");
       start=new Timestamp(System.currentTimeMillis());
        System.out.println(studentRepository.getStudent());
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");

        System.out.println("----------------------------------------------------------");
        System.out.println("Запрос 1");
        start=new Timestamp(System.currentTimeMillis());
        System.out.println(subjectRepository.getSubjectBySpecialtyName());
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
        AllRead();

        Create();
        AllRead();

        Update();
        AllRead();

        deleteClas(25);
        deleteExam(25);
        deleteSpecialty(25);
        deleteStudent(25);
        deleteSubject(25);
        deleteTeacher(25);
        AllRead();
    }
    private void AllRead(){
        readClass();
        readExam();
        readSpecialty();
        readStudent();
        readSubject();
        readTeacher();
    }
    //READ
    private  void readClass() {
        start = new Timestamp(System.currentTimeMillis());
        classRepository.findAll(PageRequest.of(0, 4, Sort.Direction.DESC, "name"))
                .toList()
                .forEach(System.out::println);
        end = new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");

    }
    private  void readExam() {
        start = new Timestamp(System.currentTimeMillis());
        examRepository.findAll(PageRequest.of(0, 4, Sort.Direction.DESC, "name"))
                .toList()
                .forEach(System.out::println);
        end = new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
    }
    private  void readSpecialty() {
        start = new Timestamp(System.currentTimeMillis());
        specialtyRepository.findAll(PageRequest.of(0, 4, Sort.Direction.DESC, "name"))
                .toList()
                .forEach(System.out::println);
        end = new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
    }
    private  void readStudent() {
        start = new Timestamp(System.currentTimeMillis());
        studentRepository.findAll(PageRequest.of(0, 4, Sort.Direction.DESC, "name"))
                .toList()
                .forEach(System.out::println);
        end = new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
    }
    private  void readSubject() {
        start = new Timestamp(System.currentTimeMillis());
        subjectRepository.findAll(PageRequest.of(0, 4, Sort.Direction.DESC, "name"))
                .toList()
                .forEach(System.out::println);
        end = new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
    }
    private  void readTeacher() {
        start = new Timestamp(System.currentTimeMillis());
        teacherRepository.findAll(PageRequest.of(0, 4, Sort.Direction.DESC, "name"))
                .toList()
                .forEach(System.out::println);
        end = new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
    }
    //CREATE
    private void Create(){
        start=new Timestamp(System.currentTimeMillis());
        createClas(25, "Лекция45", 5555);
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");

        start=new Timestamp(System.currentTimeMillis());
        createExam(25, Date.valueOf("2020-04-24"), Date.valueOf("2020-04-25"), 2, 3, 3);
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");

        start=new Timestamp(System.currentTimeMillis());
        createSpecialty(25, "Учитель математики и информатики");
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");

        start=new Timestamp(System.currentTimeMillis());
        createSubject(25, "Предмет", 3);
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");

        start=new Timestamp(System.currentTimeMillis());
        creteStudent(25, "Алексеев", "Алексей","Михайлович", 55443, "89174324", "alam@gmail.com", 3);
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");

        start=new Timestamp(System.currentTimeMillis());
        createTeacher(25, "Александров","Андрей", "Валерьевич");
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
    }
    private void creteStudent(int id, String f, String n, String o, int pasport,String phone, String email, int spec_id){
        Student student= new Student();
        student.Constructor(id, f, n, o, pasport, phone, email, spec_id);
        studentRepository.save(student);
    }
    private void createClas(int id, String type, int vmes){
        Clas clas=new Clas();
        clas.Constructor(id, type, vmes);
        classRepository.save(clas);
    }
    private void createExam(int id, Date db, Date de, int subject_id, int clas_id, int teacher_id){
         Exam exam=new Exam();
         exam.Constructor(id, db, de, subject_id, clas_id, teacher_id);
         examRepository.save(exam);
     }
    private void createSpecialty(int id, String name){
        Specialty spec=new Specialty();
        spec.Constructor(id, name);
        specialtyRepository.save(spec);
    }
    private void createSubject(int id, String name, int spec_id){
        Subject sub=new Subject();
        sub.Constructor(id, name, spec_id);
        subjectRepository.save(sub);
    }
    private  void createTeacher(int id, String f, String n, String o){
         Teacher teacher= new Teacher();
         teacher.Constructor(id, f, n, o);
         teacherRepository.save(teacher);
    }
    //DELETE
    private void deleteClas(int id){
        start=new Timestamp(System.currentTimeMillis());
        classRepository.deleteById(id);
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
    }
    private void deleteExam(int id){
        start=new Timestamp(System.currentTimeMillis());
        examRepository.deleteById(id);
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
    }
    private void deleteSpecialty(int id){
        start=new Timestamp(System.currentTimeMillis());
        specialtyRepository.deleteById(id);
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
    }
    private void deleteStudent(int id){
        start=new Timestamp(System.currentTimeMillis());
        studentRepository.deleteById(id);
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
    }
    private void deleteSubject(int id){
        start=new Timestamp(System.currentTimeMillis());
        subjectRepository.deleteById(id);
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
    }
    private void deleteTeacher(int id){
        start=new Timestamp(System.currentTimeMillis());
        teacherRepository.deleteById(id);
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
    }

    //UPDATE
    private void Update(){
        start=new Timestamp(System.currentTimeMillis());
        updateClas(25, "Лекция 45", 5555);
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");

        start=new Timestamp(System.currentTimeMillis());
        updateExam(25, Date.valueOf("2020-04-27"), Date.valueOf("2020-04-28"), 2, 25, 3);
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");

        start=new Timestamp(System.currentTimeMillis());
        updateSpecialty(25, "Преподаватель математики");
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");

        start=new Timestamp(System.currentTimeMillis());
        updateSubject(4, "Предмет", 4);
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");

        start=new Timestamp(System.currentTimeMillis());
        updateStudent(25, "Алексеев", "Алексей","Михайлович", 54890, "89174324", "alam@gmail.com", 3);
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");

        start=new Timestamp(System.currentTimeMillis());
        updateTeacher(25, "Морозова", "Надежда", "Петровна");
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
    }
    private void updateStudent(int id, String f, String n, String o, int pasport,String phone, String email, int spec_id){
        Student student= new Student();
        student.Constructor(id, f, n, o, pasport, phone, email, spec_id);
        studentRepository.save(student);
    }
    private void updateClas(int id, String type, int vmes){
        Clas clas=new Clas();
        clas.Constructor(id, type, vmes);
        classRepository.save(clas);
    }
    private void updateExam(int id, Date db, Date de, int subject_id, int clas_id, int teacher_id){
        Exam exam=new Exam();
        exam.Constructor(id, db, de, subject_id, clas_id, teacher_id);
        examRepository.save(exam);
    }
    private void updateSpecialty(int id, String name){
        Specialty spec=new Specialty();
        spec.Constructor(id, name);
        specialtyRepository.save(spec);
    }
    private void updateSubject(int id, String name, int spec_id){
        Subject sub=new Subject();
        sub.Constructor(id, name, spec_id);
        subjectRepository.save(sub);
    }
    private  void updateTeacher(int id, String f, String n, String o){
        Teacher teacher= new Teacher();
        teacher.Constructor(id, f, n, o);
        teacherRepository.save(teacher);
    }
}
