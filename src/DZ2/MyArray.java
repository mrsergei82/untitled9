package DZ2;

import java.lang.reflect.Array;

public  class MyArray {

    public static void myArr() throws MyArraySizeException, MyArrayDataException{
        int summ = 0;
        String[][] arr = new String[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = "1";
            }
        }
        for (String[] anArr : arr) {
            for (String anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int b = Integer.parseInt(arr[i][j]);
                summ = summ+b;

            }
        }
        System.out.println(summ);
    }}
