package arbol;

public class Arbol {
Nodo raiz;

public Arbol() {
	raiz=null;
}

public Nodo hijoIzquierdo(Nodo p, int x) {
	Nodo q = new Nodo(x);
	p.izquierdo=q;
	return q;
}

public Nodo hijoDerecho(Nodo p, int x){
	Nodo q = new Nodo(x);
	p.derecho = q;
	return q;
}

public Nodo getRaiz() {
	return raiz;
}

public void creaArbolBinario(int x) {
	Nodo p,q,nuevo;
	if(raiz == null) {
		raiz= new Nodo(x);
		nuevo = raiz;
	}
	else {
		p = raiz;
		q=raiz;
		while(q != null) {
			p=q;
			if(x<p.info) {
				q=p.izquierdo;
			}else {
				q=p.derecho;
			}
		}
		if(x<p.info)
			nuevo=hijoIzquierdo(p,x);
		else
			nuevo = hijoDerecho(p,x);
		
	}
}

public void preOrden(Nodo p) {
	if(p != null) {
		System.out.print(p.info+"\t");
		preOrden(p.izquierdo);
		preOrden(p.derecho);
	}
}

public void entreOrden(Nodo p) {
	if(p!= null) {
		entreOrden(p.izquierdo);
		System.out.print(p.info+"\t");
		entreOrden(p.derecho);
	}
}

public void posOrden(Nodo p) {
	if(p!=null) {
		posOrden(p.izquierdo);
		posOrden(p.derecho);
		System.out.print(p.info+"\t");
	}
}


}
