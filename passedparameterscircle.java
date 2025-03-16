public class passedparameterscircle{
    public static void main(String[] args) {
        double area = Area(5 );
        System.out.println("Area of circle is: " + area);
    }

    public static double Area(double radius) {
        return Math.PI * radius * radius;
    }
}
