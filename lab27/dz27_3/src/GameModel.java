import java.awt.*;
import java.util.Random;

public class GameModel {

    final int CELL_SIZE = 20;
    final int CANVAS_WIDTH = 30;
    final int CANVAS_HEIGHT = 20;
    final int START_SNAKE_SIZE = 5;
    final int START_SNAKE_X = CANVAS_WIDTH / 2;
    final int START_SNAKE_Y = CANVAS_HEIGHT / 2;
    final Color SNAKE_COLOR = Color.green;
    final Color FOOD_COLOR = Color.red;
    final Color BACKGROUND_COLOR = Color.black;
    final int SNAKE_DELAY = 150;

    private Random random;
    private Snake snake;
    private Food food;

    private boolean gameOver = false;

    public GameModel() {
        this.random = new Random();
        this.snake = new Snake(
                START_SNAKE_X,
                START_SNAKE_Y,
                START_SNAKE_SIZE,
                Snake.Direction.RIGHT,
                this);
        this.food = new Food(this);
    }

    public boolean isCoordinatesBusy(int x, int y) {
        return snake.isInSnake(x, y);
    }

    public Random getRandom() {
        return random;
    }

    public Snake getSnake() {
        return snake;
    }

    public void setDirection(int code) {
        snake.setDirection(code);
    }

    public Food getFood() {
        return food;
    }

    public void updateFood() {
        food.update();
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public void move() {
        snake.move();
    }
}
