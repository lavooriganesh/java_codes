public class returnareaoftriangle{
    public static void main(String[] args) {
        double base = 10;
        double height = 5;
        
        double area = Area(base, height);
        System.out.println("Area of triangle: " + area);
    }

    public static double Area(double base, double height) {
        return 0.5 * base * height;
    }
}
