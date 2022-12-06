package HomeWork_05;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        int [][] arr = new int[4][4];

        Scanner input = new Scanner(System.in);

        double result = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println("Insert value for[" + i +"]["+ j +"]");
                arr[i][j] = input.nextInt();
            }
        }

        result += arr[0][3];
        result += arr[1][2];
        result += arr[2][1];
        result += arr[3][0];

        // print the array
        for(int i = 0; i < arr.length; i++){
            System.out.print("[");
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + ",");
            }
            System.out.println("]");
        }


        System.out.println("\nTotal of the diagonal:");
        System.out.println(result);
    }
}
