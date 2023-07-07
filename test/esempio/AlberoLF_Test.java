package esempio;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import AlberoLF.AlberoLF;
import AlberoLF.NodoLF;

class AlberoLF_Test {

	AlberoLF<Integer> albero = new AlberoLF<Integer>();

	@Test
	public void radiceTest() {
		albero.addRadice(5);
		NodoLF<Integer> radice = albero.getRadice();
		int info = radice.getInfo();
		assertEquals(5, info);
	}

	@Test
	public void radice2Test() {
		NodoLF<Integer> radiceVecchia = albero.getRadice();
		albero.addRadice(7);
		NodoLF<Integer> radice = albero.getRadice();
		NodoLF<Integer> padre = radiceVecchia.getPadre();
		assertEquals(padre, radice);
	}
	@Test
	public void addNodoTest() {
		NodoLF<Integer> radice = albero.getRadice();
		albero.addNodo(radice, 6);
		int info = albero.getRadice().getfigli().getLast().getInfo();
		assertEquals(6, info);
	}
}
