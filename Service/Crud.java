package com.company.Service;

import java.util.List;
import java.util.Optional;

public interface Crud<T> {
    T create(T t);

    List<T> findAll();

    T get(int id);

    Optional<T> find(int id);

    PageItems<T> findAll(int offset, int count);

    T update(T t);

    void delete(int id);
}
