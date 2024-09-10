package com.ironhack;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");

        Student student = new Student(100, "John");
        System.out.println(student);//expect Student{name='John', grade=100}

        Student student2 = new Student(0, "Julia");
        System.out.println(student2); //expect Student{name='Julia', grade=0}

        try {
            Student student3 = new Student(101, "Johnny");//expect throw exception
            System.out.println(student3);
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(illegalArgumentException.getMessage()); //expect grade must be > 0 && < 100
        }

        try {
            Student student4 = new Student(-1, "Jane"); //expect throw exception
            System.out.println(student4);
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(illegalArgumentException.getMessage()); //expect grade must be > 0 && < 100
        }

    }
}
