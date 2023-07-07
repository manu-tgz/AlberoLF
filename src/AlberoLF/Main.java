package AlberoLF;

public class Main {

	public static void main(String[] args) {
		AlberoLF<Integer> albero = new AlberoLF<Integer>();
		albero.addRadice(7);
		albero.addRadice(5);
		NodoLF<Integer> radice = albero.getRadice();
		albero.addNodo(radice, 6);

	}
}
