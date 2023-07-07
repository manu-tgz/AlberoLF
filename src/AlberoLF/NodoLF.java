package AlberoLF;
import java.util.*;

public class NodoLF<T> extends Nodo<T>{
	private NodoLF<T> padre;
	private LinkedList<NodoLF<T>> figli;
		
	public NodoLF(T x){
		super(x);
		figli = new LinkedList<NodoLF<T>>();
	}
	
	public void addFiglio(NodoLF<T> v) {
		figli.add(v);
	}
	 
	public void setPadre(NodoLF<T> padre) {
		this.padre = padre;
	}
	
	public NodoLF<T> getPadre(){
		return padre;
	}
	public LinkedList<NodoLF<T>> getfigli() {
		return figli;
	}
	
	public LinkedList<T> getInformazioni(){
		LinkedList<T> informazioni = new LinkedList<T>();
		for (NodoLF<T> nodoLF : getfigli()) {
			informazioni.add(nodoLF.getInfo());
		}
		return informazioni;
	}
	
	public int getLivello() {
		int livello = 0;
		NodoLF<T> padre = getPadre();
		while (padre!=null) {
			livello++;
			padre = padre.getPadre();
		}
		return livello;
	}
}
