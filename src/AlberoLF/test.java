package AlberoLF;

import java.util.ArrayList;
import java.util.LinkedList;

public class test {

	public static void main(String[] args) {
		
		AlberoLF<Integer> albero = new AlberoLF<Integer>();
		albero.addRoot(5);
		/*radice = 5*/
		albero.addNodo(albero.getroot(), 7);
		albero.addNodo(albero.getroot(), 9);
		
		LinkedList<NodoLF<Integer>> childrens = albero.getroot().getfigli();
		/*filgio della radice = 7*/
		albero.addNodo(albero.getroot().getfigli().getFirst(), 8);
		/*il suo primo figlio= 8*/
		albero.addNodo(albero.getroot().getfigli().getFirst(), 10);
		/*il suo secondo figlio= 10*/
		
//		BFS<Integer> a = new BFS<Integer>();
//		ArrayList<NodoLF<Integer>> listaNodi = a.BFS(albero.getroot());
		NodoLF<Integer> nodo5 = albero.getroot();
		NodoLF<Integer> nodo7 = albero.getroot().getfigli().getFirst();
		NodoLF<Integer> nodo9 = albero.getroot().getfigli().getLast();
		NodoLF<Integer> nodo8 = albero.getroot().getfigli().getFirst().getfigli().getFirst();
		NodoLF<Integer> nodo10 = albero.getroot().getfigli().getFirst().getfigli().getLast();
		
		
		
		int livello5 = nodo5.getLivello();
		int livello7 = nodo7.getLivello();
		int livello9 = nodo9.getLivello();
		int livello8 = nodo8.getLivello();
		int livello10 = nodo10.getLivello();
		
	}

}
