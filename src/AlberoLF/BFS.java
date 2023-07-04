package AlberoLF;

import java.util.ArrayList;
import java.util.LinkedList;

public class BFS<T> {
	public  ArrayList<NodoLF<T>> BFS(NodoLF<T> root) {
		LinkedList<NodoLF<T>> queue=new LinkedList<NodoLF<T>>();
		ArrayList<NodoLF<T>> listaNodi=new ArrayList<NodoLF<T>>(); 
		
		queue.add(root);
		
		while (!queue.isEmpty()) {
			NodoLF<T> u = queue.remove();
			queue.addAll(u.getfigli());
			listaNodi.add(u);	
			}
		return listaNodi;
	}
}
