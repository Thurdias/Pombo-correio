package PomboCorreio;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Painel extends JPanel{
	// Propriedades da classe
	private static final long serialVersionUID = 1L;
	private int x =0;
	
	// Métodos set da classe
	public void setX(int x) {
		this.x = x;
	}
	
	// Método sobrescrito da classe
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawImage(new ImageIcon("Pigeon.png").getImage(), x, 670, 50, 50, null);
	}
}
