package com.java.inheritance;

public class School {

    protected String schoolName;
    public String schoolAddr;


    public School(String schoolName, String schoolAddr) {
        this.schoolName = schoolName;
        this.schoolAddr = schoolAddr;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolAddr() {
        return schoolAddr;
    }

    public void setSchoolAddr(String schoolAddr) {
        this.schoolAddr = schoolAddr;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", schoolAddr='" + schoolAddr + '\'' +
                '}';
    }
}
