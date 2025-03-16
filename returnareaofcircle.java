public class returnareaofcircle{
    public static double Area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        double radius = 5.0;
        double area = Area(radius);
        System.out.println("Area of the circle is: " + area);
    }
}
