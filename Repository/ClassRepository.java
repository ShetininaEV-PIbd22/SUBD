package com.company.Repository;

import com.company.Model.Clas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<Clas, Integer>{

}
