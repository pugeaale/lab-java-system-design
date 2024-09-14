package com.ironhack;

import java.util.HashMap;
import java.util.Map;

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

        //Create a Map with a key of the student's name (String) and a value of a Student object.
        Map<String, Student> map = createStudentMap();
        // we add 2 students
        map.put(student.getName(),student);
        map.put(student2.getName(), student2);
        System.out.println(map);//expect {Julia=Student{name='Julia', grade=0}, John=Student{name='John', grade=100}}
        // then we test if we can reach an element with the key
        System.out.println(map.get("Julia"));//expect Student{name='Julia', grade=0}

        Student student4 = new Student(90, "Maria");
        Student student5 = new Student(91, "Ana");
        Student student6 = new Student(92, "Anais");
        map.put(student4.getName(), student4);
        map.put(student5.getName(), student5);
        map.put(student6.getName(), student6);
        Map<String, Student> updatedmap = increaseGrades(map);
        System.out.println(updatedmap);

    }

    /**
     * Create a Map with a key of the student's name (String) and a value of a Student object.
     * @return
     */
    private static Map<String, Student> createStudentMap() {
        return new HashMap<>();
    }

    private static Map<String, Student>  increaseGrades(Map<String, Student> map) {
        for(Map.Entry<String, Student> entry : map.entrySet()) {
            try {
                entry.getValue().increaseGrade();
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println(illegalArgumentException.getMessage());
            }

        }
        return map;
    }

}
