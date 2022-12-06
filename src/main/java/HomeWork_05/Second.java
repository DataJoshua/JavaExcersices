package HomeWork_05;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insert m: ");
        int m = input.nextInt();
        System.out.println("insert n: ");
        int n = input.nextInt();

        int[][] arr = new int[m][n];

        int[] maxValues = new int[m];

        // fill maxValues with 0
        for(int i = 0; i < maxValues.length; i++){
            maxValues[i] = 0;
        }

        // fill the 2 dimension array with user input
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println("Insert the value ["+ i +"][" + j +"]");
                arr[i][j] = input.nextInt();

                // search for the max value in each row
                int current = arr[i][j];
                if(current > maxValues[i]){
                    maxValues[i] = current;
                }
            }
        }

        System.out.println("max values per row:");
        for(int k: maxValues){
            System.out.println("max: " + k);
        }
    }
}
