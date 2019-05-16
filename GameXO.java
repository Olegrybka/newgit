import java.util.Random;  //при запуске выдает ошибку на 117, 49, 118, 49 строке
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

        while (true){
            humanTurr();
            printmap();
            if(checkLane(DOT_X) || checkDiagonal(DOT_X)){
                System.out.println("Вы победитель");
                break;
            }

            if (isFull()){
                System.out.println("Ничья");
                break;
            }

            airTurr();
            printmap();
            if(checkLane(DOT_O) || checkDiagonal(DOT_O)){
                System.out.println("Компьютер победил");
                break;
            }

            if (isFull()){
                System.out.println("Ничья");
                break;
            }
        }
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
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE ; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE ; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void humanTurr (){
        int x,y;
        do{
            System.out.println("Введите координаты X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!inCallValid(y,x));
        map[y][x] = DOT_X;
    }

    public static void airTurr (){
        int x,y;
        do{
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);

        } while (!inCallValid(y,x));
        map[y][x] = DOT_O;
    }

    public static boolean inCallValid(int y, int x){
        if (x < 0 || y < 0 || x > SIZE || y > SIZE){
            return false;
        }
        return map [y][x] == DONT_EMPTY;
    }

    public  static boolean isFull (){
        int k = 0;
        for (int i = 0; i < SIZE ; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map [i][j] == DONT_EMPTY){
                    k++;
                }
            }
        }
        return k == 0;
    }

    public static boolean checkLane(char symbol){
        boolean col, row = true;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                col = col & (map[i][j] == symbol;
                row = row & (map[i][j] == symbol;
                if (col || row) {
                    return true;
                } return false;

            }


        }




//        if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol)return true;
//        if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol)return true;
//        if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol)return true;
//
//        if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol)return true;
//        if (map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol)return true;
//        if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol)return true;
//
//        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol)return true;
//        if (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol)return true;

//        return false;

    }

        public static boolean checkDiagonal(char symbol){
            boolean toright, toleft = true;

            for (int i=0; i<SIZE; i++) {
                toright = toright & (map[i][i] == symbol);
                toleft = toleft & (map[SIZE-i-1][i] == symbol);

                if (toright){
                    return true;
                } return false;

        }
    }
}
