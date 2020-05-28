package com.company.Service;

import com.company.Model.Exam;
import com.company.Repository.ExamRepository;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public class ExamService implements Crud<Exam> {
private ExamRepository examRepository;
    @Override
    public Exam create(Exam exam) {
        return examRepository.save(exam);
    }

    @Override
    public List<Exam> findAll() {
        return examRepository.findAll();
    }

    @Override
    public Exam get(int id) {
        return examRepository.getOne(id);
    }

    @Override
    public Optional<Exam> find(int id) {
        return examRepository.findById(id);
    }

    @Override
    public PageItems<Exam> findAll(int offset, int count) {
        Page<Exam> page = examRepository.findAll(new OffsetTablePageRequest(offset, count));
        return new PageItems<>(page.getTotalElements(), page.getContent());

    }
    @Override
    public Exam update(Exam exam) {
        return examRepository.save(exam);
    }

    @Override
    public void delete(int id) {
        examRepository.deleteById(id);
    }
    public void zapros (){System.out.println(examRepository.getExamByDateBetween());}
}

