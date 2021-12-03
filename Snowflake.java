package pkg;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

class SnowFlakePanel extends JPanel {
	public SnowFlakePanel() {
		super.setPreferredSize(new Dimension(400, 400));
		super.setBackground(Color.WHITE);
	}

	public void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();

		super.paintComponent(g);

		/*
		 * DRAWING CODE BELOW
		 */
		g.setColor(Color.BLUE);
		// g.drawLine(0, 0, width - 1, height - 1);
		Random rand = new Random();
		

		for (int i = 0; i <= (width + height)/40; i++) {
			g.setColor(Color.getHSBColor((float)(10 * i/ 360.0), 1, 1));
			drawStar(g, rand.nextInt(getWidth()), rand.nextInt(getHeight()), rand.nextInt(50));
		}
	}

	public void drawStar(Graphics g, int x, int y, int size) {
		for (int i = 0; i < 6; i++) {
			if (size <= 5)
				return;
			double x2 = size * Math.cos(i * (2 * Math.PI) / 6);
			double y2 = size * Math.sin(i * (2 * Math.PI) / 6);
			g.drawLine(x, y, x - (int) x2, y - (int) y2);

			drawStar(g, x - (int) x2, y - (int) y2, size / 3);
		}

	}
}

public class Snowflake {
	public static void main(String[] args) {
		/*
		 * A frame is a container for a panel The panel is where the drawing will take
		 * place
		 */
		JFrame frame = new JFrame("Snowflake");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new SnowFlakePanel());
		frame.pack();
		frame.setVisible(true);
	}
}
