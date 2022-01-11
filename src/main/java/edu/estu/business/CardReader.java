package edu.estu.business;

import edu.estu.entities.Card;
import edu.estu.entities.Elevator;

import java.util.ArrayList;

public class CardReader extends BaseReader{
    public Elevator elevator = new Elevator();
    Card card = new Card(1,"Ayten", 18, "01234567891");
    ArrayList<Card> cards = new ArrayList<>();
    public void add(){
        cards.add(card);
    }
    public void isMatches(int id,String tckn){
        /* Thıs method provıdes to compare ıs card matches*/

        System.out.println("Card is checking. ");
        for(int i = 0;i<cards.size(); i++){
            if(cards.get(i).getId()==id && cards.get(i).getTckn().equals(tckn)){
                System.out.println("Card is matches. ");
                elevator.comeElevator();
            }else {
                System.out.println("Card is not matches. ");
            }
        }
    }

}

