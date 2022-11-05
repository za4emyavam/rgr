package org.example.entities;

public class Lectures extends Course {
    @Override
    public boolean check(Student student) {
        System.out.println(student.getName() + " listened lectures.");
        return checkNext(student);
    }
}
