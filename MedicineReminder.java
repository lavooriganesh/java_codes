import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

class MedicineReminder{
    private JFrame frame;
    private JTextField medicineField, timeField;
    private JTextArea logArea;
    private List<Reminder> reminders = new ArrayList<>();

    public MedicineReminder() {
        frame = new JFrame("Medicine Reminder");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Top panel for input
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));

        inputPanel.add(new JLabel("Medicine Name:"));
        medicineField = new JTextField();
        inputPanel.add(medicineField);

        inputPanel.add(new JLabel("Reminder Time (HH:MM):"));
        timeField = new JTextField();
        inputPanel.add(timeField);

        JButton addButton = new JButton("Add Reminder");
        inputPanel.add(addButton);

        frame.add(inputPanel, BorderLayout.NORTH);

        // Log Area
        logArea = new JTextArea();
        logArea.setEditable(false);
        frame.add(new JScrollPane(logArea), BorderLayout.CENTER);

        // Button Action
        addButton.addActionListener(e -> addReminder());

        // Start background reminder checker
        startReminderChecker();

        frame.setVisible(true);
    }

    private void addReminder() {
        String medName = medicineField.getText().trim();
        String time = timeField.getText().trim();

        if (!medName.isEmpty() && time.matches("\\d{2}:\\d{2}")) {
            reminders.add(new Reminder(medName, time));
            logArea.append("Added reminder: " + medName + " at " + time + "\n");
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid input. Time format: HH:MM");
        }
    }

    private void startReminderChecker() {
        Timer timer = new Timer(true); // Daemon timer
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                String currentTime = LocalTime.now().withSecond(0).withNano(0).toString().substring(0, 5);
                for (Reminder r : reminders) {
                    if (r.time.equals(currentTime)) {
                        SwingUtilities.invokeLater(() -> {
                            JOptionPane.showMessageDialog(frame,
                                    "Time to take your medicine: " + r.name,
                                    "Reminder",
                                    JOptionPane.INFORMATION_MESSAGE);
                        });
                    }
                }
            }
        }, 0, 60000); // Check every minute
    }

    class Reminder {
        String name, time;

        Reminder(String name, String time) {
            this.name = name;
            this.time = time;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MedicineReminder::new);
    }
}
