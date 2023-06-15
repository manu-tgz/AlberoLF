package AlberoLF;

public class test {

	public static void main(String[] args) {
		AlberoLF<Integer> albero = new AlberoLF<Integer>();
		albero.addRoot(5);
		albero.addNodo(albero.getroot(), 7);
	}

}
