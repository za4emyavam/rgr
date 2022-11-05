package org.example.entities;

public abstract class Course {
    private Course next;

    public static Course link(Course first, Course ... chain) {
        Course head = first;
        for (Course nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    public abstract boolean check(Student student, int numOfCourse);

    protected boolean checkNext(Student student, int numOfCourse) {
        if (next == null) {
            return true;
        }
        return next.check(student, numOfCourse);
    }

    protected String scoreInString(int score) {
        if (score >= 90)
            return "A";
        else if (score >= 75)
            return "B";
        else if (score >= 60)
            return "C";
        else
            return "F";
    }
}
