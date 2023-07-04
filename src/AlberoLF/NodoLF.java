package AlberoLF;
import java.util.*;

public class NodoLF<T> {
	private T info;
	private LinkedList<NodoLF<T>> figli;
	private NodoLF<T> padre;
		
	public NodoLF(T x){
		info=x;
		figli = new LinkedList<NodoLF<T>>();
	}
	
	public void addFiglio(NodoLF<T> v) {
		figli.add(v);
	}
	
	public LinkedList<NodoLF<T>> getfigli(){
		return figli;
	}
	
	public String toString(){
		return info.toString();
	}	
	public T getInfo() {
		return info;
	}
	
	public void setInfo(T info) {
		this.info = info;
	}
	 
	public void setPadre(NodoLF<T> padre) {
		this.padre = padre;
	}
	
	public NodoLF<T> getPadre(){
		return padre;
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
