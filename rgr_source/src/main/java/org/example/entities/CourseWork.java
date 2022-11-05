package org.example.entities;

public class CourseWork extends Course {
    @Override
    public boolean check(Student student) {
        System.out.println(student.getName() + " passed course work");
        return checkNext(student);
    }
}
