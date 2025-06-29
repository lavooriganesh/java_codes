import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MovieTicketBookingSystem {
    private JFrame frame;
    private JComboBox<String> movieList;
    private JSpinner ticketCount;
    private JTextArea outputArea;
    private JButton bookButton;

    public MovieTicketBookingSystem() {
        frame = new JFrame("Movie Ticket Booking System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Top Panel - Movie and ticket selection
        JPanel topPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        topPanel.add(new JLabel("Select Movie:"));
        String[] movies = {"Avengers': Endgame", "BAHUBALI", "PUSHPA", "SINGLE", "SAALAR"};
        movieList = new JComboBox<>(movies);
        topPanel.add(movieList);

        topPanel.add(new JLabel("Number of Tickets:"));
        ticketCount = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
        topPanel.add(ticketCount);

        bookButton = new JButton("Book Tickets");
        topPanel.add(bookButton);

        frame.add(topPanel, BorderLayout.NORTH);

        // Output Area
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        frame.add(new JScrollPane(outputArea), BorderLayout.CENTER);

        // Book Button Action
        bookButton.addActionListener(e -> bookTickets());

        frame.setVisible(true);
    }

    private void bookTickets() {
        String selectedMovie = (String) movieList.getSelectedItem();
        int tickets = (int) ticketCount.getValue();
        int pricePerTicket = 150;
        int totalPrice = tickets * pricePerTicket;

        String receipt = "🎟️ Booking Confirmed!\n"
                       + "-----------------------\n"
                       + "Movie: " + selectedMovie + "\n"
                       + "Tickets: " + tickets + "\n"
                       + "Price per Ticket: ₹" + pricePerTicket + "\n"
                       + "Total Price: ₹" + totalPrice + "\n\n";

        outputArea.append(receipt);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MovieTicketBookingSystem::new);
    }
}
