import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public interface IDocument {
    public default void createGUI() {
        Frame frame = new JFrame("Test frame");
        ((JFrame) frame).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Verdana", Font.PLAIN, 11);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        fileMenu.setFont(font);

        JMenu newMenu = new JMenu("New");
        newMenu.setFont(font);
        fileMenu.add(newMenu);

        JMenuItem txtFileItem = new JMenuItem("Text file");
        txtFileItem.setFont(font);
        newMenu.add(txtFileItem);

        txtFileItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CreateTextDocument createTextDocument = new CreateTextDocument();
                createTextDocument.CreateNew();
                JOptionPane.showConfirmDialog(frame, "Вы успешно создали текстовый файл!", "Внимание!", JOptionPane.DEFAULT_OPTION);
            }
        });

        JMenuItem imgFileItem = new JMenuItem("Image file");
        imgFileItem.setFont(font);
        newMenu.add(imgFileItem);

        imgFileItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(frame, "Вы успешно создали графический файл!", "Внимание!", JOptionPane.DEFAULT_OPTION);
            }
        });

        JMenuItem musiicItem = new JMenuItem("Music File");
        musiicItem.setFont(font);
        newMenu.add(musiicItem);

        musiicItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(frame, "Вы успешно создали музыкальный файл!", "Внимание!", JOptionPane.DEFAULT_OPTION);
            }
        });

        JMenu openMenu = new JMenu("Open");
        openMenu.setFont(font);
        fileMenu.add(openMenu);

        JMenuItem txtFileItem2 = new JMenuItem("Text file");
        txtFileItem2.setFont(font);
        openMenu.add(txtFileItem2);

        txtFileItem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CreateTextDocument createTextDocument = new CreateTextDocument();
                createTextDocument.CreateOpen();
                JOptionPane.showConfirmDialog(frame, "Вы успешно создали текстовый файл!", "Внимание!", JOptionPane.DEFAULT_OPTION);
            }
        });

        JMenuItem imgFileItem2 = new JMenuItem("Image file");
        imgFileItem2.setFont(font);
        openMenu.add(imgFileItem2);

        imgFileItem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(frame, "Вы успешно создали графический файл!", "Внимание!", JOptionPane.DEFAULT_OPTION);
            }
        });

        JMenuItem musiicItem2 = new JMenuItem("Music File");
        musiicItem2.setFont(font);
        openMenu.add(musiicItem2);

        musiicItem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(frame, "Вы успешно создали музыкальный файл!", "Внимание!", JOptionPane.DEFAULT_OPTION);
            }
        });

        JMenuItem saveItem = new JMenuItem("Save");
        saveItem.setFont(font);
        fileMenu.add(saveItem);


        fileMenu.addSeparator();

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setFont(font);
        fileMenu.add(exitItem);

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuBar.add(fileMenu);

        ((JFrame) frame).setJMenuBar(menuBar);

        frame.setPreferredSize(new Dimension(270, 225));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}