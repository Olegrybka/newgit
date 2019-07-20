package lesson_4;

import java.util.Random;
import java.util.Scanner;

public class GameXO {

    static final int SIZE = 3;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DONT_EMPTY = '.';

    static char [][] map;

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args){

    intimap();
    printmap();

    }

    public static void intimap (){
        map = new char [SIZE] [SIZE];
        for (int i = 0; i < SIZE ; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DONT_EMPTY;
            }
        }
    }

    public static void printmap(){
        for (int i = 0; i < SIZE ; i++) {
            for (int j = 0; j < SIZE ; j++) {
                System.out.println(map[i][j] + " ");
            }
        }
    }




}
