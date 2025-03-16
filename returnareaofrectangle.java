public class returnareaofrectangle {
    public static void main(String[] args) {
        int length = 10;
        int width = 5;
        
        int area = Area(length, width);
        System.out.println("Area of rectangle: " + area);
    }

    public static int Area(int length, int width) {
        return length * width;
    }
}
