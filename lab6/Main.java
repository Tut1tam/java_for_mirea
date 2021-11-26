package lab6;

public class Main {

    public static void main(String[] args) {
        MovablePoint rectangle = new MovablePoint(2,1,4,6);
        System.out.println(rectangle);
        rectangle.move(2,4,-2,1);
        System.out.println(rectangle);
        // со скоростью точек
        MovablePoint sre = new MovablePoint(1,1,3,6,7,2);
        System.out.println(sre);
        sre.move(2,3,-2,1);
        System.out.println(sre);
        if (sre.TheSameSpeed())
            System.out.println("Скорость точек одинакова");
        else
            System.out.println("Скорость точек разная");
    }
}
