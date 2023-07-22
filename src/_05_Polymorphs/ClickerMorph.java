package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class ClickerMorph  extends Polymorph implements MouseListener{
	int x;
	int y;
	int width;
	int height;
	
	public ClickerMorph(int x, int y, int width, int height, int mouseX, int mouseY) {
		super(x, y, width, height, mouseX, mouseY);
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	
	

	@Override
	public void update() {
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(x, y, width, height);

	}




	@Override
	public void mouseClicked(MouseEvent e) {
	JOptionPane.showMessageDialog(null, "L Bozo + Ratio");		
	}




	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}