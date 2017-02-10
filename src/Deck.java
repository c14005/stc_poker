
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c14005
 */
public class Deck extends Stack<Card>{
    Deck(){
        
    }
    
    void shuffle(){
        Collections.shuffle(this);
    }
}
