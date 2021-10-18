package by.epamtc.nikalaichanka.task02.runner;

import by.epamtc.nikalaichanka.task02.ball.Ball;
import by.epamtc.nikalaichanka.task02.basket.Basket;

public class Runner {

	public static void main(String[] args) {

        Ball ball1 = new Ball("blue", 10);
        Ball ball2 = new Ball("blue", 12);
        Ball ball3 = new Ball("red", 7);
        Ball ball4 = new Ball("green", 10);

        Basket ballBasket = new Basket();

        ballBasket.throwToBasket(ball1);
        ballBasket.throwToBasket(ball2);
        ballBasket.throwToBasket(ball3);
        ballBasket.throwToBasket(ball4);

        System.out.println("Number of blue balls - " + ballBasket.blueBallCounter());
        System.out.println("Total ball weight - " + ballBasket.totalBallWeight());


	}

}
