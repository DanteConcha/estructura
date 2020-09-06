package listasenlazadascirculares;
import javax.swing.JOptionPane;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista lista = new Lista();
		String soldado="";
		int n=0;
		int option=0;
		
		do {
			option=Integer.parseInt(JOptionPane.showInputDialog(null,"eliga una opcion\n"
					+ " 1-insertar soldado\n"
					+ " 2-mostrar lista\n"
					+ " 3-remover soldado\n"
					+ " 4-quit\n"));
			
			switch(option) {
			case 1: soldado= JOptionPane.showInputDialog(null,"nombre del soldado:\n");
					lista.addCircle(soldado);
					break;
			case 2: JOptionPane.showMessageDialog(null, "Soldados: \n" + lista.getCircle());
					break;
			case 3: n=Integer.parseInt(JOptionPane.showInputDialog(null,"numero: \n"));
					JOptionPane.showMessageDialog(null, "Soldado"+lista.delete(n, soldado));
					break;
			case 4: break;
			}
			
		}while(option!=4);
		
		}

}
