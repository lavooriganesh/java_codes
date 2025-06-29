import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Random;

public class RockPaperScissorsgameUI {
    private static int playerScore = 0;
    private static int computerScore = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rock Paper Scissors");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        JLabel resultLabel = new JLabel("Choose Rock, Paper, or Scissors", SwingConstants.CENTER);
        JLabel scoreLabel = new JLabel("Player: 0  |  Computer: 0", SwingConstants.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton rockBtn = new JButton("Rock");
        JButton paperBtn = new JButton("Paper");
        JButton scissorsBtn = new JButton("Scissors");

        buttonPanel.add(rockBtn);
        buttonPanel.add(paperBtn);
        buttonPanel.add(scissorsBtn);

        JButton resetBtn = new JButton("Reset Score");

        ActionListener playListener = e -> {
            String playerMove = e.getActionCommand();
            String[] choices = { "Rock", "Paper", "Scissors" };
            String computerMove = choices[new Random().nextInt(3)];

            String result;
            if (playerMove.equals(computerMove)) {
                result = "It's a tie!";
            } else if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
                       (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
                       (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
                result = "You win!";
                playerScore++;
            } else {
                result = "You lose!";
                computerScore++;
            }

            resultLabel.setText("Computer chose: " + computerMove + " — " + result);
            scoreLabel.setText("Player: " + playerScore + "  |  Computer: " + computerScore);
        };

        rockBtn.addActionListener(playListener);
        paperBtn.addActionListener(playListener);
        scissorsBtn.addActionListener(playListener);

        resetBtn.addActionListener(e -> {
            playerScore = 0;
            computerScore = 0;
            scoreLabel.setText("Player: 0  |  Computer: 0");
            resultLabel.setText("Scores reset. Play again!");
        });

        panel.add(resultLabel);
        panel.add(buttonPanel);
        panel.add(scoreLabel);
        panel.add(resetBtn);

        frame.add(panel);
        frame.setVisible(true);
    }
}
