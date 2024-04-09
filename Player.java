import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class Player {
    private int gridSize = 10;
    Ships ship[][] = new Ships[gridSize][gridSize];
    public Player() implements MouseListener {
        GUI gui = new GUI("Player 1", 800);
        gui.buttonPanel.setLayout(new GridLayout(gridSize, gridSize));
        for (int r = 0; r < gridSize; r++) {
            for (int c = 0; c < gridSize; c++) {
                ship[r][c] = new Ships(r,c);
                ship[r][c].addMouseListener(this);
                gui.buttonPanel.add(ship[r][c]);
            }
        }
        gui.frame.add(gui.buttonPanel, BorderLayout.CENTER);
        gui.frame.setVisible(true);
    }
    public void checkShip(){
        Boolean prevShip = false;
        int prevShipSpot1 = 0;
        int prevShipSpot2 = 0;
        int turnCount = 0;
        Random random = new Random();
        int ranSpot1 = random.nextInt(gridSize - 2) + 2;
        int ranSpot2 = random.nextInt(gridSize - 2) + 2;
       // ship[ranSpot1][ranSpot2] = new Ships(ranSpot1,ranSpot2);
        if (ship[ranSpot1][ranSpot2].getBackground().equals(Color.BLUE) || ship[ranSpot1][ranSpot2].getBackground().equals(Color.RED)) {
            while (ship[ranSpot1][ranSpot2].getBackground().equals(Color.BLUE) || ship[ranSpot1][ranSpot2].getBackground().equals(Color.RED)) {
                ranSpot1 = random.nextInt(gridSize - 2) + 2;
                ranSpot2 = random.nextInt(gridSize - 2) + 2;
            }
        }

        if(prevShip) {
            if (turnCount != 4) {
                // North
                if(turnCount == 0) {
                    if (ship[prevShipSpot1][prevShipSpot2 + 1].getText().equals("🚢")) {
                        ship[prevShipSpot1][prevShipSpot2 + 1].setBackground(Color.RED);
//                        buttonPanel.add(ship[prevShipSpot1][prevShipSpot2 + 1]);
                    } else {
                        ship[prevShipSpot1][prevShipSpot2 + 1].setBackground(Color.BLUE);
//                        buttonPanel.add(ship[prevShipSpot1][prevShipSpot2 + 1]);
                    }
                    turnCount ++;
                }
                //South
                if(turnCount == 1) {
                    if (ship[prevShipSpot1][prevShipSpot2 - 1].getText().equals("🚢")) {
                        ship[prevShipSpot1][prevShipSpot2 - 1].setBackground(Color.RED);
//                        buttonPanel.add(ship[prevShipSpot1][prevShipSpot2 -1]);
                    } else {
                        ship[prevShipSpot1][prevShipSpot2 - 1].setBackground(Color.BLUE);
//                        buttonPanel.add(ship[prevShipSpot1][prevShipSpot2 - 1]);
                    }
                    turnCount ++;
                }
                //West
                if(turnCount == 2) {
                    if (ship[prevShipSpot1 + 1][prevShipSpot2 ].getText().equals("🚢")) {
                        ship[prevShipSpot1 + 1][prevShipSpot2].setBackground(Color.RED);
//                        buttonPanel.add(ship[prevShipSpot1 + 1][prevShipSpot2]);
                    } else {
                        ship[prevShipSpot1 + 1][prevShipSpot2].setBackground(Color.BLUE);
//                        buttonPanel.add(ship[prevShipSpot1 + 1][prevShipSpot2]);
                    }
                    turnCount ++;
                }
                //East
                if(turnCount == 3) {
                    if (ship[prevShipSpot1 - 1][prevShipSpot2 ].getText().equals("🚢")) {
                        ship[prevShipSpot1 - 1][prevShipSpot2].setBackground(Color.RED);
//                        buttonPanel.add(ship[prevShipSpot1 - 1][prevShipSpot2]);
                    } else {
                        ship[prevShipSpot1 - 1][prevShipSpot2].setBackground(Color.BLUE);
//                        buttonPanel.add(ship[prevShipSpot1 - 1][prevShipSpot2]);
                    }
                    turnCount ++;
                }
            } else {
                if (ship[ranSpot1][ranSpot2].getText().equals("🚢")) {
                    ship[ranSpot1][ranSpot2].setBackground(Color.RED);
//                    buttonPanel.add(ship[ranSpot1][ranSpot2]);

                    prevShipSpot1 = ranSpot1;
                    prevShipSpot2 = ranSpot2;
                    prevShip = true;
                } else {
                    ship[ranSpot1][ranSpot2].setBackground(Color.BLUE);
//                    buttonPanel.add(ship[ranSpot1][ranSpot2]);
                }
            }
        } else {
            if (ship[ranSpot1][ranSpot2].getText().equals("🚢")) {
                ship[ranSpot1][ranSpot2].setBackground(Color.RED);
//                buttonPanel.add(ship[ranSpot1][ranSpot2]);

                prevShipSpot1 = ranSpot1;
                prevShipSpot2 = ranSpot2;
                prevShip = true;
            } else {
                ship[ranSpot1][ranSpot2].setBackground(Color.BLUE);
//                buttonPanel.add(ship[ranSpot1][ranSpot2]);
            }
        }
//        frame.add(buttonPanel, BorderLayout.CENTER);
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
            checkShip();
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