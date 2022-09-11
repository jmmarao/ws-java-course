package section08.examples.triangle.with_oop;

public class Triangle {
    public double side1;
    public double side2;
    public double side3;

    public double area() {
        double p = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
}
