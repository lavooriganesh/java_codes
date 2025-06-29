import javax.swing.*;

public class ticket {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Movie Ticket Booking");
        String[] movies = {"Select", "Avengers", "Batman", "Oppenheimer"};
        
        JComboBox<String> movieBox = new JComboBox<>(movies);
        JTextField ticketField = new JTextField(5);
        JButton bookBtn = new JButton("Book");
        
        bookBtn.addActionListener(e -> {
            String movie = (String) movieBox.getSelectedItem();
            String tickets = ticketField.getText();
            if (!movie.equals("Select") && !tickets.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Booked " + tickets + " tickets for " + movie);
            } else {
                JOptionPane.showMessageDialog(frame, "Please select a movie and enter tickets.");
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Movie:"));
        panel.add(movieBox);
        panel.add(new JLabel("Tickets:"));
        panel.add(ticketField);
        panel.add(bookBtn);
        
        frame.add(panel);
        frame.setSize(350, 120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}