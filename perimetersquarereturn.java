public class perimetersquarereturn{
    public static int Perimeter(int sideLength) {
        return 4* sideLength;
    }

    public static void main(String[] args) {
        int sideLength = 5;
        int perimeter = Perimeter(sideLength);
        System.out.println("The perimeter of the square is: " + perimeter);
    }
}
