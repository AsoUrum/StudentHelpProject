package com.lasalle.exercie.studenthelpproject.model;

import java.util.Date;

public class TutorialAssignment {

    private int tutorialId;
    private  int studentId;
    private  int tutorId;
    private Date tutorialDate;
    private String tutorialDescription;

    public TutorialAssignment() {
    }

    public TutorialAssignment(int tutorialId, int studentId, int tutorId, Date tutorialDate, String tutorialDescription) {
        this.tutorialId = tutorialId;
        this.studentId = studentId;
        this.tutorId = tutorId;
        this.tutorialDate = tutorialDate;
        this.tutorialDescription = tutorialDescription;
    }

    public int getTutorialId() {
        return tutorialId;
    }

    public void setTutorialId(int tutorialId) {
        this.tutorialId = tutorialId;
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

    public Date getTutorialDate() {
        return tutorialDate;
    }

    public void setTutorialDate(Date tutorialDate) {
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
        return "TutorialAssignment{" +
                "tutorialId=" + tutorialId +
                ", studentId=" + studentId +
                ", tutorId=" + tutorId +
                ", tutorialDate=" + tutorialDate +
                ", tutorialDescription='" + tutorialDescription + '\'' +
                '}';
    }
}
