import javax.swing.*;
import java.awt.*;

public class Application {

    public Application() {
        ShapePanel shapePanel = new ShapePanel(new Dimension(400, 400), 20);
        JButton button = new JButton("refresh");
        button.addActionListener(e -> {
            shapePanel.refresh();
            shapePanel.repaint();
        });
        JFrame frame = new JFrame();
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(shapePanel);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Application();
    }
}