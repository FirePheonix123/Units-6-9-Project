import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GUI extends JPanel implements MouseListener {
    JFrame frame = new JFrame("Battleship");
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JButton button = new JButton("");
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

    }
    @Override
    public void mouseClicked(MouseEvent e) {
        //left click
        if(e.getButton() == MouseEvent.BUTTON1){
            button.setText("X");
        }
        //right click
        if(e.getButton() == MouseEvent.BUTTON2){
            button.setText("O");
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
