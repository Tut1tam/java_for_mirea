import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameController {

    private GameModel gameModel;
    private GameView gameView;

    public GameController(GameModel gameModel, GameView gameView) {
        this.gameModel = gameModel;
        this.gameView = gameView;

        gameView.setFocusable(true);
        gameView.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                gameModel.setDirection(e.getKeyCode());
            }
        });
    }

    public void start() {
        Timer timer = new Timer(gameModel.SNAKE_DELAY, e -> {
            if (!gameModel.isGameOver()) {
                gameModel.move();
                gameView.repaint();
            }
        });
        timer.start();
    }
}