//Guido Foschini 7109621
//Emmanuel Torres 7128219

package AlberoLF;


public class StampaAlbero<T> {
	private AlberoLF<T> albero;
	
	public StampaAlbero(AlberoLF<T> albero) {
		this.albero = albero;
	}
	
	public void printAll() {
		printRadice();
		printRappresentazione();
		printInformazioni();
		printAltezza();
		NumFoglie();
	}

	public void printRadice() {
		System.out.println("radice dell'albero: "+albero.getRadice());
	}

	public void printRappresentazione() {
		System.out.println("rappresentazione dell'albero: "+albero.toString());
	}
	public void printInfoNodo(NodoLF<T> a){
		System.out.println(a.toString());
	}
	
	public void printInformazioni() {
		System.out.println("Informazioni con BFS");
		for (T info : albero.getInformazioniBFS()) {
			System.out.println(info.toString());
		}
		
		System.out.println("Informazioni con DFS");
		for (T info : albero.getInformazioniDFS()) {
			System.out.println(info.toString());
		}
	}
	
	public void printInformazioniNodo(NodoLF<T> a) {
		System.out.println("Informazioni nodo "+a.toString());
		for (T info : a.getInformazioni()) {
			System.out.println(info.toString());
		}
	}
	
	public void printAltezza() {
		System.out.println("altezza: "+ albero.getAltezza());
	}
	
	public void livello(NodoLF<T>a) {
		System.out.println("livello nodo "+a.toString()+ "è "+ a.getLivello());
	}
	public void padre(NodoLF<T>a) {
		System.out.println("padre nodo "+a.toString()+ "è "+ a.getPadre());
	}
	public void NumFoglie() {
		System.out.println("numero di foglie "+albero.getnumFoglie());
	}

}
