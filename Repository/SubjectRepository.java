package com.company.Repository;

import com.company.Model.Exam;
import com.company.Model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
    @Query(" select name from subject where  subject_specialtyid_fkey in (select id from specialty " +
            "where name='Прикладная информатика') ORDER BY id ASC;")
    public List<Exam> getSubjectBySpecialtyName();

}
