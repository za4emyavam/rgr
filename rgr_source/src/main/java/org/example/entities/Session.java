package org.example.entities;

import java.util.List;

public class Session extends Course {
    @Override
    public boolean check(Student student, int numOfCourse) {
        List<String> scores = student.getProgress().get(numOfCourse);
        if (!scores.contains("F")) {
            if (scores.contains("A")) {
                student.setState(new DiligentStudent());
            } else {
                boolean contains = true;
                for (String s : scores)
                    if (!s.equals("C")) {
                        contains=false;
                        break;
                    }
                if (contains)
                    student.setState(new LuckyStudent());
                else
                    student.setState(new LazyStudent());
            }
            return true;
        }
        return false;
    }
}
