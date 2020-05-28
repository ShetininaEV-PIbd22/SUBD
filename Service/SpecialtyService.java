package com.company.Service;

import com.company.Model.Specialty;
import com.company.Repository.SpecialtyRepository;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public class SpecialtyService implements Crud<Specialty> {
    private SpecialtyRepository specialtyRepository;
    @Override
    public Specialty create(Specialty spec) {
        return specialtyRepository.save(spec);
    }

    @Override
    public List<Specialty> findAll() {
        return specialtyRepository.findAll();
    }

    @Override
    public Specialty get(int id) {
        return specialtyRepository.getOne(id);
    }

    @Override
    public Optional<Specialty> find(int id) {
        return specialtyRepository.findById(id);
    }

    @Override
    public PageItems<Specialty> findAll(int offset, int count) {
        Page<Specialty> page = specialtyRepository.findAll(new OffsetTablePageRequest(offset, count));
        return new PageItems<>(page.getTotalElements(), page.getContent());

    }
    @Override
    public Specialty update(Specialty spec) {
        return specialtyRepository.save(spec);
    }

    @Override
    public void delete(int id) {
        specialtyRepository.deleteById(id);
    }
}
