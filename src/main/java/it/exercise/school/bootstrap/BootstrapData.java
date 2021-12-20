package it.exercise.school.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import it.exercise.school.model.SchoolClass;
import it.exercise.school.model.Student;
import it.exercise.school.repository.SchoolClassRepository;
import it.exercise.school.repository.StudentRepository;
@Component
public class BootstrapData implements CommandLineRunner{
    @Autowired
    private SchoolClassRepository schoolClassRepository;
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub

        SchoolClass class1 = new SchoolClass("1A");
        SchoolClass class2 = new SchoolClass("1B");
        SchoolClass class3 = new SchoolClass("1C");

        Student s1= new Student("Matteo","Pezza",28,class1);
        Student s2 = new Student("Antonio","Cirullo",26,class2);
        Student s3 = new Student("Diego","Tallarico",24,class3);
        Student s4 = new Student("Pippo","Pluto",32,class1);
        Student s5 = new Student("Alex","Delpiero",42,class2);
        Student s6 = new Student("Francesco","Totti",40,class3);

        schoolClassRepository.save(class1);
        schoolClassRepository.save(class2);
        schoolClassRepository.save(class3);

        studentRepository.save(s1);
        studentRepository.save(s2);
        studentRepository.save(s3);
        studentRepository.save(s4);
        studentRepository.save(s5);
        studentRepository.save(s6);

    }

    
       

       

        



    }


    

