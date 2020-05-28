package com.company;


import com.company.Service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.sql.Date;
import java.sql.Timestamp;


@SpringBootApplication
public class Main {
    Timestamp start, end;
    CrudService cs= new CrudService();
    @Autowired
   public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
   @EventListener(ApplicationReadyEvent.class)
    public void onStart() {
        start=new Timestamp(System.currentTimeMillis());
        cs.firstZapros();
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");

       System.out.println("----------------------------------------------------------");
       start=new Timestamp(System.currentTimeMillis());
       cs.secondZapros();
       end=new Timestamp(System.currentTimeMillis());
       System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");

       System.out.println("----------------------------------------------------------");
       start=new Timestamp(System.currentTimeMillis());
       cs.zapros3();
       end=new Timestamp(System.currentTimeMillis());
       System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
       Create();
       Update();
       cs.deleteClas(25);
       cs.deleteExam(25);
       cs.deleteSpecialty(25);
       cs.deleteStudent(25);
       cs.deleteSubject(25);
       cs.deleteTeacher(25);
    }
    //CREATE
    private void Create(){
        start=new Timestamp(System.currentTimeMillis());
        cs.createClas(25, "Лекция45", 5555);
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");

        start=new Timestamp(System.currentTimeMillis());
        cs.createExam(25, Date.valueOf("2020-04-24"), Date.valueOf("2020-04-25"), 2, 3, 3);
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");

        start=new Timestamp(System.currentTimeMillis());
        cs.createSpecialty(25, "Учитель математики и информатики");
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");

        start=new Timestamp(System.currentTimeMillis());
        cs.createSubject(25, "Предмет", 3);
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");

        start=new Timestamp(System.currentTimeMillis());
        cs.creteStudent(25, "Алексеев", "Алексей","Михайлович", 55443, "89174324", "alam@gmail.com", 3);
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");

        start=new Timestamp(System.currentTimeMillis());
        cs.createTeacher(25, "Александров","Андрей", "Валерьевич");
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
    }

    //UPDATE
    private void Update(){
        start=new Timestamp(System.currentTimeMillis());
        cs.updateClas(25, "Лекция 45", 5555);
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");

        start=new Timestamp(System.currentTimeMillis());
        cs.updateExam(25, Date.valueOf("2020-04-27"), Date.valueOf("2020-04-28"), 2, 25, 3);
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");

        start=new Timestamp(System.currentTimeMillis());
        cs.updateSpecialty(25, "Преподаватель математики");
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");

        start=new Timestamp(System.currentTimeMillis());
        cs.updateSubject(4, "Предмет", 4);
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");

        start=new Timestamp(System.currentTimeMillis());
        cs.updateStudent(25, "Алексеев", "Алексей","Михайлович", 54890, "89174324", "alam@gmail.com", 3);
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");

        start=new Timestamp(System.currentTimeMillis());
        cs.updateTeacher(25, "Морозова", "Надежда", "Петровна");
        end=new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
    }
}
