package com.java.java_8.ds.list.demo;

import java.util.Objects;

public class Student {

    private String name;
    private int roll;
    private int standard;

    public Student(String name, int roll, int standard) {
        this.name = name;
        this.roll = roll;
        this.standard = standard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll == student.roll && standard == student.standard && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, roll, standard);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", standard=" + standard +
                '}';
    }
}
