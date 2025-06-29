 Imports – Bringing Required Tools
java
Copy
Edit
import javax.swing.*;
javax.swing is a Java library for creating graphical user interfaces (GUIs) like windows, buttons, and labels.

java
Copy
Edit
import java.awt.event.*;
This is used to handle user actions like button clicks.

java
Copy
Edit
import java.awt.*;
Provides classes for GUI layouts, colors, fonts, etc.

java
Copy
Edit
import java.util.Random;
We use this to make the computer choose Rock, Paper, or Scissors randomly.

🔹 Class Declaration
java
Copy
Edit
public class RockPaperScissorsgameUI {
This is the main class. Its name should ideally be RockPaperScissorsGameUI (capitalize the "G").

🔹 Variables to Track Score
java
Copy
Edit
private static int playerScore = 0;
private static int computerScore = 0;
These two variables store the scores for the player and the computer.

static means they belong to the class, not to any object.

🔹 Main Method – Program Starts Here
java
Copy
Edit
public static void main(String[] args) {
This is the starting point of your Java program.

🔹 Creating the Main Game Window
java
Copy
Edit
JFrame frame = new JFrame("Rock Paper Scissors");
frame.setSize(400, 250);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JFrame is the main window.

.setSize(400, 250) makes the window 400x250 pixels.

.setDefaultCloseOperation(...) makes sure the app closes when you hit the X button.

🔹 Creating the Main Panel
java
Copy
Edit
JPanel panel = new JPanel();
panel.setLayout(new GridLayout(4, 1));
JPanel is a container for other components (like buttons/labels).

GridLayout(4,1) arranges components in 4 rows and 1 column.

🔹 Labels to Show Result and Score
java
Copy
Edit
JLabel resultLabel = new JLabel("Choose Rock, Paper, or Scissors", SwingConstants.CENTER);
JLabel scoreLabel = new JLabel("Player: 0  |  Computer: 0", SwingConstants.CENTER);
These display text messages.

resultLabel: shows the outcome of each round.

scoreLabel: shows the current score.

SwingConstants.CENTER: centers the text.

🔹 Buttons for Player Choices
java
Copy
Edit
JPanel buttonPanel = new JPanel();
JButton rockBtn = new JButton("Rock");
JButton paperBtn = new JButton("Paper");
JButton scissorsBtn = new JButton("Scissors");
A new panel (buttonPanel) to hold the Rock, Paper, Scissors buttons.

Each JButton is a clickable button.

java
Copy
Edit
buttonPanel.add(rockBtn);
buttonPanel.add(paperBtn);
buttonPanel.add(scissorsBtn);
Adds the buttons to the panel.

🔹 Button to Reset Scores
java
Copy
Edit
JButton resetBtn = new JButton("Reset Score");
Creates a Reset button that sets both scores to 0.

🔹 Game Logic When Buttons Are Clicked
java
Copy
Edit
ActionListener playListener = e -> {
This is a function that runs when any game button is clicked.

java
Copy
Edit
String playerMove = e.getActionCommand();
Gets the text of the button clicked: "Rock", "Paper", or "Scissors".

java
Copy
Edit
String[] choices = { "Rock", "Paper", "Scissors" };
String computerMove = choices[new Random().nextInt(3)];
choices is an array of possible moves.

The computer randomly picks one.

🔹 Decide Who Wins
java
Copy
Edit
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
This logic compares the player's and computer's moves.

If they are the same → Tie.

If player wins → Show win message and add 1 to player score.

Else → Computer wins and score increases.

🔹 Update the Labels
java
Copy
Edit
resultLabel.setText("Computer chose: " + computerMove + " — " + result);
scoreLabel.setText("Player: " + playerScore + "  |  Computer: " + computerScore);
Show the computer’s choice and the result.

Update the score on screen.

🔹 Link the Game Logic to Buttons
java
Copy
Edit
rockBtn.addActionListener(playListener);
paperBtn.addActionListener(playListener);
scissorsBtn.addActionListener(playListener);
This connects the Rock/Paper/Scissors buttons to the game logic.

🔹 Reset Button Logic
java
Copy
Edit
resetBtn.addActionListener(e -> {
    playerScore = 0;
    computerScore = 0;
    scoreLabel.setText("Player: 0  |  Computer: 0");
    resultLabel.setText("Scores reset. Play again!");
});
This resets scores and updates the labels when you click the reset button.

🔹 Add Everything to the Panel and Show the Window
java
Copy
Edit
panel.add(resultLabel);
panel.add(buttonPanel);
panel.add(scoreLabel);
panel.add(resetBtn);
Adds each component to the main panel (in 4 rows).

java
Copy
Edit
frame.add(panel);
frame.setVisible(true);
Adds the panel to the window.

setVisible(true) shows the window.

✅ Summary
This project:

Creates a game window

Lets you pick Rock, Paper, or Scissors

Randomly chooses for the computer

Shows who won

Tracks and resets scores

If you'd like, I can:

Add emojis to make it fun

Add sound when someone wins

Organize the code better

Just let me know!




