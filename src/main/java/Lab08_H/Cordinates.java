package Lab08_H;

import java.util.Scanner;

public class Cordinates {

    private double x;
    private double y;
    private String cord;
    private Scanner scanner = new Scanner(System.in);
    ;

    public Cordinates(double x, double y) {
        this.x = x;
        this.y = y;
        this.cord = "(" + x + ", " + y + ")";
    }

    public Cordinates(String cord) {
        if (cord.length() < 30) {
            this.cord = cord;
        }

        String[] sub = this.cord.substring(1, this.cord.length() - 1).split(", ");
        this.x = Double.parseDouble(sub[0]);
        this.y = Double.parseDouble(sub[1]);
    }

    public Cordinates() {
        this.x = 0;
        this.y = 0;
        this.cord = "(" + x + ", " + y + ")";
    }


    // Gtters and Setters

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void dataFromKeyboard() {
        System.out.println("Insert x:");
        this.setX(Double.parseDouble(scanner.nextLine()));

        System.out.println("Insert y:");
        this.setY(Double.parseDouble(scanner.nextLine()));

        setCord("(" + this.x + ", " + this.y + ")");
    }

    public void multiplyByScalar(double scalar) {
        this.x *= scalar;
        this.y *= scalar;
        setCord("(" + this.x + ", " + this.y + ")");
    }

    public Double caluclateDistance() {

        double x = this.x;
        double y = this.y;

        double expresion = x * x + y * y;

        return Math.sqrt(expresion);
    }

    public static double getDistanceBetweenTwoPoint(Cordinates a, Cordinates b) {

        double exa = (b.x - a.x);
        double exb = (b.y - a.y);

        return Math.sqrt(exa * exa + exb + exb);
    }

    public String getCord() {
        return cord;
    }

    public void setCord(String cord) {
        this.cord = cord;
    }

    @Override
    public String toString() {
        return "Cordinates{" +
                "x=" + x +
                ", y=" + y +
                ", cord='" + cord + '\'' +
                ", scanner=" + scanner +
                '}';
    }
}
