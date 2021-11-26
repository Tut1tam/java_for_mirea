package lab10;

import java.util.Scanner;
public class RazvorotChisla {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        reverseDigits(in.nextInt());
    }
    public static void reverseDigits(long number) {
        if (number < 10) {
            System.out.println(number);
            return;
        }
        else {
            System.out.println(number % 10);
            reverseDigits(number/10);
        }
    }
}
