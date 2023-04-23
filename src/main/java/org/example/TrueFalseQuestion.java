package org.example;

import java.util.ArrayList;

public class TrueFalseQuestion extends Question {
    ArrayList correctAnswer;
    public TrueFalseQuestion(String question, ArrayList answers) {
        super(question, answers);
        this.correctAnswer = correctAnswer;
    }

    public ArrayList getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(ArrayList correctAnswer) {
        this.correctAnswer = correctAnswer;
    }


    public Boolean gradeAnswers(ArrayList<String> expectedAnswer, ArrayList<String> actualAnswer) {

        if(expectedAnswer.equals(actualAnswer)){
            isCorrect = true;
        } else {
            isCorrect = false;
        }

        return isCorrect;
    }

}
