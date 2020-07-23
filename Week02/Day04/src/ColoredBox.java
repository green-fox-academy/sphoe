import java.util.Random;
import javax.swing.*;
import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  public static void mainDraw(Graphics graphics) {
    // Draw a box that has different colored lines on each edge.
    graphics.setColor(randomColorCalculator());
    graphics.drawLine(50, 450, 100, 450);
    graphics.setColor(randomColorCalculator());
    graphics.drawLine(50, 400, 100, 400);
    graphics.setColor(randomColorCalculator());
    graphics.drawLine(50, 450, 50, 400);
    graphics.setColor(randomColorCalculator());
    graphics.drawLine(100, 450, 100, 400);
  }

  public static Color randomColorCalculator() {
    Random random = new Random();
    int rgb = 256;
    return new Color(random.nextInt(rgb), random.nextInt(rgb), random.nextInt(rgb));
  }

  // Don't touch the code below
  static int WIDTH = 500;
  static int HEIGHT = 500;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}

