public class passedparametersrectangle{
    public static void main(String[] args) {
        int area = calculateArea(10, 5);
        System.out.println("Area of rectangle: " + area);
    }

    public static int calculateArea(int length, int width) {
        return length * width;
    }
}
