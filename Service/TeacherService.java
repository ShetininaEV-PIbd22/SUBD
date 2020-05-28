package com.company.Service;

import com.company.Model.Teacher;
import com.company.Repository.TeacherRepository;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public class TeacherService implements Crud<Teacher> {
    private TeacherRepository teacherRepository;
    @Override
    public Teacher create(Teacher spec) {
        return teacherRepository.save(spec);
    }

    @Override
    public List<Teacher> findAll() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher get(int id) {
        return teacherRepository.getOne(id);
    }

    @Override
    public Optional<Teacher> find(int id) {
        return teacherRepository.findById(id);
    }

    @Override
    public PageItems<Teacher> findAll(int offset, int count) {
        Page<Teacher> page = teacherRepository.findAll(new OffsetTablePageRequest(offset, count));
        return new PageItems<>(page.getTotalElements(), page.getContent());

    }
    @Override
    public Teacher update(Teacher spec) {
        return teacherRepository.save(spec);
    }

    @Override
    public void delete(int id) {
        teacherRepository.deleteById(id);
    }
}

