package com.example.collegeschedule;

public class Subject {
    private String numberLesson;
    private String titleLesson;
    private String teacherLesson;
    private String cabinetLesson;
    private String typeLesson;

    public Subject(String numberLesson, String titleLesson, String teacherLesson, String cabinetLesson, String typeLesson) {
        this.numberLesson = numberLesson;
        this.titleLesson = titleLesson;
        this.teacherLesson = teacherLesson;
        this.cabinetLesson = cabinetLesson;
        this.typeLesson = typeLesson;
    }

    public String getNumberLesson() {
        return numberLesson;
    }

    public void setNumberLesson(String numberLesson) {
        this.numberLesson = numberLesson;
    }

    public String getTitleLesson() {
        return titleLesson;
    }

    public void setTitleLesson(String titleLesson) {
        this.titleLesson = titleLesson;
    }

    public String getTeacherLesson() {
        return teacherLesson;
    }

    public void setTeacherLesson(String teacherLesson) {
        this.teacherLesson = teacherLesson;
    }

    public String getCabinetLesson() {
        return cabinetLesson;
    }

    public void setCabinetLesson(String cabinetLesson) {
        this.cabinetLesson = cabinetLesson;
    }

    public String getTypeLesson() {
        return typeLesson;
    }

    public void setTypeLesson(String typeLesson) {
        this.typeLesson = typeLesson;
    }
}
