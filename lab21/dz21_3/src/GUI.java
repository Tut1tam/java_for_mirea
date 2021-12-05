import javax.swing.*;

public class GUI extends JFrame implements IDocument {
    public GUI() {
        createGUI();
        pack();
    }
    public static void main(String[] args) {
        new GUI();
    }
}
