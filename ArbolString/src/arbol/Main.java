package arbol;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arbol arbol = new Arbol();
		int totalpalabras=Integer.parseInt(JOptionPane.showInputDialog(null,"total de palabras"));

		String palabra;
		for(int i=0;i<totalpalabras;i++){
			palabra=JOptionPane.showInputDialog(null,"palabra: ");
			arbol.creaArbolBinario(palabra);
		}
		arbol.entreOrden(arbol.getRaiz());
	}

}
