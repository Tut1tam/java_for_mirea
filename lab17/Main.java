package lab15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filePath = "./src/lab15/myfile.txt";
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();


        try {
            Files.write(Paths.get(filePath), text.getBytes(), StandardOpenOption.APPEND);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
