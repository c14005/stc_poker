
import java.util.List;
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 *
 * @author c14005
 */
public class Card {
  public enum Suit {
    DIAMOND("♢",0),CLOVER("♣",1),SPADE("♠",2),HEART("♡",3);
    private final String label;
    private final int id;
    
    private Suit(String label,int id){
            this.label = label;
            this.id = id;
    }
    String getSuitLabel(){return label;}
    int getSuitNumber(){return id;}
};
    
    public enum Rank {
   ZERO("0",0),ACE("A",1),TWO("2",2),THREE("3",3),FOUR("4",4),
   FIVE("5",5),SIX("6",6),SEVEN("7",7),EIGTH("8",8),NINE("9",9),TEN("10",10),
   JACK("J",11),QUEEN("Q",12),KING("K",13);
   
       private final String label;
       private final int id;
       
       Rank(String label,int id){this.label = label; this.id = id;}
         String getRankLabel(){return label;}
    int getRankNumber(){return id;}
    }
    static final List<Card>deck = new ArrayList<>();
    
    
    Suit suit;
    Rank rank;
    
    Card(int suit,int rank){
        this.suit = Suit.values()[suit];
        this.rank = Rank.values()[rank];
    }
    int getSuit(){
        return suit.getSuitNumber();
    }
    int getNumber(){
        return rank.getRankNumber();
    }
   /* public static ArrayList<Card> newDeck(){
            return ArrayList<Card>(deck);
    }*/
        @Override
    public String toString(){
            return String.format("%s %s",suit.getSuitLabel(),rank.getRankLabel());
                    }
    
}
