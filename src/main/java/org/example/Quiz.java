package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Quiz {
    private final ArrayList<Question> questions = new ArrayList<>();
    private int numCorrect = 0;

// We don't need a constructor here because we want to be able to create a quiz
    //using the default constructor and passing in no parameters


    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public int getNumCorrect() {
        return numCorrect;
    }

    //below are the instance methods

    public void addQuestions(Question[] questionArray){
        Collections.addAll(questions, questionArray);
    }

    public void updateScore(){
        numCorrect++;
    }

    public void runQuiz(){
        Scanner input = new Scanner(System.in);
        Collections.shuffle(questions);

        //the loop below loops through the questions with the user
        for(Question question : questions){
            //print the question and choices for the user
            //the custom toString method is implied in the call below
            System.out.println(question);
            //determine the correct responses, so we have something to check against
          ArrayList<Integer> correctResponses = new ArrayList<>();
          //loops through the numbers associated with the answers
          for (int choiceNum : question.getChoiceMap().keySet()){
              if(question.getChoiceMap().get(choiceNum).isCorrect()){}
          }

        }

        input.close();

    }


}
