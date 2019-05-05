public class lesson2 {
    public static void main (String[] args) {

    invertArray();

    }

//   Задание_1

        public static void invertArray() {
            int[] arr = { 1, 0, 1, 0, 0, 1 };
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    arr[i] = 0;
                } else {
                    arr[i] = 1;

                }
            }
    }

//    Задание_2

    public static void fillArray() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            int a = 0;
            a = a +3;
            arr[i] = a;
        }
    }

//    Задание_3

    public static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (6 <= arr[i]){
                arr[1] *= 2;
            }

        }
    }

//    Задание_4

    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {



            }
        }
    }


//    Задание_5

    public static void MaxMinArr() {
        int[] arr = {23, 24, 34, 2, 3, 56};
        int min = arr[0], max = arr[0], indMax = 0, indMin = 0;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indMax = i;
            } else (arr[i] < min) {
                min = arr[i];
                indMin = i;
            }
        }
    }





    }


