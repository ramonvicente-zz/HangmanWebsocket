/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;
import java.util.Random;
import utils.ReadFile;

/**
 *
 * @author ramon
 */
public class HangmanMessage {
    
    private char hint;
    private int hintCounter;
    private String word;

    public char getHint() {
        return hint;
    }

    public void setHint(char hint) {
        this.hint = hint;
    }

    public int getHintCounter() {
        return hintCounter;
    }

    public void setHintCounter(int hintCounter) {
        this.hintCounter = hintCounter;
    }
    
    //pega a palavra por meio do arquivo
    public String getWord() {
        ReadFile file = new ReadFile();
        file.openFile();
        List<String> wordList = file.getWords();
        
        Random random = new Random();
        int randomWordIndex = random.nextInt(wordList.size()-1);
        
        return wordList.get(randomWordIndex);
    }

    public void setWord(String word) {
        this.word = word;
    }
    
    
    
}
