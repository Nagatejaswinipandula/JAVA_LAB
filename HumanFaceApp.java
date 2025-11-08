import javax.swing.*;
import java.awt.*;

public class HumanFaceApp extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Face outline
        g.drawOval(100, 100, 200, 200);

        // Eyes
        g.drawOval(150, 150, 20, 10); // Left eye
        g.drawOval(230, 150, 20, 10); // Right eye

        // Pupils
        g.fillOval(155, 152, 10, 8);
        g.fillOval(235, 152, 10, 8);

        // Nose
        g.drawLine(200, 160, 200, 200);

        // Mouth
        g.drawArc(150, 200, 100, 50, 0, -180);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Human Face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new HumanFaceApp());
        frame.setVisible(true);
    }
}
