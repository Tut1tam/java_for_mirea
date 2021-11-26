package lab15;

import java.util.Scanner;
import java.io.*;

public class File {
    public static void main(String[] args) {

        //ввод в файл
        try(FileWriter writer = new FileWriter("./src/lab15/test.txt", false))
        {
            Scanner scanner = new Scanner(System.in);
            String textIn = scanner.nextLine();

            // запись всей строки (ввод с клавиатуры)
            String text = textIn;
            writer.write(text);

            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        //вывод из файла
        try(FileReader reader = new FileReader("./src/lab15/test1.txt"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}
