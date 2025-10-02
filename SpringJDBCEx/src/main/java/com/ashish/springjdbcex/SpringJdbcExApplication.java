package com.ashish.springjdbcex;
import com.ashish.springjdbcex.Service.StudentService;
import com.ashish.springjdbcex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcExApplication {

    public static void main(String[] args) {

       ApplicationContext context=  SpringApplication.run(SpringJdbcExApplication.class, args);

        Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);
        Student s3 = context.getBean(Student.class);

        StudentService service = context.getBean(StudentService.class);

        s1.setRollNo(22);
        s1.setName("Ashish");
        s1.setMarks(8.59f);

        s2.setRollNo(23);
        s2.setName("Shushant");
        s2.setMarks(7.89f);

        s3.setRollNo(47);
        s3.setName("M Hemja");
        s3.setMarks(9.1f);

        service.addStudent(s1);
        service.addStudent(s2);
        service.addStudent(s3);

        System.out.println(service.getStudents()+" Finding All Students");
        System.out.println(service.findName("Ashish")+ " found in database");

//        repo.save(s1);
//        repo.save(s2);
//        repo.save(s3);
//        Optional<Student> s4= repo.findById(147);
//        System.out.println(s4 + " Found in database");
//        System.out.println("Finding all content of database" + repo.findAll());
//        System.out.println(repo.findByName("Ashish"));
//        repo.save(object) also work as update if you change the fields of the existing data
//        repo.delete(object) delete the object from database

    }

}
