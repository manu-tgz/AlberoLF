package AlberoLF;

import java.util.ArrayList;
import java.util.LinkedList;

public class AlberoLF<T> {
	private NodoLF<T> radice;

	public void addRadice(T info) {
		if (radice == null) {
			radice = new NodoLF<T>(info);
		} else {
			NodoLF<T> lastradice = radice;
			radice = new NodoLF<T>(info);
			radice.addFiglio(lastradice);
		}
	}

	public NodoLF<T> getRadice() {
		return radice;
	}

	public void addNodo(NodoLF<T> padre, T info) {
		NodoLF<T> figlio = new NodoLF<T>(info);
		padre.addFiglio(figlio);
		figlio.setPadre(padre);
	}

	public int getAltezza() {
		/* Return altezza: altezza = livello dell'ultimo nodo +1 */
		LinkedList<NodoLF<T>> nodi = getNodi();
		return nodi.getLast().getLivello() + 1;
	}

	public LinkedList<NodoLF<T>> getNodi() {
		return bfs(radice);
	}

	public ArrayList<T> getInformazioniBFS() {
		LinkedList<NodoLF<T>> nodi = getNodi();
		ArrayList<T> informazioni = new ArrayList<T>();
		for (NodoLF<T> nodoLF : nodi) {
			informazioni.add(nodoLF.getInfo());
		}
		return informazioni;
	}

	public int getnumFoglie() {
		return contaFoglie(radice);
	}

	private int contaFoglie(NodoLF<T> a) {
		if (a == null) // albero vuoto
			return 0;
		LinkedList<NodoLF<T>> figli = a.getfigli();
		if (figli.size() == 0) {
			return 1;
		}
		int foglies = 0;
		for (NodoLF<T> nodoLF : figli) {
			foglies = +contaFoglie(nodoLF);
		}
		return foglies;
	}

	public LinkedList<NodoLF<T>> bfs(NodoLF<T> radice) {
		LinkedList<NodoLF<T>> queue = new LinkedList<NodoLF<T>>();
		LinkedList<NodoLF<T>> listaNodi = new LinkedList<NodoLF<T>>();

		queue.add(radice);

		while (!queue.isEmpty()) {
			NodoLF<T> u = queue.remove();
			queue.addAll(u.getfigli());
			listaNodi.add(u);
		}
		return listaNodi;
	}

	public LinkedList<NodoLF<T>> dfs(NodoLF<T> radice) {
		return null;
	}
	
	public String toString() {
		String[] rappresenta= {""};
		createString(radice,rappresenta);
		return rappresenta[0];
	}

	private void createString(NodoLF<T> a, String[] s) {
		if(a==null) {
			s[0]=s[0]+"null";
			return;
		}	
		s[0]=s[0]+a.toString()+"[";

		for (NodoLF<T> nodoLF : a.getfigli()) {
			createString(nodoLF,s);
			s[0]=s[0]+",";
		}
		s[0]=s[0]+"]";
	}

}
