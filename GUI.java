import javax.swing.*;
import java.awt.*;

public class GUI extends JPanel {
    JFrame frame = new JFrame("Battleship");
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    public GUI(String username, int frameSize){
        frame.setSize(frameSize, frameSize + 25);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textLabel.setFont(new Font("Arial", Font.BOLD, 25));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setText(username);
        textLabel.setOpaque(true);
        textPanel.setLayout(new BorderLayout());
        textPanel.add(textLabel);
        frame.add(textPanel, BorderLayout.NORTH);
    }
}
