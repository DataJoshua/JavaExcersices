package Lab05_H;

import java.util.ArrayList;
import java.util.function.DoubleUnaryOperator;

public class Fourth {
    public static void main(String[] args) {
        printSquare(4,4);
        printSquare();
        printChess( 3.0 );
    }

    public static void printSquare(int colums, int rows){
        for(int i = 0; i < colums; i++){
            for(int j =0; j < rows; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void printSquare(){
        for(int i = 0; i < 4; i++){
            for(int j =0; j < 4; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printChess(Double m){

        StringBuilder chess1 = new StringBuilder();
        StringBuilder chess2 = new StringBuilder();

        for(int i = 0; i < m; i++){
            chess1.append("*").append(" ");
            chess2.append(" ").append("*");
        }

        for(int i = 0; i < m / 2; i++){
            for(int j = 0; j < m / 2; j++){
                System.out.println(chess1);
                System.out.println(chess2);
            }
        }

    }
}
