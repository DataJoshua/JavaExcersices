package Lab05_H;

public class Fifth {
    public static void main(String[] args) {
        Double n = 6.0;
        Double m = 2.0;

        Double calc = (factorial(n) + factorial(m)) / factorial(n+m);

        System.out.println("result is: ");
        System.out.println(calc);

        System.out.println(power(2.0, 3.0));

        System.out.println("for the power of two");

        System.out.println("5^2");
        System.out.println(power(5.0, 2.0));

        Double expression = power(2.0, 5.0) + power(4.0,2.0);

        System.out.println("2^5 + 4^2");
        System.out.println(expression);
    }

    public static Double factorial(Double n){

        Double result = 1.0;

        for(int i = 1; i <= n; i++){
            result = result*i;
        }

        return  result;
    }

    public static Double power(Double x, Double n){
        Double base = x;
        Double exponent = n;
        Double result = 1.0;

        for(int i = 0; i < exponent; i++){
            result *= base;
        }

        return result;
    }
}
