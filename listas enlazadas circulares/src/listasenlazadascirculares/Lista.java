package listasenlazadascirculares;

public class Lista {
Nodo inicio;

public Lista() {
	inicio=null;
}

//public void addCircle(Object x) {
//	Nodo nuevo = new Nodo(x);
//	if(inicio==null) inicio=nuevo;
//	else nuevo.next=inicio.next;
//	inicio.next=nuevo;
//}
//
//public String getCircle() {
//	String salida="";
//	if(inicio!=null) {
//		Nodo p = inicio.next;
//		while(p!=inicio) {
//			salida += p.info+"\n";
//			p=p.next;
//		}
//		salida+=p.info+"\n";
//	}
//	return salida;
//}
//
//public Nodo contains(String valor) {
//	if(inicio !=null) {
//		Nodo p=inicio.next;
//		while(p!=inicio) {
//			if(p.info.toString().equalsIgnoreCase(valor)) {
//				return p;
//			}else p=p.next;
//		}
//		if(p.info.toString().equalsIgnoreCase(valor)) return p;
//	}
//	return null;
//}
//
//public String delete(int n, String soldado) {
//	String salida="";
//	Nodo q = null;
//	Nodo p = contains(soldado);
//	if(p!=null) {
//		while(p.next !=q) {
//			for (int i=0; i<n;i++) {
//				q=p;
//				p=p.next;
//			}
//			q.next=p.next;
//			salida+="\nSoldado eliminado: "+p.info;
//		}
//		salida+="\nSoldado que escapa: "+q.info;
//	}
//	return salida;
//}
}
