package Lab09_H;

import Lab08_H.Cordinates;

import java.net.CookieHandler;

public class Second {
    public static void main(String[] args) {
        // Taking into consideration that the y is 0
        Cylinder cylinder = new Cylinder(new Cordinates(2, 2), new Cordinates(1, 1), 10.0);

        System.out.println(cylinder);
        System.out.println("radius");
        System.out.println(cylinder.radius());

        System.out.println("Volume");
        System.out.println(cylinder.getVolume());
    }
}

class Cylinder{
    protected Cordinates cordOfAPointOfTheCircle;
    protected Cordinates cordOfCenterCircle;
    protected Double height;

    public Cylinder(Cordinates cordOfAPoint, Cordinates cordOfCenterCircle, Double height) {
        this.cordOfAPointOfTheCircle = cordOfAPoint;
        this.cordOfCenterCircle = cordOfCenterCircle;
        this.height = height;
    }

    public Double radius(){
        return Cordinates.getDistanceBetweenTwoPoint(this.cordOfCenterCircle, this.cordOfAPointOfTheCircle);
    }

    public Double getDiameter(){
        return 2 * radius();
    }

    public Double getVolume(){
        Double radius = radius();
        return  Math.PI * radius*radius * height;
    }

    public Double getPermimeter(){
        return this.height * radius();
    }

    public Double surfaceArea(){
        return  2 * Math.PI * height;
    }

    public Cordinates getCordOfAPoint() {
        return cordOfAPointOfTheCircle;
    }

    public void setCordOfAPoint(Cordinates cordOfAPoint) {
        this.cordOfAPointOfTheCircle = cordOfAPoint;
    }

    public Cordinates getCordOfCenterCircle() {
        return cordOfCenterCircle;
    }

    public void setCordOfCenterCircle(Cordinates cordOfCenterCircle) {
        this.cordOfCenterCircle = cordOfCenterCircle;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "cordOfAPointOfTheCircle=" + cordOfAPointOfTheCircle +
                ", cordOfCenterCircle=" + cordOfCenterCircle +
                ", height=" + height +
                '}';
    }
}

class TriangularPrism extends Cylinder{

    private Cordinates basePoint;


    public TriangularPrism(Cordinates cordOfAPoint, Cordinates cordOfCenterCircle, Cordinates basePoint,Double height) {
        super(cordOfAPoint, cordOfCenterCircle, height);
        this.basePoint = basePoint;
    }

    public Double getVolume(){
        Double a = Cordinates.getDistanceBetweenTwoPoint(this.basePoint, this.cordOfAPointOfTheCircle);
        Double b = Cordinates.getDistanceBetweenTwoPoint(this.cordOfAPointOfTheCircle, this.cordOfCenterCircle);
        Double c = Cordinates.getDistanceBetweenTwoPoint(this.cordOfCenterCircle, this.cordOfAPointOfTheCircle);
        Double h = this.height;

        Double expression = - Math.pow(a, 4)
                + 2 * (a*b)*(a*b)
                + 2 * (a*c)*(a*c)
                - Math.pow(b, 4)
                + 2 * (b*c)*(b*c)
                - Math.pow(c, 4);

        return (1/4 * h * Math.sqrt(expression));
    }

    public Double surfaceArea(){
        Double a = Cordinates.getDistanceBetweenTwoPoint(this.basePoint, this.cordOfAPointOfTheCircle);
        return  a * height;
    }

}

class RectangularPrism extends Cylinder{

    private Cordinates pointC;
    private Cordinates pointD;

    public RectangularPrism(Cordinates cordOfAPoint, Cordinates cordOfCenterCircle, Double height, Cordinates pointC, Cordinates pointD) {
        super(cordOfAPoint, cordOfCenterCircle, height);
        this.pointC = pointC;
        this.pointD = pointD;
    }

    public Double getVolume(){
        Double a = Cordinates.getDistanceBetweenTwoPoint(this.cordOfAPointOfTheCircle, this.cordOfCenterCircle);
        Double b = Cordinates.getDistanceBetweenTwoPoint(this.cordOfCenterCircle, this.pointC);

        Double h = this.height;

        return h * a * b;
    }

    public Double surfaceArea(){
        Double a = Cordinates.getDistanceBetweenTwoPoint(this.cordOfAPointOfTheCircle, this.cordOfCenterCircle);
        Double b = Cordinates.getDistanceBetweenTwoPoint(this.cordOfCenterCircle, this.pointC);

        return a * b;
    }


}