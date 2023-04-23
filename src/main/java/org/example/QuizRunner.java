package org.example;

import java.util.ArrayList;

public class QuizRunner {
    public static void main(String[] args) {

        ArrayList <String> answer =new ArrayList<>();
        answer.add("true");
        Question testTrueFalse1 = new TrueFalseQuestion("Is 2+2 4?", answer);
    }
}
