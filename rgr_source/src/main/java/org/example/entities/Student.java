package org.example.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private final String name;

    private final Map<Integer, List<String>> progress = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void newEstimate(int courseNumber, String value) {
        if (progress.get(courseNumber) == null)
            progress.put(courseNumber, new ArrayList<>());
        progress.get(courseNumber).add(value);
    }

    public Map<Integer, List<String>> getProgress() {
        return progress;
    }

    public int listenLectures() {
        System.out.println("Diligent student listens to all lectures!");
        return 60 + (int) (Math.random() * (40 + 1));
    }

    public int takeLaboratoryWork() {
        System.out.println("A diligent student listened to all lectures, so he passes all laboratory work well and on time.");
        return 60 + (int) (Math.random() * (40 + 1));
    }

    public int takeCourseWork() {
        System.out.println("A diligent student sat down for term paper in advance, so he completed the work on time.");
        return 60 + (int) (Math.random() * (40 + 1));
    }
}
