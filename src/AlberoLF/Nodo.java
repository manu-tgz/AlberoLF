package AlberoLF;

public class Nodo<T>{
	protected T info;
		
	public Nodo(T x){
		info=x;
	}
	public T getInfo() {
		return info;
	}
	
	public void setInfo(T info) {
		this.info = info;
	}
	public String toString(){
		return info.toString();
	}
}
