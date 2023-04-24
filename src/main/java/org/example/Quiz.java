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
              //creates an array of choiceNums that indicate the correct answer(s
              if(question.getChoiceMap().get(choiceNum).isCorrect()){
                  correctResponses.add(choiceNum);
              }
          }

          //get the actual responses and evaluate them against the correct choiceNums (above)
            ArrayList<Integer> userResponses = new ArrayList<>();
          //using a while loop and an outside incrementor allows the loop to account for the possibility the user
            // will try to enter the exact same correct answer more than once - to fool the grading loop
          //the incrementor (i) allows us to keep track of how many times the user enters an answer
            int i = 0;
            while(i < correctResponses.size()){
                System.out.println("Please enter a number: ");
                //typically, validation of user input should be included here to make sure
                //the type of the user input won't break the program
                //TO DO for later: user input validation
                int userResponse = input.nextInt();
                if(userResponses.contains(userResponse)){
                    System.out.println("You already gave that answer. Please try again.");
                } else if(!correctResponses.contains(userResponse)){
                    System.out.println("Sorry, that is incorrect. The correct answer is: ");
                    for(int resp : correctResponses){
                        System.out.println(question.getChoiceMap().get(resp).getContent());
                    }
                    break;
                } else {
                    System.out.println("Correct!");
                    userResponses.add(userResponse);
                    if(i == correctResponses.size() - 1){
                        updateScore();
                    }
                    i++;
                }
            }


        }

        input.close();

    }


}
