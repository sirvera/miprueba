package tddTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class prueba {

	@Test
	public void adicion() {
		assertEquals(2, sumar(1,1));
	}
	@Test
	public void adicion2() {
		assertEquals(4, sumar(3,1));
	}

	private Object sumar(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

}
