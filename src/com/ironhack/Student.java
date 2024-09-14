package com.ironhack;

public class Student {

    private String name;

    private int grade; // 0-100

    public Student(int grade, String name) {
        setGrade(grade);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if( grade >= 0 && grade <= 100 ) this.grade = grade;
        else throw new IllegalArgumentException("grade must be > 0 && < 100");
    }

    public void increaseGrade() {
        int updateGrade = (int)(getGrade() * 1.1);
        if(updateGrade > 100) setGrade(100);
        else setGrade(updateGrade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
