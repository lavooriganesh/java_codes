public class upperlowercases{
    public static void main(String[] args) {
        char ch = 'A'; // Example input character

        // Check if the character is an uppercase letter
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase letter.");
        }
        // Check if the character is a lowercase letter
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase letter.");
        } else {
            System.out.println(ch + " is not a letter.");
        }
    }
}
