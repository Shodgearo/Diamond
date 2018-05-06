// Game (clone diamond)

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        new Main();
    }

    private PanelClass panel, gameZone;
    private Image img;
    private final int a = 800;
    private final int b = 540;
    private final int aGZ = 600;
    private final int bGZ = 540;

    public Main() {
        initPicture();
        initPanel();
        adding();
        initFrame();
    }

    private void initPanel() {
        panel = new PanelClass(a, b){

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(img, 0, 0, this);
            }
        };

        gameZone = new PanelClass(aGZ, bGZ);
    }

    private void initPicture() {
        ImageIcon icon = new ImageIcon("Resource\\Back.png");
        img = icon.getImage();
    }

    private void adding() {
        add(gameZone, BorderLayout.WEST);
        add(panel);
    }

    private void initFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(a, b));
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
