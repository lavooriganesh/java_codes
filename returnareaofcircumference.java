public class returnareaofcircumference{
    public static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        double radius = 5.0;
        double circumference = circumference(radius);
        System.out.println("Circumference is: " + circumference);
    }
}
