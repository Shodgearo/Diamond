// Class for panel

import javax.swing.*;
import java.awt.*;

public class PanelClass extends JPanel {
    public PanelClass(int a, int b) {
        setPreferredSize(new Dimension(a, b));
    }

//    public PanelClass(int a, int b) {
//        setPreferredSize(new Dimension(a, b));
//        setBackground(Color.BLACK);
//    }

    @Override
    public void setPreferredSize(Dimension preferredSize) {
        super.setPreferredSize(preferredSize);
    }
}
