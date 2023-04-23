package org.example;

import java.util.ArrayList;

public class MultipleChoiceQuestion extends Question {


    public MultipleChoiceQuestion(String question, Choice[] choiceArray) {
        super(question, choiceArray);
    }

    @Override
    public String toString() {
        return "\nMultiple Choice:\n"+
                super.getQuestion() + "\n" +
                super.getFormattedChoices();
    }
}
