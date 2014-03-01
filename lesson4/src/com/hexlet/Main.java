package com.hexlet;

import com.hexlet.common.Course;
import com.hexlet.humans.Student;

public class Main {
    public static void main(String[] args) {

        Student studentMax = new Student();
        studentMax.name = "Max";
        studentMax.course = new Course();
        studentMax.sayHello();

        System.out.println("~~~~~~~~~~~~~~~~~~");

        Student studentAlex = new Student();
        studentAlex.name = "Alex";
        studentAlex.age = 25;
        studentAlex.course = new Course();
        studentAlex.course.name = "Java";
        studentAlex.sayHello();

        System.out.println("~~~~~~~~~~~~~~~~~~");

        Course courseJava = new Course();
        courseJava.name = "Java com.hexlet.common.Course";
        System.out.println(courseJava.name);
    }
}
