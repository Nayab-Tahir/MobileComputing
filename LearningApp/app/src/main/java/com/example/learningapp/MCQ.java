package com.example.learningapp;

public class MCQ {
    int imageID;
    int correctOpt;
    String option1;
    String option2;
    String option3;
    String option4;
    boolean isCorrect;

    public MCQ(int imageID, String option1, String option2, String option3, String option4, int correctOpt) {
        this.imageID = imageID;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.correctOpt = correctOpt;
    }
}
