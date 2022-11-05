package org.example.entities;

public class LuckyStudent implements StudentState {
    @Override
    public int listenLectures() {
        System.out.println("Lucky student skips all classes in the hope that the teacher will not notice");
        return 10 + (int) (Math.random() * (90 + 1));
    }

    @Override
    public int takeLaboratoryWork() {
        System.out.println("A lucky student writes off all the work and hopes for a high score.");
        return 10 + (int) (Math.random() * (90 + 1));
    }

    @Override
    public int takeCourseWork() {
        System.out.println("A lucky student finds a term paper on the internet and hopes it doesn't get discovered.");
        return 10 + (int) (Math.random() * (90 + 1));
    }
}
