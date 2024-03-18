import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GUI extends JPanel implements MouseListener {
    private String winner = "-";
    private int player1Ships = 0;
    private int AIShips = 0;
    JFrame frame = new JFrame("Battleship");
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();
    JButton buttonPanel = new JButton();
    public GUI(String username, int gridSize, int numButton){
        frame.setSize(800, 825);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textLabel.setFont(new Font("Arial", Font.BOLD, 25));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setText(username);
        textLabel.setOpaque(true);
       // textPanel.setLayout(new BorderLayout());
        textPanel.add(textLabel);
        frame.add(textPanel, BorderLayout.NORTH);


        buttonPanel.setLayout(new GridLayout(gridSize, gridSize));
        for (int i = 0; i < numButton; i++) {
            buttonPanel.add(new JButton(""));
        }
        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.setVisible(true);

        addMouseListener(this);
    }

    public JFrame getFrame(){
        return frame;
    }
    public JLabel getTextLabel(){
        return textLabel;
    }
    public JButton getButtonPanel(){
        return buttonPanel;
    }
    public void setWinner(String winner) {
        this.winner = winner;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        //left click
        if(e.getButton() == MouseEvent.BUTTON1){
            buttonPanel.setText("\uD83D\uDEA9");
            frame.add(buttonPanel);
        }
        //right click
        if(e.getButton() == MouseEvent.BUTTON2){
            buttonPanel.setText(" ");
        }
    }

    public void mousePressed(MouseEvent e){
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
