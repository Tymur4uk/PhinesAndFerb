import com.cs.engine.cell.Color;
import com.cs.engine.cell.Game;

import java.lang.reflect.Field;


public class PhinesGame extends Game {
    public static final int SIDE = 4;
    private static final String BadPoint = "\uD83D\uDC7E";
    private int score;
    public Point point;
    public BadPoint badPoint;
    public int[][] gameField;
    private static final int GOAL = 20;

    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    private void createGame() {
        gameField = new int[SIDE][SIDE];
        drawScene();
        createNewPoint();
        setScore(score);
        score = 0;
    }


    public void createNewPoint() {
        this.point = new Point(getRandomNumber(SIDE),getRandomNumber(SIDE),true);
        point.draw(this);
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        if (x == point.x && y == point.y){
            drawScene();
            createNewPoint();
            score++;
            setScore(score);
            Check();
        }else if (x != point.x && y != point.y){
            showMessageDialog(Color.GOLD,"Looooooose :(",Color.BLUE,50);
            score=0;
            setScore(score);
            createGame();
        }else if (x == badPoint.x && y == badPoint.y){
            showMessageDialog(Color.GOLD,"Looooooose :(",Color.BLUE,50);
            score=0;
            setScore(score);
            createGame();
        }
         if (score == getRandomNumber(4,8)) {
            setCellValueEx(x,y, Color.NONE,BadPoint,Color.RED,75);
        }else if (score == getRandomNumber(8,15)) {
            setCellValueEx(x,y, Color.NONE,BadPoint,Color.RED,75);
        }else if (score == getRandomNumber(16,20)) {
             setCellValueEx(x,y, Color.NONE,BadPoint,Color.RED,75);
         }

    }

    private void drawScene() {
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                setCellValueEx(i, j, Color.LIME, "");
            }
        }

    }
    public void Check(){
        if (score > GOAL){
            showMessageDialog(Color.GOLD,"You Win!!!",Color.BLUE,50);
            createGame();
        }

    }
}
