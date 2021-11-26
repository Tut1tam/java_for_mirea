package lab5;

public class Circle {
    protected Point center;
    protected double radius;
    private String color = "blue";

    public Circle(int x, int y, double radius) {
        this.center = new Point(x,y);
        this.radius = radius;
    }

    public Circle() {
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(int x, int y) {
        this.center.setX(x);
        this.center.setY(y);
    }

    public String getColor() {
        return color;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(radius,2) * Math.PI ;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
