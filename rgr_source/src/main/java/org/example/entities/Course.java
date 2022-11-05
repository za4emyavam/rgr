package org.example.entities;

public class Course {
    public void studyCourse(Student student) {
        lectures(student);
        laboratoryWorks(student);
        session(student);
    }

    private void lectures(Student student) {
        System.out.println(student.getName() + " listened lectures.");
    }

    private void laboratoryWorks(Student student) {
        System.out.println(student.getName() + " passed laboratory works");
    }

    private void session(Student student) {
        System.out.println(student.getName() + " passed session");
    }
}
