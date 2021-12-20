package it.exercise.school.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

@Entity
public class SchoolClass {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameClass;
    
    @OneToMany(mappedBy = "schoolClass")
    
    private List<Student> students = new ArrayList<Student>();

    

    public SchoolClass(){}

    public SchoolClass(String nameClass){

        this.nameClass=nameClass;
        
    }


    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public Integer getStudentNumber() {
        return students.size();
    }

   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    
    
}
