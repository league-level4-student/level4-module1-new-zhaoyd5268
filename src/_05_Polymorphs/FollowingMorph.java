package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class FollowingMorph extends Polymorph implements MouseMotionListener {

	int x;
	int y;
	int width;
	int height;
	int mouseX;
	int mouseY;
	
	public FollowingMorph(int x, int y, int width, int height, int mouseX, int mouseY) {
		super(x, y, width, height, mouseX, mouseY);
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.mouseX = mouseX;
		this.mouseY = mouseY;
	}

	@Override
	public void update() {
		x = mouseX;
		y = mouseY;
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.PINK);
		g.fillRect(x, x, width, height);

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("beancheese");
		System.out.println(e.getY());
		mouseX = e.getX();
		mouseY = e.getY();
		update();
		}

}
