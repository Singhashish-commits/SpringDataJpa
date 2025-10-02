package com.ashish.springjdbcex.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Entity
public class Student {
    @Id
  private int rollNo;

  private String Name;
  private float marks;

  public Student (){

  }

  public Student(int rollNo, String Name, float marks) {
      this.rollNo = rollNo;
      this.Name = Name;
      this.marks = marks;

  }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }



    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", Name='" + Name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
