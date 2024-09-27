public class MainClass {
    public static void main (String[] args) {

//2
        byte val = - 123;
        short val1 = (short) - 34567;
        int val2 = 34;
        long val3 = 34567890345L;
        float val4 = 12.34f;
        double val5 = 23.345;
        char val6 = 2;
        boolean val7 = true;

//3
        System.out.println(calculate(3,21,34,56 ));
//4
        task10and20(7,8);
//5
        isPositiveOrNegative(0);
//6
        isNegativ(34);
//7
        sgretings("Олег");
        

        }

        public static double calculate (double a, double b, double c, double d ){
            return a * (b + (c / d));

    }

        public static boolean task10and20 (int a, int b){
            return (a + b)>=10 && (a + b)<=20;
    }

        public static void isPositiveOrNegative (int x){
            if ((x>=0)&&(x<=2147483647)){
                System.out.println("Число положительное");
            } else {
                System.out.println("Число отрицательное");
            }

    }

        public static boolean isNegativ (int x){
            if (x>2147483647){
                return true;
            }
            return false;
    }

        public static void sgretings (String name) {
            System.out.println("Привет, " + name);
        }



}


