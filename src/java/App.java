
import models.HangmanMessage;
import utils.ReadFile;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUNO
 */
public class App {
    
    public static void main(String[] Args){
        HangmanMessage m = new HangmanMessage();
        System.out.println(m.getWord());
    } 
}
