package org.example.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private StudentState state;
    private String name;
    private Map<Integer, List<String>> progress;

    public Student(String name, StudentState state) {
        this.state = state;
        this.name = name;
        this.progress = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer, List<String>> getProgress() {
        return progress;
    }

    public void newEstimate(int courseNumber, String value) {
        if (progress.get(courseNumber) == null)
            progress.put(courseNumber, new ArrayList<>());
        progress.get(courseNumber).add(value);
    }

    public StudentState getState() {
        return state;
    }

    public void setState(StudentState state) {
        this.state = state;
    }

    public int listenLectures() {
        return state.listenLectures();
    }

    public int takeLaboratoryWork() {
        return state.takeLaboratoryWork();
    }

    public int takeCourseWork() {
        return state.takeCourseWork();
    }
}
