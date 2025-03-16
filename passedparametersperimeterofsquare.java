public class passedparametersperimeterofsquare{
    public static void Perimeter(double sideLength) {
        double perimeter = 4 * sideLength;
        System.out.println("Perimeter of the square: " + perimeter);
    }

    public static void main(String[] args) {
        double side = 5.0;
        Perimeter(side);
    }
}
