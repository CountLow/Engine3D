import java.awt.*;
import javax.swing.*;

public class Renderer extends Canvas {
    // TEMPORARY
    Vector2[] points = new Vector2[4];

    public Renderer() {
        JFrame frame = new JFrame();
        frame.add(this);
        frame.setSize(800, 450);
        frame.setVisible(true);

        // TEST
        points[0] = new Vector2(100,100);
        points[1] = new Vector2(300,100);
        points[2] = new Vector2(100,300);
        points[3] = new Vector2(300,300);
    }

    public void paint(Graphics g) {
        render(g, points);
    }

    public void render(Graphics g, Vector2[] points) {
        g.setColor(Color.BLACK);


        for(Vector2 p1 : points) {
            for(Vector2 p2 : points) {
                if (p1 == p2) continue;

                g.drawLine((int) p1.x, (int) p1.y, (int) p2.x, (int) p2.y);
            }
        }
    }

}
