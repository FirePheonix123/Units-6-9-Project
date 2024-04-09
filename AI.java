import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class AI extends GUI implements MouseListener {
    private int numShips = 3;
    private int gridSize = 7;
    Player player = new Player(true);
    Ships ship[][] = new Ships[gridSize][gridSize];

    public AI() {
        super("AI", 600);
        buttonPanel.setLayout(new GridLayout(gridSize, gridSize));
        setShips();
        for (int r = 0; r < gridSize; r++) {
            for (int c = 0; c < gridSize; c++) {
                ship[r][c] = new Ships(r,c);
                ship[r][c].setEnabled(true);
            }
        }
        setShips();
        for (int r = 0; r < gridSize; r++) {
            for (int c = 0; c < gridSize; c++) {
                ship[r][c].addMouseListener(this);
                buttonPanel.add(ship[r][c]);
            }
        }
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
    public void setShips(){
        for(int i = 0; i < numShips; i ++){
            int plane = (int)(Math.random() * 1) + 1;
            int ranSpot = (int)(Math.random() * (gridSize - 1)) + 1;
            for(int j = i; j < numShips; j++){
                if (plane == 1) {
                    ship[ranSpot][j] = new Ships(ranSpot,j);
                    ship[ranSpot][j].setHideActionText(true);
                }
                if (plane == 2) {
                    ship[j][ranSpot] = new Ships(j,ranSpot);
                    ship[j][ranSpot].setHideActionText(true);
                }
            }
        }
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
            player.checkShip();
        }
        //right click
        if(e.getButton() == MouseEvent.BUTTON3){
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
