public class passedparametersperimeterofrectangle{
    public static int Perimeter(int length, int width) {
        return 2 * (length + width);
    }
    
    public static void main(String[] args) {
        // Passing parameters directly to the method
        int length = 5;
        int width = 3;
        
        int perimeter = Perimeter(length, width);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
}
