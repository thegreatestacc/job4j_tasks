package com.sovliv.job4j.condition;

public class Game {
    public static int checkGame(double percent, int prize, int pay) {
        int result = 0;
        if(percent * prize > pay) {
            result = (int) ((percent * prize) - pay);
        } else if(percent * prize <= 0){
            result = 0;
        }
        return result;
    }
}
