public class passedparameterstriangle {
    public static void main(String[] args) {
        double area = Area(10, 5);
        System.out.println("Area of triangle is: " + area);
    }

    public static double Area(double base, double height) {
        return 0.5 * base * height;
    }
}
