package DZ2;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args){
        String[][] nArr = new String[4][4];
        try {
            MyArray.myArr(nArr);
        }catch (MyArraySizeException e){

        }catch (MyArrayDataException e){
            e.printStackTrace();
        }


    }
}
