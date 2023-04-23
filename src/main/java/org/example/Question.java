package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public abstract class Question {

    private final String question;
    private HashMap<Integer, Choice> choiceMap;

    public Question(String question, Choice[] choiceArray) {
        this.question = question;
        //this calls the method that creates the list of answers for a question
        createRandomizedChoiceMap(choiceArray);
    }

    public String getQuestion() {
        return question;
    }

    public HashMap<Integer, Choice> getChoiceMap() {
        return choiceMap;
    }

    @Override
    public abstract String toString();

    void createRandomizedChoiceMap(Choice[] choiceArray){
        //This takes care of creating a shuffled, numbered list of answer choices for a user to choose an answer from
        choiceMap = new HashMap<>();
        ArrayList<Choice> choiceList = new ArrayList<>();
        Collections.addAll(choiceList, choiceArray);
        Collections.shuffle(choiceList);
        for(int i=0; i < choiceList.size(); i++){
            //This is setting the key value pairs for the choiceMap
            choiceMap.put(i+1, choiceList.get(i));
        }
    }

    //the below method is called from the Quiz class when the quiz is created
    String getFormattedChoices(){
        StringBuilder formatted = new StringBuilder();
        for(int choiceNum : choiceMap.keySet()){
            String choice = "\t" + choiceNum + " - " + choiceMap.get(choiceNum).getContent() + "\n";
            formatted.append(choice);
        }
        return formatted.toString();
    }

}
