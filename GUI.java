import javax.swing.*;
import java.awt.*;
public class GUI extends JPanel{
    private String winner = "-";
    private int player1Ships = 0;
    private int AIShips = 0;
    private JFrame frame = new JFrame("Battleship");
    private JLabel textLabel = new JLabel();
    private JPanel textPanel = new JPanel();
    private JPanel boardPanel = new JPanel();
    public GUI(){
        frame.setSize(800, 870);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textLabel.setFont(new Font("Arial", Font.BOLD, 25));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setText("Winner: " + winner);

        textLabel.setOpaque(true);

        textPanel.setLayout(new BorderLayout());
        textPanel.add(textLabel);
        frame.add(textPanel, BorderLayout.NORTH);

        boardPanel.setLayout(new GridLayout(8, 8)); //8x8
        frame.add(boardPanel);
        frame.setVisible(true);
    }
    public JFrame getFrame(){
        return frame;
    }
    public JLabel getTextLabel(){
        return textLabel;
    }
    public JPanel getTextPanel(){
        return textPanel;
    }
    public JPanel getBoardPanel(){
        return boardPanel;
    }
    public void setWinner(String winner) {
        this.winner = winner;
    }
}
