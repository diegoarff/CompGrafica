package graficos;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Diego Rincon C.I. 29.929.768

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		MarcoConTexto miMarco = new MarcoConTexto();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoConTexto extends JFrame {
	public MarcoConTexto() {
		setVisible(true);
		setSize(600,450);
		setLocation(400,200);
		setTitle("Primer Texto");
		
		Lamina miLamina = new Lamina();
		add(miLamina);
	}
}

class Lamina extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Clase de Comp Grafica", 100, 100);
	}
}
