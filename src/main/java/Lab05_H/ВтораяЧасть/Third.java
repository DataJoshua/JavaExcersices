package Lab05_H.ВтораяЧасть;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        int [][] arr = new int[2][3];
        Scanner input = new Scanner(System.in);
        int summ = 0;
        int multi = 1;
        int minNum = 999;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println("insert number for ["+ i +"]" + "["+ j +"]");
                arr[i][j] = input.nextInt();
                int current = arr[i][j];
                if(current >= 2 && current < 9){
                    summ += current;
                    multi *= current;
                }
                if(current < minNum ){
                    minNum = current;
                }
            }
        }

        printArray(arr);
        System.out.println("\nsum of all members: ");
        System.out.println(summ);
        System.out.println("\nmultiplication of all the members >= 2 and <= to 9 ");
        System.out.println(multi);

        for(int i = 0; i < arr[0].length; i++){
            arr[0][i] = minNum;
        }

        System.out.println("replace the first line with the min value of the array: ");
        printArray(arr);

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
}
