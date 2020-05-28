package com.company.Service;

import com.company.Model.Subject;
import com.company.Repository.SubjectRepository;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public class SubjectService implements Crud<Subject> {
    private SubjectRepository subjectRepository;
    @Override
    public Subject create(Subject spec) {
        return subjectRepository.save(spec);
    }

    @Override
    public List<Subject> findAll() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject get(int id) {
        return subjectRepository.getOne(id);
    }

    @Override
    public Optional<Subject> find(int id) {
        return subjectRepository.findById(id);
    }

    @Override
    public PageItems<Subject> findAll(int offset, int count) {
        Page<Subject> page = subjectRepository.findAll(new OffsetTablePageRequest(offset, count));
        return new PageItems<>(page.getTotalElements(), page.getContent());

    }
    @Override
    public Subject update(Subject spec) {
        return subjectRepository.save(spec);
    }

    @Override
    public void delete(int id) {
        subjectRepository.deleteById(id);
    }
    public void zapros (){
        System.out.println(subjectRepository.getSubjectBySpecialtyName());
    }
}

