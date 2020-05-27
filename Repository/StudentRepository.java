package com.company.Repository;

import com.company.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query(" select new  com.company.Repository.StudentWithCount (familia, name, otchestvo, count(*))" +
            "over(partition by student_specialtyid_fkey) from student;")
    public List<Student> getStudent();
}
