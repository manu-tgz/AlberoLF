//Guido Foschini 7109621
//Emmanuel Torres 7128219

package esempio;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import AlberoLF.AlberoLF;
import AlberoLF.NodoLF;


class AlberoLF_Test {

	AlberoLF<Integer> albero = new AlberoLF<Integer>();

	@Test
	public void radiceTest() {
		albero.addRadice(7);
		NodoLF<Integer> radice = albero.getRadice();
		int info = radice.getInfo();
		assertEquals(7, info);
	}

	@Test
	public void radiceNuovaTest() {
		albero.addRadice(7);
		NodoLF<Integer> radiceVecchia = albero.getRadice();
		albero.addRadice(5);
		NodoLF<Integer> radice = albero.getRadice();
		NodoLF<Integer> padre = radiceVecchia.getPadre();
		assertEquals(padre, radice);
	}

	@Test
	public void addNodoTest() {
		albero.addRadice(7);
		albero.addRadice(5);
		NodoLF<Integer> radice = albero.getRadice();
		int info = albero.addNodo(radice, 6).getInfo();
		assertEquals(6, info);
	}
	
	@Test
	public void getAltezzaTest() {
		albero.addRadice(7);
		albero.addRadice(5);
		NodoLF<Integer> radice = albero.getRadice();
		NodoLF<Integer> nodo5 = radice.getfigli().getFirst();
		NodoLF<Integer> nodo6 = albero.addNodo(nodo5, 6);
		albero.addNodo(nodo6, 8);
		assertEquals(3, albero.getAltezza());
	}
}
