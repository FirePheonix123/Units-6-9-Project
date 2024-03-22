import javax.swing.*;
import java.awt.*;

public class AI extends GUI{
    private int ships = 7;
    private int gridSize = 10;
    private int numButton = 100;
    public AI(){
        super("AI");
        buttonPanel.setLayout(new GridLayout(gridSize, gridSize));
        for (int i = 0; i < numButton; i++) {
            button = new JButton("");
            buttonPanel.add(button);
            addMouseListener(this);
        }
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
