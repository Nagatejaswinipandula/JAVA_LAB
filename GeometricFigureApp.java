import javax.swing.*;
import java.awt.*;

public class GeometricFigureApp extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw a triangle
        g.drawLine(100, 100, 150, 50);   // Line from point A to B
        g.drawLine(150, 50, 200, 100);   // Line from point B to C
        g.drawLine(200, 100, 100, 100);  // Line from point C to A
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Geometric Figure");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.add(new GeometricFigureApp());
        frame.setVisible(true);
    }
}
