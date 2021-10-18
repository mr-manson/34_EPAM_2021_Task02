package by.epamtc.nikalaichanka.task02.basket;

import java.util.ArrayList;

import by.epamtc.nikalaichanka.task02.ball.Ball;

public class Basket {
    ArrayList<Ball> list = new ArrayList<Ball>();

    public Basket() {
    }

    public void throwToBasket(Ball b){
        list.add(b);
    }

    public int blueBallCounter(){
        int blueBallCounter = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getColor().equals("blue")){
                blueBallCounter ++;
            }
        }
        return blueBallCounter;
    }

    public int totalBallWeight() {
        int totalBallWeight = 0;

        for (int i = 0; i < list.size(); i++) {
            totalBallWeight += list.get(i).getWeight();
        }
        return totalBallWeight;
    }



}