import com.cs.engine.cell.Color;
import com.cs.engine.cell.Game;


public class BadPoint{
    private static final String BadPoint = "\uD83D\uDC7E";
    public boolean isAlive = true;
    int x;
    int y;


    public BadPoint(int x, int y, boolean isAlive) {
        this.x=x;
        this.y=y;
    }

    public void draw(Game game){
        game.setCellValueEx(x,y, Color.NONE, BadPoint,Color.RED,75);
    }

}
