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

        int options = (int)(Math.random()*3);
        switch(options){
            case noPlay :
                break;
            case ladder:
                start += diceRoll;
                break;
            case snake:
                start -= diceRoll;
                break;
        }
    }
}
