import com.cs.engine.cell.Color;
import com.cs.engine.cell.Game;


public class Point{
    private static final String GoodPoint = "\u26AB";
    public boolean isAlive = true;
    int x;
    int y;


    public Point(int x, int y, boolean isAlive) {
        this.x=x;
        this.y=y;
    }

    public void draw(Game game){
        game.setCellValueEx(x,y, Color.NONE,GoodPoint,Color.RED,75);
    }

}
