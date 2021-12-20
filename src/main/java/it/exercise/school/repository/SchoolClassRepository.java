package it.exercise.school.repository;

import org.springframework.data.repository.CrudRepository;

import it.exercise.school.model.SchoolClass;

public interface SchoolClassRepository extends CrudRepository<SchoolClass,Long> {
    
    
}
