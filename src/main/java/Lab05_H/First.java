package Lab05_H;

public class First {
    public static void main(String[] args) {
        // 5(a - 2 + b) + 1000a

        Double a = 10.0;
        Double b = 5.0;
        Double result = 5 * (sum(rest(a,2.0), b)) + multi(1000.0, a);
        System.out.println("result is: ");
        System.out.println(result);
    }

    public static Double sum(Double a, Double b){
        return a + b;
    }

    public static Double rest(Double a, Double b){
        return a - b;
    }

    public static Double multi(Double a, Double b){
        return a * b;
    }
    public static Double divide(Double a, Double b){
        return a / b;
    }
}
