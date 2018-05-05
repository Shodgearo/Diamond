// Game (clone diamond)

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        new Main();
    }

    private JPanel panel, gameZone;
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

        gameZone = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

            }

            @Override
            public void setBackground(Color bg) {
                super.setBackground(Color.BLACK);
            }

            @Override
            public void setPreferredSize(Dimension preferredSize) {
                super.setPreferredSize(new Dimension(300, 200));
            }
        };
    }

    private void initPicture() {
        ImageIcon icon = new ImageIcon("Resource\\Back.png");
        img = icon.getImage();
    }

    private void adding() {
        panel.setLayout(new BorderLayout());
        panel.add(gameZone, BorderLayout.SOUTH);
        add(panel, BorderLayout.CENTER);
    }

    private void initFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800, 540));
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
