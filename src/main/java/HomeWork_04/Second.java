package HomeWork_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a EVEN number: ");
        int n = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < n; i ++){
            System.out.println("insert " + (i + 1) + " num:");
            arr.add(scanner.nextInt());
        }

        ArrayList<Double> result = new ArrayList<>();

        // we create a new array based in the conditions
        for(int j: arr){
            double toAdd = 0;

            if(j <= -3){
                toAdd = 2 * 1/3;
            }
            else if((j > -3) && (j < 3)){
                double valueInsideCos = (Math.PI * (j -1))/ (2 * j);
                toAdd = (-2 + j*j)* Math.cos(valueInsideCos);
            }
            else{
                toAdd = ((j + 3)/(j - 1/ Math.pow(j - 1, 3))) * (j/(-2 + j));
            }
            result.add(toAdd);
        }

        System.out.println("Result: ");
        // we just print the array
        for(double d: result){
            System.out.print(d+", ");
        }
        System.out.println("\n");

        int count = 0;
        double maxY = -99;
        double valueOfX = 0;

        System.out.println("CORDS:");

        // we loop the result array and get the values in pairs
        for(int i = 0; i < result.size() - 1; i++){
            double x = result.get(i);
            System.out.print("x" + i + " =" + x);
            System.out.print("  ");
            double y = result.get(i + 1);
            System.out.print("y" + i + " =" + y);
            System.out.println("");

            // we prove if the cord is in the first quadrant by verifying that the values are greater than 0
            if(x > 0 && y > 0){
                count++;
                //System.out.println("cord : " + x + ", " + y + " is in the first quadrant");
            }

            // find the greater y value
            if(y > maxY){
                maxY = y;
                valueOfX = x;
            }

        }

        System.out.println("\n" + count + " points are in the first quadrant");
        System.out.println("\nThe max y value is " + maxY + ", and x is equal to: " + valueOfX);
    }
}
