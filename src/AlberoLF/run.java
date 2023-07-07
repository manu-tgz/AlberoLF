package AlberoLF;

public class run {

	public static void main(String[] args) {
		AlberoLF<String> albero = new AlberoLF<String>();
		albero.addRadice("Marco");
		albero.addRadice("Claudia");
		NodoLF<String> Claudia = albero.getRadice();
		NodoLF<String> Marco = Claudia.getfigli().getFirst();
		albero.addNodo(Marco, "Silvia");
		albero.addNodo(Marco, "Ugo");
		albero.addNodo(Claudia, "Luca");
		NodoLF<String> Giulia= albero.addNodo(Claudia, "Giulia");
		NodoLF<String> Andrea= albero.addNodo(Giulia, "Andrea");
		albero.addNodo(Giulia, "Gianna");
		
		albero.addNodo(Andrea, "Carlo");
		
		StampaAlbero<String> stampa = new StampaAlbero<String>(albero);
		stampa.printAll();
		stampa.printInformazioniNodo(Claudia);
		stampa.livello(Andrea);
		stampa.livello(Giulia);
		
	}
	
}
