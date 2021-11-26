package lab8_2;

import javax.swing.*;
import javax.swing.text.Element;
import javax.swing.text.html.ImageView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CreateImg extends JFrame {
    public CreateImg() {
        setSize(new Dimension(1000, 1000));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        JPanel p = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                Image image = new ImageIcon("/Users/mishakurylev/Desktop/CF/ком.jpeg").getImage();
                g2.drawImage(image, 3, 4, this);

            }
        };
        this.getContentPane().add(p);

    }
}
