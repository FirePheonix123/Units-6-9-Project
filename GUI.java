import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GUI extends JPanel implements MouseListener {
    JFrame frame = new JFrame("Battleship");
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    public GUI(){}
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
    @Override
    public void mouseClicked(MouseEvent e) {
        Ships ship = (Ships) e.getSource();
        ship.setFont(new Font("Arial Unicode MS", Font.PLAIN, 40));
        //left click
        if(e.getButton() == MouseEvent.BUTTON1){
            ship.setEnabled(false);
            if (ship.getHideActionText()){
                ship.setText("🚢");
                ship.setBackground(Color.RED);
            } else {
                ship.setBackground(Color.BLUE);
            }
//            Player player = new Player(true);
//            player.checkShip();
        }
        //right click
        if(e.getButton() == MouseEvent.BUTTON3){
            ship.setText("🚢");
        }
    }
    @Override
    public void mousePressed(MouseEvent e) {

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
