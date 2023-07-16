package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingMorph extends Polymorph{
	int x;
	int y;
	int width;
	int height;
	Random r = new Random();
	public MovingMorph(int x, int y, int width, int height, int mouseX, int mouseY) {
		super(x, y, width, height, mouseX, mouseY);
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	@Override
	public void update() {
		if (x>=600) {
			x=200;
		}
		if (x<=0) {
			x=200;
		}
		if (y>=600) {
			y=200;
		} 
		if (y<=0) {
			y=200;
		}
			int w = r.nextInt(2);
			if (w==0) {
				x+=r.nextInt(20);
				y+=r.nextInt(20);
			} else {
				x-=r.nextInt(20);
				y-=r.nextInt(20);
			}
			
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(x,y,width,height);
		
	}

}
