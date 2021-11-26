package lab8_1;

import javax.swing.*;
import java.awt.*;

public class CreateBox extends JFrame {
    public CreateBox(){
        setSize(new Dimension(1000, 1000));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        JPanel p = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(Color.BLUE);
                g2.fillRect(50,50,100,200);

                g2.setColor(Color.cyan);
                g2.fillOval(150,150,200,100);
            }
        };
        this.getContentPane().add(p);
    }

}
