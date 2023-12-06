package com.bridgelabz;

public class Snake_And_Ladder {
    public static final int noPlay = 0;
    public static final int ladder = 1;
    public static final int snake = 2;
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder game");
        //Snake and Ladder game played with single player at start position 0
        int start1 = 0;
        int start2 = 0;
        int c1 = 0;
        int c2 = 0;
        c1 = whoWins(start1,c1);
        c2 = whoWins(start2,c2);
        System.out.println("throws taken by player1 :" + c1);
        System.out.println("throws taken by player1 :" + c2);
        if(c1>c2){
            System.out.println("Player 2 wins");
        }else{
            System.out.println("Player 1 wins");
        }
    }
    public static int whoWins(int start, int c){
        do{
            int diceRoll = (int) (Math.random() * 6) + 1;
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
        }while(start<100);
        return c;
    }
}
