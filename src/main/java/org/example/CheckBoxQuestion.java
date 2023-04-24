package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class CheckBoxQuestion extends Question {
    public CheckBoxQuestion(String question, Choice[] choiceArray) {
        super(question, choiceArray);
    }

    @Override
    public String toString() {
        return "\nCheck one or more:\n"+
                super.getQuestion() + "\n" +
                super.getFormattedChoices();
    }

}
