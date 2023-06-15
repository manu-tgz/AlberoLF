package AlberoLF;
import java.util.*;

public class NodoLF<T> {
	private T info;
	private LinkedList<NodoLF<T>> childrens;
		
	public NodoLF(T x){
		info=x;
		childrens = new LinkedList<NodoLF<T>>();
	}
	
	public void addChildren(NodoLF<T> v) {
		childrens.add(v);
	}
	
	public LinkedList<NodoLF<T>> getChildrens(){
		return childrens;
	}
	
	public String toString(){
		return info.toString();
	}	
	
	public void setInfo(T info) {
		this.info = info;
	}
	
}
