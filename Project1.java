//Robert Brandl
// September 5, 2019
// Project 1: Intro
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Project1 extends JApplet implements MouseListener, ActionListener
{
	JButton b1;
	JLabel l1;
	int  times = 0, ax, ay, bx, by, cx, cy;
	double  perimeter = 0;
	public void init ()
	{
		setContentPane (new DrawingPanel());
		Container c = getContentPane ();
		setFocusable (true);
		addMouseListener (this);
		b1 = new JButton ("Reset");
		l1 = new JLabel ("The perimeter is " + perimeter + ".");
		b1.addActionListener (this);
		c.add (b1);
		c.add (l1);
	}
	public void mouseClicked (MouseEvent e)
	{
		times++;
		double side1=0, side2=0, side3=0;
		if (times == 1)
		{
			ax = e.getX();
			ay = e.getY();
		}
		else if (times == 2)
		{
			bx = e.getX();
			by = e.getY();
			side1 = Math.sqrt (Math.pow((bx-ax),2) + Math.pow((by-ay),2));
		}
		else if (times == 3)
		{
			cx = e.getX();
			cy = e.getY();
			side2 = Math.sqrt (Math.pow((cx-bx),2) + Math.pow((cy-by),2));
			side3 = Math.sqrt (Math.pow((ax-cx),2) + Math.pow((ay-cy),2));
			perimeter = side1 + side2 + side3;
		}
		else if (times > 3)
		{
			times = 3;
		}
		repaint();
		l1.setText ("The perimeter is " + perimeter + ".");
	}
	public void mouseExited (MouseEvent e)
	{
	}
	public void mouseEntered (MouseEvent e)
	{
	}
	public void mouseReleased (MouseEvent e)
	{
	}
	public void mousePressed (MouseEvent e)
	{
	}
	public void actionPerformed (ActionEvent e)
	{
		if (e.getSource () == b1)
		{
			times = 0;
			perimeter = 0;
			repaint ();
			l1.setText ("The perimeter is " + perimeter + ".");
		}
	}
	public class DrawingPanel extends JPanel
	{
		public void paintComponent (Graphics g)
		{
			super.paintComponent(g);
			if (times == 1)
			{
				g.fillOval (ax - 5, ay - 5, 10, 10);
			}
			if (times == 2)
			{
				g.fillOval (ax-5, ay-5, 10, 10);
				g.fillOval (bx-5, by-5, 10, 10);
				g.drawLine (ax, ay, bx, by);
			}
			if (times == 3)
			{
				g.fillOval (ax-5, ay-5, 10, 10);
				g.fillOval (bx-5, by-5, 10, 10);
				g.drawLine (ax, ay, bx, by);
				g.fillOval (cx-5, cy-5, 10, 10);
				g.drawLine (bx, by, cx, cy);
				g.drawLine (cx, cy, ax, ay);
			}
		}
	}
}