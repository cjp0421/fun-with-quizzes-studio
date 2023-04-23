package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class CheckBoxQuestion extends Question {

    public CheckBoxQuestion(String question, ArrayList answers) {
        super(question, answers);
    }

    @Override
    public Boolean gradeAnswers(ArrayList<String> expectedAnswer, ArrayList<String> actualAnswer) {
        return null;
    }

}
