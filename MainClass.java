package lesson_3;
import java.util.Scanner;

public class MainClass {

    public static Scanner sc = new Scanner(System.in);


    public static void main (String[] args) {
        int UserNumber;
        int Count = 0;
        System.out.println("Задача, угадать число от 0 до 9, у Вас есть 3 попытки");
        int UnknownNumber = (int)(Math.random() * 9);
        do {
           if(Count < 3){
               Count++;
           } else break;
           UserNumber = getNumberForScanner("Введите число от 0 до 9", 0, 9 );
           if (UserNumber > UnknownNumber){
               System.out.println("Загаданное число меньше");
           } else if (UserNumber < UnknownNumber){
               System.out.println("Загаданное число больше");
           } else {
               System.out.println("Вы угадали");
           }
        } while (UserNumber != UnknownNumber);
        System.out.println("Конец игры");
    }

    public static int getNumberForScanner (String message, int min, int max){
        int x;
        do {
            System.out.println(message);
            x = sc.nextInt();
        } while (x < min || x > max);
        return x;
    }




}
