import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Player extends GameCode {
    private int ships = 7;
    public Player() {
        GUI playerPanel = new GUI("Player 1");
    }
    public int getShips(){
        return ships;
    }
}
