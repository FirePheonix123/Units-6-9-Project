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
    public GUI(String username){
        frame.setSize(800, 825);
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

        boardPanel.setLayout(new GridLayout(8, 8));
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton(""));

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
