import java.awt.*;


public class AI extends GUI  {
    private int numShips = 5;
    private int gridSize = 10;
    Player player = new Player(true);
    Ships ship[][] = new Ships[gridSize][gridSize];

    public AI(String username) {
        super(username, 800);
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

}
