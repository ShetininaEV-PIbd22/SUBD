package com.company.Repository;

import com.company.Model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Integer> {
    @Query("select  ex.exam_classid_fkey, ex.datebegin, ex.dateend from " +
            "exam ex where ex.datebegin> '2020-06-01' and ex.dateend<'2020-08-20';")
    public List<Exam> getExamByDateBetween();
}
