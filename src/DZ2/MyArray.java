package DZ2;

import java.lang.reflect.Array;

public  class MyArray {

    public static void myArr(String[][] a) throws MyArraySizeException, MyArrayDataException {
        int summ = 0;
        if (a.length==4) {

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = "1";
                }
            }
            for (String[] anArr : a) {
                for (String anAnArr : anArr) {
                    System.out.print(anAnArr + " ");
                }
            }
                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < a[i].length; j++) {
                        if (a[i][j].matches("[-+]?\\d+")){
                        int b = Integer.parseInt(a[i][j]);
                        summ = summ + b;
                        }else throw new MyArrayDataException();
                    }
                }
            System.out.println(summ);
        }else throw new  MyArraySizeException();
    }
    }
