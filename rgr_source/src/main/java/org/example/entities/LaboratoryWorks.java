package org.example.entities;

public class LaboratoryWorks extends Course {
    @Override
    public boolean check(Student student) {
        System.out.println(student.getName() + " passed laboratory works");
        return checkNext(student);
    }
}
