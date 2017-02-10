
import java.util.ArrayList;
import java.util.List;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c14005
 */
public class Player {
    private String name;
    private int coins = 0;
    private ArrayList<Card> hand ;
    private        int flash=0;
    private    int pea = 0;
    private    int morecard=0;
    public Player(String name,int num){
        this.name = name;
        this.coins = num;
        hand = new ArrayList<>();
    }
    public void  displayHand(){
        System.out.print(hand);
    }
    
    public void setCoins(int num){
        this.coins = num;
    }
    
    public void bet(int num){
        coins -= num;
    }
    Card drawOut(int index){
        return hand.remove(index);
    }
    
    public String getName(){
        return name;
    }
    void drawIn(Deck card){
        hand.add(card.remove(0));
    }
    public int getHandNum(){
        return hand.size();
    }
    public int getHantei(){
        int result=0;
         if(flash == 1){
            result +=4;
        }
        if(morecard == 2){
            result += 5;
        }
        if(morecard == 1){
            if(pea==1)
                    result+=6;
            result += 3;
        }
        if(pea==2){
            result += 2;
        }
        if(pea == 1){
            result += 1;
        }
        
        
        return result;
    }
    
    public void hantei(){

        
        
         for(int i=0;i<5;i++)
            for(int j=i+1;j<5;j++)
                if(hand.get(i).getNumber() >hand.get(j).getNumber()){
                   Card bmp =  hand.get(i);
                    hand.set(i,hand.get(j));
                    hand.set(j, bmp);
                }
        
        
        if(hand.get(0).getSuit()==hand.get(1).getSuit())
            if(hand.get(0).getSuit()==hand.get(2).getSuit())
                if(hand.get(0).getSuit()==hand.get(3).getSuit())
                    if(hand.get(0).getSuit()==hand.get(4).getSuit())
                            flash++;
        
        for(int i=0;i<4;i++){  
        if(hand.get(i).getNumber()==hand.get(i+1).getNumber()){
              pea++;
              if((i+2)<hand.size())
                  if(hand.get(i+1).getNumber()==hand.get(i+2).getNumber()){
                       morecard++;
                        pea -= 2;

        }
        }
        }
       
        
        if(flash == 1){
            System.out.println("フラッシュ");
        }
        else   if(morecard == 2){
            System.out.println("フォーカード");
        }
         else   if(morecard == 1){
             if(pea==1)
                System.out.println("フルハウス");
             else
                System.out.println("スリーカード");
        }
         else   if(pea==2){
            System.out.println("ツーペア");
        }
         else   if(pea == 1){
            System.out.println("わんぺあ");
        }
         else
            System.out.println("ブタ");
        
    }

}
