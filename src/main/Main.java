package main;

import computer.Computer;
import course.Course;
import student.Student;

public class Main {

    public static void main(String[] args) {

        Student studentDragan = new Student();
        studentDragan.info();

        Course courseQA = new Course("QA kurs", 15);
        courseQA.info();
        
        Computer computer1 = new Computer(3.4, 8, 250);
        computer1.info();
        
        Student student2 = new Student("Dragan", "Korac", 1979, courseQA, computer1);
        student2.info();

    }

}
