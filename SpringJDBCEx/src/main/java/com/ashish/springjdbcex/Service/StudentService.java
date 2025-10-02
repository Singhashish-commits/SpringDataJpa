package com.ashish.springjdbcex.Service;

import com.ashish.springjdbcex.Repository.StudentRepo;
import com.ashish.springjdbcex.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StudentService {

     private StudentRepo repo ;

    public StudentRepo getrepo() {
        return repo;
    }

@Autowired
    public void setrepo(StudentRepo studentRepo) {
        this.repo = studentRepo;
    }

    public void addStudent(Student s){
        repo.save(s);
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }

    public List<Student> findName(String name) {
        return repo.findByName(name);
    }

}
