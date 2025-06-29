import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    enum Choice {
        ROCK, PAPER, SCISSORS
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to Rock, Paper, Scissors!");
        
        while (true) {
            System.out.print("Enter your choice (Rock, Paper, Scissors): ");
            String playerInput = scanner.nextLine().toUpperCase();
            if (!isValidChoice(playerInput)) {
                System.out.println("Invalid input. Please choose Rock, Paper, or Scissors.");
                continue;
            }
            Choice playerChoice = Choice.valueOf(playerInput);
            Choice computerChoice = Choice.values()[random.nextInt(Choice.values().length)];
            System.out.println("You chose: " + playerChoice);
            System.out.println("The computer chose: " + computerChoice);
            String result = determineWinner(playerChoice, computerChoice);
            System.out.println(result);
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.nextLine().toLowerCase();
            
            if (!playAgain.equals("yes")) {
                break;
            }
        }
        scanner.close();
        System.out.println("Thanks for playing!");
    }
    private static boolean isValidChoice(String choice) {
        try {
            Choice.valueOf(choice);  // Try converting input to an enum
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
    private static String determineWinner(Choice playerChoice, Choice computerChoice) {
        if (playerChoice == computerChoice) {
            return "It's a tie!";
        }
        switch (playerChoice) {
            case ROCK:
                return (computerChoice == Choice.SCISSORS) ? "You win!" : "You lose!";
            case PAPER:
                return (computerChoice == Choice.ROCK) ? "You win!" : "You lose!";
            case SCISSORS:
                return (computerChoice == Choice.PAPER) ? "You win!" : "You lose!";
            default:
                return "Unexpected error!";
        }
    }
}