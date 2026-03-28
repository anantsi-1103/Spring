package com.logic.entity;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "stud")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentID;

    @Column(name = "StudentName", length = 100)
    private String name;

    @Column(name = "StudentAge", nullable = false)
    private int age;

    @Column(name = "StudentCity")
    private String city;

    // MANY STUDENTS → ONE DEPARTMENT

    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Department department;

    // MANY STUDENTS ↔ MANY COURSES

    @ManyToMany(
        cascade = {CascadeType.PERSIST, CascadeType.MERGE}
    )
    @JoinTable(
        name = "student_course",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses;

    public Student() {}

    public Student(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    // Getters & Setters

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student [ID=" + studentID +
                ", Name=" + name +
                ", Age=" + age +
                ", City=" + city + "]";
    }
}