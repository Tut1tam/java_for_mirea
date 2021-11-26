package lab6;

public class MovablePoint {
    MovablePoints p1,p2;

    public MovablePoint(int x1, int y1, int x2, int y2) {
        this.p1 = new MovablePoints(x1,y1);
        this.p2 = new MovablePoints(x2,y2);
    }

    public MovablePoint(int x1, int y1, int speed1, int x2, int y2, int speed2) {
        this.p1 = new MovablePoints(x1,y1, speed1);
        this.p2 = new MovablePoints(x2,y2, speed2);
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(int x, int y) {
        this.p1.setX(x);
        this.p1.setY(y);
    }
    public Point getP2() {
        return p2;
    }

    public void setP2(int x, int y) {
        this.p2.setX(x);
        this.p2.setY(y);
    }

    public void move(int x1, int y1, int x2, int y2) {
        this.p1.move(x1, y1);
        this.p2.move(x2,y2);
    }

    public boolean TheSameSpeed(){
        return p1.getSpeed() == p2.getSpeed();
    }

    @Override
    public String toString() {
        return "MovablePoints{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}
