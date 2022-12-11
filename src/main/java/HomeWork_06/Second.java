package HomeWork_06;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;

public class Second {
    public static void main(String[] args) {
        Double cord1 [] = {10.0, 2.0};
        Double cord2 [] = {20.0, 23.0};
        Double cord3 [] = {2.0, 1.0};
        Double cord4 [] = {6.0, 77.0};

        ArrayList<Double> distances = new ArrayList<>();

        distances.add(calcDistance(cord1));
        distances.add(calcDistance(cord2));
        distances.add(calcDistance(cord3));
        distances.add(calcDistance(cord4));

        ArrayList<Double[]> cords = new ArrayList<>();

        cords.add(cord1);
        cords.add(cord2);
        cords.add(cord3);
        cords.add(cord4);

        // All the distances

        System.out.println("All distances");
        for(Double d: distances){
            System.out.println(d);
        }
        System.out.println("\n");

        System.out.println("The most long distance: ");
        System.out.println(getMaxDistance(distances));
        System.out.println("\n");

        System.out.println("Sum of all points in the interval [7, 10)");
        for(int i = 0; i < cords.size(); i++){
            Double [] cord =  cords.get(i);
            if(cord[0] >= 7 && cord[1] < 10){
                System.out.println("cord: [" + cord[0] + ", " + cord[1] + "]");
            }
        }
    }

    public static double calcDistance(Double cord[]){
        double x = cord[0];
        double y = cord[1];

        return Math.sqrt(x*x + y*y);
    }

    public static Double getMaxDistance(ArrayList<Double> distances){
        double max = 0;

        for(double d: distances){
            if(d > max){
                max = d;
            }
        }
        return  max;
    }
}
