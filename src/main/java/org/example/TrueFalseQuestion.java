package org.example;

import java.util.ArrayList;

public class TrueFalseQuestion extends Question {
    public TrueFalseQuestion(String question, Choice[] choiceArray) {
        super(question, choiceArray);
    }

    @Override
    public String toString() {
        return "\nTrue or False:\n"+
                super.getQuestion() + "\n" +
                super.getFormattedChoices();
    }

}
