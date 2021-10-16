package com.infinity;

public class Student {
    private String admission_number;
    private String fname;
    private  String lname;
    private  String course;

    public Student(String admission_number, String fname, String lname, String course) {
        this.admission_number = admission_number;
        this.fname = fname;
        this.lname = lname;
        this.course = course;
    }

    public String getAdmission_number() {
        return admission_number;
    }

    public void setAdmission_number(String admission_number) {
        this.admission_number = admission_number;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
