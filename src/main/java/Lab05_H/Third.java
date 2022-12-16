package Lab05_H;

import java.beans.PropertyEditorSupport;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double a = input.nextDouble();
        Double b = input.nextDouble();

        // calculate 12.5 + f(2) – f(4)*f(10) + f(a) – f(b) + f(ab)

        Double result = 12.5 + f(2.0) - f(4.0) * f(10.0) + f(a) - f(b) + f(a*b);

        System.out.println(result);

        System.out.println("\n");
        System.out.println("insert values for the array: ");

        ArrayList<Double> nums = new ArrayList<>();
        ArrayList<Double> nums2 = new ArrayList<>();

        for(int i = 0; i < 7; i ++){
            Double num = input.nextDouble();
            nums.add(num);
        }

        for(int i=0; i< nums.size(); i++){
            Double res = nums.get(i);
            nums2.add(f(res));
        }

        System.out.println("negative elements: ");
        printNegativeElements(nums2);

        System.out.println("max element: ");
        System.out.println(getMaxElement(nums2));
    }

    public static Double f(Double x){
        if(x > 0){
            return 2.0 * 1/3;
        }
        else if(x >= 0 && x < 2*Math.PI){
            return (x*x -3);
        }
        else{
            return ((1+x*x*x)/(2*x));
        }
    }

    public  static void printNegativeElements(ArrayList<Double> arr){
        for(Double d: arr){
            if(d < 0){
                System.out.println(d);
            }
        }
    }

    public static Double getMaxElement(ArrayList<Double> arr){
        Double max = 0.0;

        for(Double d:arr){
            if(d > max){
                max = d;
            }
        }
        return max;
    }
}
