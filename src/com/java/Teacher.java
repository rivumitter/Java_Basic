package com.java;

import com.java.inheritance.School;

public class Teacher extends School{
    public Teacher(String schoolName, String schoolAddr) {
        super(schoolName, schoolAddr);
    }

    void printSchoolName() {
        System.out.println("SchoolName:"+ super.schoolName);
    }
}
