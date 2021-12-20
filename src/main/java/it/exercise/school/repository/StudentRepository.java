package it.exercise.school.repository;

import org.springframework.data.repository.CrudRepository;

import it.exercise.school.model.Student;

public interface StudentRepository extends CrudRepository<Student,Long> {
    
    
}
