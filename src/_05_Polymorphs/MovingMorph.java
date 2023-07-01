package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{
	int x;
	int y;
	int width;
	int height;
	
	public MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	@Override
	public void update() {
		if (x==PolymorphWindow.WIDTH) {
			x-=PolymorphWindow.WIDTH;
		}
		if (y==PolymorphWindow.HEIGHT) {
			y-=PolymorphWindow.HEIGHT;
		}
			x+=10;
			y+=10;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(x,y,width,height);
		
	}

}
