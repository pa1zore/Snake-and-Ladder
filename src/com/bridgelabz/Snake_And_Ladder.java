package com.bridgelabz;

public class Snake_And_Ladder {
    public static final int noPlay = 0;
    public static final int ladder = 1;
    public static final int snake = 2;
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder game");
        //Snake and Ladder game played with single player at start position 0
        int start = 0;
        int diceRoll = (int) (Math.random() * 6) + 1;
        int c = 0;
        do{
            int options = (int)(Math.random()*3);
            switch(options){
                case noPlay :
                    break;
                case ladder:
                    start += diceRoll;
                    if(start>100){
                        start -=diceRoll;
                    }
                    break;
                case snake:
                    start -= diceRoll;
                    if(start < 0){
                        start = 0;
                    }
                    break;
            }
            c++;
            System.out.println("dice :"+diceRoll+" position: "+ start);
        }while(start<100);
        System.out.println("Dice thrown: "+c);
    }
}
