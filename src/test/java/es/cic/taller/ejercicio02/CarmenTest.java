package es.cic.taller.ejercicio02;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarmenTest {

	@Test
	public void testMultiplicar() {
		Carmen sut = new Carmen();
		assertEquals(12, sut.multiplicar());
	}

}
