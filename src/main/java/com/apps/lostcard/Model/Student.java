package com.apps.lostcard.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Student")
public class Student {

    @Id
    @Column(name = "STUDENT_ID")
    private int studentId;
    @Column(name = "STUDENT_FIRST_NAME")
    private String studFirstName;
    @Column(name = "STUDENT_SECOND_NAME")
    private String studLastName;
    @Column(name = "STUDENT_COURSE")
    private int studCourse;

    public Student(int studentId, String studFirstName, String studLastName, int studCourse) {
        this.studentId = studentId;
        this.studFirstName = studFirstName;
        this.studLastName = studLastName;
        this.studCourse = studCourse;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudFirstName() {
        return studFirstName;
    }

    public void setStudFirstName(String studFirstName) {
        this.studFirstName = studFirstName;
    }

    public String getStudLastName() {
        return studLastName;
    }

    public void setStudLastName(String studLastName) {
        this.studLastName = studLastName;
    }

    public int getStudCourse() {
        return studCourse;
    }

    public void setStudCourse(int studCourse) {
        this.studCourse = studCourse;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studFirstName='" + studFirstName + '\'' +
                ", studLastName='" + studLastName + '\'' +
                ", studCourse=" + studCourse +
                '}';
    }
}
