package org.example.entities;

public class University {
    Course course;

    public University() {
        this.course = Course.link(
                new Lectures(),
                new LaboratoryWorks(),
                new CourseWork(),
                new Session()
        );
    }

    public University(Course course) {
        this.course = course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void study(Student student) {
        course.check(student);
        System.out.println(student.getName() + " end university");
    }
}
