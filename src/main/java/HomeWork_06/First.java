package HomeWork_06;

public class First {
    public static void main(String[] args) {
        //sample
        // calculate 2F(a,b,c,x) + 10
        int a = 12;
        int b = 5;
        int c = 7;
        int x = 8;

        double result = 2* func(a,b,c,x) + 10;

        System.out.println(result);
    }

    public static double func(int a, int b, int c, int x){
        if(x + 10 < 0 && b != 0){
            return (a*x*x - c*x + b);
        }
        else if(x + 10 > 0){
            return ((x-a)/(x-c));
        }
        else{
            return (-x/a-c);
        }
    }
}
