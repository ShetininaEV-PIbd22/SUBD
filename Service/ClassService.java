package com.company.Service;

import com.company.Model.Clas;
import com.company.Repository.ClassRepository;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public class ClassService implements Crud<Clas> {
    private ClassRepository classRepository;
    @Override
    public Clas create(Clas clas) {
        return classRepository.save(clas);
    }

    @Override
    public List<Clas> findAll() {
        return classRepository.findAll();
    }

    @Override
    public Clas get(int id) {
        return classRepository.getOne(id);
    }

    @Override
    public Optional<Clas> find(int id) {
        return classRepository.findById(id);
    }

    @Override
    public PageItems<Clas> findAll(int offset, int count) {
        Page<Clas> page = classRepository.findAll(new OffsetTablePageRequest(offset, count));
        return new PageItems<>(page.getTotalElements(), page.getContent());

    }
    @Override
    public Clas update(Clas clas) {
        return classRepository.save(clas);
    }

    @Override
    public void delete(int id) {
        classRepository.deleteById(id);
    }
}
