package Lab05_H;

import java.util.Scanner;
import java.util.Vector;

public class Second {
    public static void main(String[] args) {
        Vector<Double> point1 = new Vector<>();
        Vector<Double> point2 = new Vector<>();

        Scanner input = new Scanner(System.in);

        System.out.println("insert x1: ");
        Double x1 = input.nextDouble();
        System.out.println("insert y1: ");
        Double y1 = input.nextDouble();

        System.out.println("Insert x2: ");
        Double x2 = input.nextDouble();
        System.out.println("Insert y2: ");
        Double y2 = input.nextDouble();

        point1.add(x1);
        point1.add(y1);
        point2.add(x2);
        point2.add(y2);

        System.out.println("The distance between those two points is : ");
        System.out.println(calcDistance(point1, point2));

        System.out.println("distance of point1 to the origin: ");
        System.out.println(calcDistance(point1));

        System.out.println("distance of point2 to the origin: ");
        System.out.println(calcDistance(point2));

    }

    public static Double calcDistance(Vector<Double> a, Vector<Double> b){
        Double x1 = a.get(0);
        Double y1 = a.get(1);
        Double x2 = b.get(0);
        Double y2 = b.get(1);
        Double x = x2 - x1;
        Double y = y2 - y1;
        return Math.sqrt(x*x + y*y);
    }
    public static Double calcDistance(Vector<Double> a){
        Double x = a.get(0);
        Double y = a.get(1);
        return Math.sqrt(x*x + y*y);
    }
}
