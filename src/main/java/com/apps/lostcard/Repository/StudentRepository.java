package com.apps.lostcard.Repository;

import com.apps.lostcard.Model.Student;
import org.springframework.data.repository.CrudRepository;


import java.util.List;
import java.util.Optional;

public interface StudentRepository extends CrudRepository<Student, Integer>{
    List<Student> findByStudLastName(String studLastName);
    Optional<Student> findByStudCourse(int studCourse);

}