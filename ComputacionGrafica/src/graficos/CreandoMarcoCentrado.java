package graficos;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;


//Diego Rincón C.I. 29.929.768

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		
		MarcoCentrado marco = new MarcoCentrado();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoCentrado extends JFrame {
	public MarcoCentrado() {
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension tamanioPantalla = miPantalla.getScreenSize();
		int altura = tamanioPantalla.height;
		int ancho = tamanioPantalla.width;
		
		setSize(ancho/2, altura/2);
		setLocation(ancho/4, altura/4);
				
	}
}