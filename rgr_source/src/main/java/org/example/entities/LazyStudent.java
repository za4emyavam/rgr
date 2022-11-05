package org.example.entities;

public class LazyStudent implements StudentState {
    @Override
    public int listenLectures() {
        System.out.println("A lazy student often sleeps during lectures.");
        return 30 + (int) (Math.random() * (70 + 1));
    }

    @Override
    public int takeLaboratoryWork() {
        System.out.println("A lazy student turns in work late.");
        return 30 + (int) (Math.random() * (70 + 1));
    }

    @Override
    public int takeCourseWork() {
        System.out.println("A lazy student sat down for a term paper at the last moment, so he received an appropriate mark.");
        return 30 + (int) (Math.random() * (70 + 1));
    }
}
