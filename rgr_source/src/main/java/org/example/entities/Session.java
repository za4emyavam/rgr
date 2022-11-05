package org.example.entities;

public class Session extends Course {
    @Override
    public boolean check(Student student) {
        System.out.println(student.getName() + " passed session");
        return checkNext(student);
    }
}
