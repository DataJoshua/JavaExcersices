package Lab05_H.ВтораяЧасть;

// Целочисленный двумерный массив a размером (3 х 4)
// заполнить случайными целыми числами из диапазона [0, 30]

import java.lang.reflect.Array;
import java.util.ArrayList;

public class First {
    public static void main(String[] args) {
        int [][] c = new int[3][4];
        int result = 0;
        int minNumber = 30;
        int[] minNumCords = new int[2];

        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c[i].length; j++){
                c[i][j] = (int)Math.floor(Math.random() * 30);
                int current = c[i][j];
                result += current;
                if(current < minNumber){
                    minNumber = current;
                    minNumCords[0] = i;
                    minNumCords[1] = j;
                }

            }
        }

        // print the 2 dimension array
        for(int i = 0; i < c.length; i++){
            System.out.print("[");
            for(int j = 0; j < c[i].length; j++){
                System.out.print(c[i][j]+ ", ");
            }
            System.out.println("]");
        }

        String msg = "Мы получили нечетны чисел";

        if(result % 2 == 0){
            msg = "Мы получили четны чисел!";
        }
        System.out.println("sum of all the members:" + result);
        System.out.println(msg);
        System.out.println("");
        System.out.println("min number: " + minNumber);
        System.out.println("In the array ["+ minNumCords[0] + "][" + minNumCords[1] + "]");

        //  получить одномерный массив x, где значение xj равно сумме элементов j-го столбца массива a

        ArrayList<Integer> b = new ArrayList<>();

        for(int i = 0; i < c.length; i++){
            int sum = 0;
            for(int j = 0; j < c[i].length; j++){
                sum+= c[i][j];
            }
            b.add(sum);
        }

        System.out.println("resulting array of the sum of every row: ");
        for(int j: b){
            System.out.print(j+",");
        }
    }
}
