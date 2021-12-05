import javax.swing.*;

public class Application extends JFrame {

    public Application() {
        GameModel gameModel = new GameModel();
        GameView gameView = new GameView(gameModel);
        GameController gameController = new GameController(gameModel, gameView);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(gameView);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        gameController.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Application::new);
    }

}