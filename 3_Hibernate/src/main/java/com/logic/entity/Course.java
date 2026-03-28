package com.logic.entity;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseID;

    private String courseName;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;



    public Course() {}

    public Course(String courseName) {
        this.courseName = courseName;
    }

    // Getters & Setters

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}