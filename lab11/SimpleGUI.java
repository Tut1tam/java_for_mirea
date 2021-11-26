package lab11;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class SimpleGUI extends JFrame{
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Введите число от 0 до 20: ");

    public SimpleGUI(){
        super("Угадайка");
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2, 2, 2));
        container.add(label);
        container.add(input);

        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }
    class ButtonEventListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            String message = "";
            //int popitka = 0;
            //int chisloRand = (int)(Math.random()*21);

            int number = Integer.parseInt(input.getText());
            if (Main.popitka == 3) {
                message += "Попытки закончились.\nПерезапустите приложение.\n";
            }
            else if ((number > 20) && (Main.popitka < 4)) {
                message += "Число " + number + " больше 20\nВведите другое число.\n";
            }
            else if ((number < 0) && (Main.popitka < 4)) {
                message += "Число " + number + " меньше 0\nВведите другое число.\n";
            }
            else if (Main.popitka < 4) {
                if (number == Main.chisloRand) {
                    message += "Вы угадали!\nДля выхода закройте все окна.";
                }
                else if (number > Main.chisloRand) {
                    message += "Число больше чем заданное.\n";
                }
                else if (number < Main.chisloRand) {
                    message += "Число меньше чем заданное.\n";
                }
                Main.popitka++;
            }
            message += "Колличество попыток: " + (3 - Main.popitka) + "\n";
            message += "\"\"Число загаданное компьютером равно: " +Main.chisloRand + "\"\"";
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
