/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ALUNO
 */
public class ReadFile {
    
    private Scanner inputFile;
    
    public void openFile(){
        try{
            inputFile = new Scanner(new File("files/wordlist_pt_br.txt"));
        } catch (FileNotFoundException erro){
            erro.getMessage();
        }
    }
    
    
    public List<String> getWords(){
        List<String> wordList = new ArrayList<>();
        
        while(inputFile.hasNext()){
            String word = inputFile.next();
            wordList.add(word);
        }
        
        inputFile.close();
        
        return wordList;
    }
    
}
