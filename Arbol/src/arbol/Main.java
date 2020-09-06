package arbol;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arbol arbol = new Arbol();
		int totalNum=Integer.parseInt(JOptionPane.showInputDialog(null,"total de numeros"));

		int numero;
		for(int i=0;i<totalNum;i++){
			numero=Integer.parseInt(JOptionPane.showInputDialog(null,"numero: "));
			arbol.creaArbolBinario(numero);
		}
		arbol.entreOrden(arbol.getRaiz());
	}

}
