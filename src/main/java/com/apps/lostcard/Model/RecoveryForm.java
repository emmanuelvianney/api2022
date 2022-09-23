package com.apps.lostcard.Model;

import javax.persistence.*;


@Entity
@Table (name = "RecoveryForm")
public class RecoveryForm {
    @Id
    @Column(name = "FORM_NUMBER")
    private int formNo;
    @OneToOne
    @JoinColumn(name = "STUDENT_ID")
    private int studentId;

    @Column(name = "STAFF_FULL_NAME")
    private String stFullName;

    @Column(name = "STUDENT_COURSE")
    private int studCourse;

    public RecoveryForm(int formNo, int studentId, String stFullName, int studCourse) {
        this.formNo = formNo;
        this.studentId = studentId;
        this.stFullName = stFullName;
        this.studCourse = studCourse;
    }

    public int getFormNo() {
        return formNo;
    }

    public void setFormNo(int formNo) {
        this.formNo = formNo;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStFullName() {
        return stFullName;
    }

    public void setStFullName(String stFullName) {
        this.stFullName = stFullName;
    }

    public int getStudCourse() {
        return studCourse;
    }

    public void setStudCourse(int studCourse) {
        this.studCourse = studCourse;
    }

    @Override
    public String toString() {
        return "RecoveryForm{" +
                "formNo=" + formNo +
                ", studentId=" + studentId +
                ", stFullName='" + stFullName + '\'' +
                ", studCourse=" + studCourse +
                '}';
    }
}
