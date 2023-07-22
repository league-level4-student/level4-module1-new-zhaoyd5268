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
		mouseX = x;
		mouseY = y;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.PINK);
		g.fillRect(x-10, y-30, width, height);

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x=e.getX();
		y=e.getY();
		update();
		}

}
