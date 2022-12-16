package Lab05_H.ВтораяЧасть;

import java.util.ArrayList;

public class Second {
    public static void main(String[] args) {
        // По заданному n построить и вывести на экран двумерные массивы a размером n х n , содержащие
        System.out.println("a: ");
        printArray(a());
        System.out.println("b: ");
        printArray(b());
        System.out.println("c: ");
        printArray(c());
    }

    public static void printArray(int arrayTo [][]){
        for(int i = 0; i < arrayTo.length; i++){
            System.out.print("[");
            for(int j = 0; j < arrayTo[i].length; j++){
                System.out.print(arrayTo[i][j]+ ", ");
            }
            System.out.println("]");
        }
    }

    public static int[][] a(){
        int [][] arr = new int[5][5];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(i == j){
                    arr[i][j] = 1;
                    continue;
                }
                arr[i][j] = 0;
            }
        }
        return  arr;
    }

    public static int[][] b(){

        int [][] arr = new int[6][6];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = i;
            }
        }
        return  arr;
    }

    public static int[][] c(){

        int [][] arr = new int[6][6];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = j + 1;
            }
        }
        return  arr;
    }

    public static int[][] d(){

        int [][] arr = new int[5][5];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){

            }
        }
        return  arr;
    }

}
