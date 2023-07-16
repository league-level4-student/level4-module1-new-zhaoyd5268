package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class RedPolymorph extends Polymorph {
	int x;
	int y;
	int width;
	int height;
	
	public RedPolymorph(int x, int y, int width, int height, int mouseX, int mouseY) {
		super(x, y, width, height, mouseX, mouseY);
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x, y, width, height);

	}
}

