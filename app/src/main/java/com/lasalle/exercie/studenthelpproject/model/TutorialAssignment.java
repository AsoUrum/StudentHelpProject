package com.lasalle.exercie.studenthelpproject.model;

import java.util.Date;

public class TutorialAssignment {

    private  int studentId;
    private  int tutorId;
    private String tutorialDate;
    private String tutorialDescription;

    public TutorialAssignment() {
    }

    public TutorialAssignment(int studentId, int tutorId, String tutorialDate, String tutorialDescription) {
        this.studentId = studentId;
        this.tutorId = tutorId;
        this.tutorialDate = tutorialDate;
        this.tutorialDescription = tutorialDescription;
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getTutorId() {
        return tutorId;
    }

    public void setTutorId(int tutorId) {
        this.tutorId = tutorId;
    }

    public String getTutorialDate() {
        return tutorialDate;
    }

    public void setTutorialDate(String tutorialDate) {
        this.tutorialDate = tutorialDate;
    }

    public String getTutorialDescription() {
        return tutorialDescription;
    }

    public void setTutorialDescription(String tutorialDescription) {
        this.tutorialDescription = tutorialDescription;
    }


    @Override
    public String toString() {
        return " tutorId=" + tutorId +
                ", tutorialDate=" + tutorialDate +
                ", tutorialDescription='" + tutorialDescription + '\'' 
                ;
    }
}
