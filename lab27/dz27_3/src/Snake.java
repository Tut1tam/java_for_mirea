
import java.awt.*;
import java.util.LinkedList;

public class Snake {

    enum Direction {

        LEFT(37),
        UP(38),
        RIGHT(39),
        DOWN(40),
        UNKNOWN(-1);

        private final int code;

        Direction(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }

        public static Direction fromCode(int code) {
            for (Direction direction : values()) {
                if (direction.code == code) {
                    return direction;
                }
            }
            return UNKNOWN;
        }
    }

    private LinkedList<Cell> snake;
    private Direction direction;
    private GameModel gameModel;

    public Snake(int x, int y, int length, Direction direction, GameModel gameModel) {
        snake = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            snake.add(new Cell(x - i, y, gameModel.CELL_SIZE, gameModel.SNAKE_COLOR));
        }
        this.direction = direction;
        this.gameModel = gameModel;
    }

    public void setDirection(int code) {
        Direction direction = Direction.fromCode(code);
        if (direction != Direction.UNKNOWN) {
            if (Math.abs(this.direction.getCode() - direction.getCode()) != 2) {
                this.direction = direction;
            }
        }

    }

    public boolean isInSnake(int x, int y) {
        for (Cell cell : snake)
            if ((cell.getX() == x) && (cell.getY() == y))
                return true;
        return false;
    }


    public void move() {
        int x = snake.getFirst().getX();
        int y = snake.getFirst().getY();

        switch (direction) {
            case LEFT -> {
                x -= 1;
                if (x < 0) {
                    x = gameModel.CANVAS_WIDTH - 1;
                }
            }
            case UP -> {
                y -= 1;
                if (y < 0) {
                    y = gameModel.CANVAS_HEIGHT - 1;
                }
            }
            case RIGHT -> {
                x += 1;
                if (x == gameModel.CANVAS_WIDTH) {
                    x = 0;
                }
            }
            case DOWN -> {
                y += 1;
                if (y == gameModel.CANVAS_HEIGHT) {
                    y = 0;
                }
            }
        }

        if (isInSnake(x, y)) {
            gameModel.setGameOver(true);
            return;
        }
        snake.addFirst(new Cell(x, y, gameModel.CELL_SIZE, gameModel.SNAKE_COLOR));
        if (gameModel.getFood().isFood(x, y)) {
            gameModel.updateFood();
        } else {
            snake.removeLast();
        }
    }

    public void paint(Graphics2D g) {
        for (Cell cell : snake)
            cell.paint(g);
    }

}