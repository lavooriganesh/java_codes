public class passedparameterscircumference {
      public static double Area(double radius) {
        double pi = 3.14;
        return pi * radius * radius;
    }

    public static double Circumference(double radius) {
        double pi = 3.14;
        return 2 * pi * radius;
    }

    public static void main(String[] args) {
        double radius = 5.0;
        double area = Area(radius);
        System.out.println("Area: " + area);
        double circumference = Circumference(radius);
        System.out.println("Circumference: " + circumference);
    }
}
