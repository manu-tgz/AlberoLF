package AlberoVP;
import java.util.*;

public class NodoVP<T> {
	private T info;
	private LinkedList<NodoVP<T>> childrens;
		
	public NodoVP(T x){
		info=x;
		childrens = new LinkedList<NodoVP<T>>();
	}
	
	public void addChildren(NodoVP<T> v) {
		childrens.add(v);
	}
	
	public String toString(){
		return info.toString();
	}	
	
}
