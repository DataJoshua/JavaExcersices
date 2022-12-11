package Lab08_H;

import java.net.CookieHandler;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Cordinates a = new Cordinates("(3, 4)");
        Cordinates b = new Cordinates();
        b.dataFromKeyboard();
        double distance = Cordinates.getDistanceBetweenTwoPoint(a, b);
        System.out.println(distance);

        // create array of 5 cordinates

        Cordinates cord1 = new Cordinates();
        cord1.dataFromKeyboard();
        Cordinates cord2 = new Cordinates();
        cord2.dataFromKeyboard();
        Cordinates cord3 = new Cordinates();
        cord3.dataFromKeyboard();
        Cordinates cord4 = new Cordinates();
        cord4.dataFromKeyboard();
        Cordinates cord5 = new Cordinates();
        cord5.dataFromKeyboard();

        Cordinates [] cords = {cord1, cord2, cord3, cord4, cord5};

        double maxValue = 0;
        Cordinates maxCord = null;
        double perimeter = 0;
        for(Cordinates cord: cords){
            double dis = cord.caluclateDistance();
            if(dis > maxValue){
                maxValue = dis;
                maxCord = cord;
            }
            System.out.println(dis);
            perimeter += cord.caluclateDistance();
        }

        System.out.println("The value with the longest distance is: ");
        System.out.println(maxCord);

        System.out.println("Area of the poligon is");
        System.out.println(perimeter);
    }
}

