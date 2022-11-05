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
        for (int i = 1; i <= 4; i++) {
            if (!course.check(student, i)) {
                System.out.println("Student " + student.getName() + " expelled on " + i + " course!");
                return;
            }
        }
        System.out.println(student.getName() + " end university");
    }
}
