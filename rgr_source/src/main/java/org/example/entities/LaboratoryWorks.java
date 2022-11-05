package org.example.entities;

public class LaboratoryWorks extends Course {
    @Override
    public boolean check(Student student, int numOfCourse) {
        int score = student.takeLaboratoryWork();
        if(numOfCourse == 1 && score < 60)
            score += 20;
        student.newEstimate(numOfCourse, scoreInString(score));
        if (score < 60)
            return false;
        else
            return checkNext(student, numOfCourse);
    }
}
