package lab5;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(1,1, 4);
        System.out.println(circle);
        MovablePoint pointMovable = new MovablePoint(10,10);
        System.out.println(pointMovable);
        pointMovable.move(12,22);
        System.out.println(pointMovable);
        MovableCircle circleMovable = new MovableCircle(3,3, 6);
        System.out.println(circleMovable);
        circleMovable.move(10,20);
        System.out.println(circleMovable);
    }
}
