package HomeWork_05;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select number q: ");
        int q = scanner.nextInt();
        int m = 5;
        int n = 3;
        int [] arr = {2, 4, 56};
        int [][] nums = new int[m][n];

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                // the first element is the same as arr
                if(i == 0){
                    nums[i][j] = arr[j];
                }
                // we multiply the value of the next array by the value of the preview multiply by q
                else{
                    nums[i][j] = nums[i-1][j] * q;
                }
            }
        }

        // print the 2 dimension array
        for(int i = 0; i < nums.length; i++){
            System.out.print("[");
            for(int j = 0; j < nums[i].length; j++){
                System.out.print(nums[i][j] + ",");
            }
            System.out.println("]");
        }


    }
}
