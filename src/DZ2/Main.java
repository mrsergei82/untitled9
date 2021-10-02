package DZ2;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args){
        String[][] nArr = new String[4][4];
        try {
            MyArray.myArr(nArr);
        }catch (MyArraySizeException e){
            System.out.println("нужен массив 4 на 4");

        }catch (MyArrayDataException e){
            System.out.println("Что-то пошло нетак");
            e.printStackTrace();
        }


    }
}
