package org.example.entities;

public class University {
    Course course;

    public University(Course course) {
        this.course = course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void study(Student student) {
        course.studyCourse(student);
        System.out.println(student.getName() + " end university");
    }
}
