package AlberoLF;

public class AlberoLF<T> {
	private NodoLF<T> root;
	private int numNode;
	private int hight;

	public void addRoot(T info) {
		if(root!=null) {
			root = new NodoLF<T>(info);
		}
		else {
			NodoLF<T> lastRoot = root;
			root = new NodoLF<T>(info);
			root.addChildren(lastRoot);
		}
	}
	public NodoLF<T> getroot(){
		return root;
	}
	public void addNodo(NodoLF<T> father, T info) {
		father.addChildren(new NodoLF<T>(info));
	}
	
}
