package AlberoLF;

import java.util.ArrayList;
import java.util.LinkedList;

public class AlberoLF<T> {
	private NodoLF<T> root;

	public void addRoot(T info) {
		if(root==null) {
			root = new NodoLF<T>(info);
		}
		else {
			NodoLF<T> lastRoot = root;
			root = new NodoLF<T>(info);
			root.addFiglio(lastRoot);
		}
	}
	public NodoLF<T> getroot(){
		return root;
	}
	public void addNodo(NodoLF<T> padre, T info) {
		NodoLF<T> figlio = new NodoLF<T>(info);
		padre.addFiglio(figlio);
		figlio.setPadre(padre);
	}
	
	public int getAltezza() {
		ArrayList<NodoLF<T>> nodi = getNodi();
		NodoLF<T> ultimo = nodi.get(nodi.size()-1);
		return ultimo.getLivello()+1;
		
	}
	
	public ArrayList<NodoLF<T>> getNodi(){
		BFS<T> visita = new BFS<T>();
		 return visita.BFS(root);
	}
	
	public ArrayList<T> getInformazioni(){
		ArrayList<NodoLF<T>> nodi = getNodi();
		ArrayList<T> informazioni = new ArrayList<T>();
		for (NodoLF<T> nodoLF : nodi) {
			informazioni.add(nodoLF.getInfo());
		}
		return informazioni;
	}
	
	public int getFoglie() {
		ArrayList<NodoLF<T>> nodi = getNodi();
		int numFoglie=0;
		
		for (NodoLF<T> nodoLF : nodi) {
			if(nodoLF.getfigli().size()>0) {
				numFoglie++;
			}
		}
		return numFoglie;
	}
	
}
