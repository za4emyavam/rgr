package org.example.entities;

public class DiligentStudent implements StudentState {
    @Override
    public int listenLectures() {
        System.out.println("Diligent student listens to all lectures!");
        return 60 + (int) (Math.random() * (40 + 1));
    }

    @Override
    public int takeLaboratoryWork() {
        System.out.println("A diligent student listened to all lectures, so he passes all laboratory work well and on time.");
        return 60 + (int) (Math.random() * (40 + 1));
    }

    @Override
    public int takeCourseWork() {
        System.out.println("A diligent student sat down for term paper in advance, so he completed the work on time.");
        return 60 + (int) (Math.random() * (40 + 1));
    }
}
