package pkg;

import java.awt.*;
import java.awt.geom.Line2D;

import javax.swing.*;

class RecursionFunPanel extends JPanel {
	public RecursionFunPanel() {
		super.setPreferredSize(new Dimension(400, 400));
		super.setBackground(Color.BLACK);
	}

	public void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		
		Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke((float).1));
        g2.draw(new Line2D.Float(30, 20, 80, 90));

		super.paintComponent(g);

		/*
		 * DRAWING CODE BELOW
		 */
		g.setColor(Color.BLUE);
		//recursion(g, 0, 0, height, width, 0);
		pyramid(g, 0, width, height, 0);
	}
	
	public void recursion(Graphics g, int x, int y, int height, int width, int i) {
		if (height < 3)
			return;
		//g.drawLine(x, y, x, y+size);
		//g.drawLine(x, y, x +size, y);
		g.drawLine(x+width, y, x, y+height);
		g.setColor(Color.getHSBColor((float)(50 * i/ 360.0), (float)0.5, 1));
		recursion(g, x, y, height-5, width - 5, i+1);
		recursion(g, x + width/2, y + height/2, height/2, width/2, 0);	
	}
	
	public void pyramid(Graphics g, int x1, int x2, int height, int i) {
		if (height < 10)
			return;
		
		g.setColor(Color.getHSBColor((float)(2 * i/ 360.0), (float)0.6, 1));
		
		g.drawLine(x1, height, x2, 0);
		pyramid(g, x1+10, x2-10, height-2, i+1);
		g.drawLine(x2, height, x1, 0);
		
		
		g.setColor(Color.getHSBColor((float)(5 * i/ 360.0), (float)0.3, 1));
		
		
	}
	

}

public class RecursionFun {
	
	public static void main(String[] args) {
		/*
		 * A frame is a container for a panel The panel is where the drawing will take
		 * place
		 */
		JFrame frame = new JFrame("RecursionFun");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new RecursionFunPanel());
		frame.pack();
		frame.setVisible(true);
	}
}
