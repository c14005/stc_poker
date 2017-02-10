
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c14005
 */
public class PokerTester { 
    static Deck cards;
    static Player humanPlayer;
    static Player computerPlayer;
        
    public static void main(String[] args){
        // Deck cards = new Deck();
       Scanner stdIn = new Scanner(System.in);
             
        humanPlayer = new HumanPlayer("Taro",100);
        computerPlayer = new ComputerPlayer("Jiro",100);
            cards = Cards.newCards();
            cards.shuffle();
            dealCards();
            int change;
                do{
                  humanPlayer.displayHand();
                System.out.println("change?1~5");change = stdIn.nextInt();
                if(humanPlayer.getHandNum()>=change)
                    humanPlayer.drawOut(change-1);
                
                }while(humanPlayer.getHandNum()>=change);
            while(humanPlayer.getHandNum() != 5){
                humanPlayer.drawIn(cards);
            }
            
            humanPlayer.displayHand();
            humanPlayer.hantei();
             computerPlayer.displayHand();
            computerPlayer.hantei();
            winlose(humanPlayer,computerPlayer);
            
            
    }
    static void dealCards(){
    for(int i=0;i<5;i++){
        humanPlayer.drawIn(cards);
        computerPlayer.drawIn(cards);
} }
    static void winlose(Player p1,Player p2){
        if(p1.getHantei()>p2.getHantei())
            System.out.printf("%sの勝ち",p1.getName());
        else if(p1.getHantei()<p2.getHantei())
            System.out.printf("%sの勝ち",p2.getName());
        else
            System.out.printf("引き分け");
}
    
}

