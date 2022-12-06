package HomeWork_06;

public class Second {
    public static void main(String[] args) {
        double cords [] = {10, 2};
        double result = calcDistance(cords);
        System.out.println(result);
    }

    public static double calcDistance(double cord[]){
        double x = cord[0];
        double y = cord[1];

        return Math.sqrt(x*x + y*y);
    }
}
