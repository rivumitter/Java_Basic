package com.java.inheritance;

public class Student extends School{

    String studentName;
    int rollNumber;

    //whenevr u r defining child constructor first u have to call parent constructor
    public Student(String schoolName, String schoolAddr, String studentName, int rollNumber) {
        super(schoolName, schoolAddr); // calling parent constructor
        this.studentName = studentName;
        this.rollNumber = rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    void getTotalAddressOfSchool() {
        // super. <- is used to access variable and methods of parent class from inside child class
        System.out.println("Total address is:"+ super.getSchoolName() + " "+ super.getSchoolAddr());
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }
}
