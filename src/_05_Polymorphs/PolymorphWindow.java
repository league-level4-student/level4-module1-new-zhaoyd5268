package _05_Polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/*
 * 1. Create new member variables for the width and height of Polymorph then 
 * initialize them in its constructor.
 * 
 * 2. Encapsulate the member variables of the Polymorph class. 
 * 
 * 3. Substitute the hard-coded numbers in the draw method of the BluePolymorph 
 * class with its width and height.
 * 
 * 4. Create a new sub-class of the Polymorph class called RedPolymorph.
 * 
 * 5. Make RedPolymorph draw a red rectangle when its draw method is called.
 * 
 * 6. Create an object of RedPolymorph in the PolymorphWindow class and test
 * it by drawing it like the BluePolymorph.
 * 
 * 7. Create a new sub-class of the Polymorph class called MovingMorph.
 * 
 * 8. Add code to its update method to make MovingMorph objects move around
 * the screen.
 * 
 * 9. Create a MovingMorph object in your PolymorphWindow class and test it
 * by calling its draw and update methods.
 * 
 * 10. Now, delete all references to Polymorphs subclasses inside your
 * PolymorphWindow class.
 * 
 * 11. Create an ArrayList of Polymorph inside your PolymorphWindow class.
 * 
 * 12. Initialize the ArrayList and add a bunch of different types of
 * Polymorph subclass objects to the ArrayList.
 * 
 * 13. Use loops to call the draw and update method for all the Polymorphs in 
 * the list.
 * 
 * 14. Create a Polymorph that follows your mouse. Hint: The MouseMotionListener
 *  interface.
 * 
 * 15. Create a Polymorph that displays a JOptionPane Message Dialog when
 *  clicked. Hint: MouseListener interface.
 */

public class PolymorphWindow extends JPanel implements ActionListener {

	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;

	Polymorph bluePoly;
	Polymorph redPoly;
	Polymorph movingPoly;
	Polymorph followingPoly;
	Polymorph clickerPoly;
	int mouseX;
	int mouseY;

	ArrayList<Polymorph> polys = new ArrayList<Polymorph>();

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);
		movingPoly = new MovingMorph(300, 300, 50, 50, mouseX, mouseY);
		redPoly = new RedPolymorph(350, 50, 40, 50, mouseX, mouseY);
		bluePoly = new BluePolymorph(500, 400, 50, 200, mouseX, mouseY);
		followingPoly = new FollowingMorph(500, 500, 25, 25, mouseX, mouseY);
		clickerPoly = new ClickerMorph(50,50,25,25,mouseX,mouseY);
		window.addMouseMotionListener((MouseMotionListener) followingPoly);
		window.addMouseListener((MouseListener) clickerPoly);
		repaint();
		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);

		// draw polymorph
		polys.add(bluePoly);
		polys.add(redPoly);
		polys.add(movingPoly);
		polys.add(followingPoly);
		polys.add(clickerPoly);
		for (int i = 0; i < 5; i++) {
			polys.get(i).draw(g);
			polys.get(i).update();
		}
		polys.get(3).draw(g);
		followingPoly.update();
		repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}


}
