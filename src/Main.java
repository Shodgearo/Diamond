// Game (clone diamond)

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        new Main();
    }

    private JPanel panel;
    private Image img;

    public Main() {
        initPicture();
        initPanel();
        adding();
        initFrame();
    }

    private void initPanel() {
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(img, 0, 0, this);
            }
        };
    }

    private void initPicture() {
        ImageIcon icon = new ImageIcon("Resource\\Back.png");
        img = icon.getImage();
    }

    private void adding() {
        add(panel);
    }

    private void initFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 540));
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
