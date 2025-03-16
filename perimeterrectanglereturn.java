public class perimeterrectanglereturn{
    public static int Perimeter(int length, int width) {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        int length = 10;
        int width = 5;
        int perimeter =Perimeter(length, width);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
}
