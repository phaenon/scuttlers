import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;


public class LifeFrame extends JFrame {
	public static void main(String[] args) {
		new LifeFrame();
	}
	
	public LifeFrame() {
		super("Life");
		LifePanel p = new LifePanel();
		setContentPane(p);
		setJMenuBar(new LifeMenu(this, p));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);
	}
}
