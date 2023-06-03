package AlberoVP;

public class AlberoVP<T> {
	private NodoVP<T> root;
	private int numNode;
	private int hight;

	public void addRoot(T info) {
		if(root!=null) {
			root = new NodoVP<T>(info);
		}
	}
	
}
