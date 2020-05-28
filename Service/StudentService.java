package com.company.Service;

import com.company.Model.Student;
import com.company.Repository.StudentRepository;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public class StudentService implements Crud<Student> {
    private StudentRepository studentRepository;
    @Override
    public Student create(Student spec) {
        return studentRepository.save(spec);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student get(int id) {
        return studentRepository.getOne(id);
    }

    @Override
    public Optional<Student> find(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public PageItems<Student> findAll(int offset, int count) {
        Page<Student> page = studentRepository.findAll(new OffsetTablePageRequest(offset, count));
        return new PageItems<>(page.getTotalElements(), page.getContent());

    }
    @Override
    public Student update(Student spec) {
        return studentRepository.save(spec);
    }

    @Override
    public void delete(int id) {
        studentRepository.deleteById(id);
    }
    public void zapros(){System.out.println(studentRepository.getStudent());}
}

