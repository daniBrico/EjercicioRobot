package tests;

import org.junit.Assert;
import org.junit.Test;

import logicaProgramacion.Tablero;

public class TestTablero {
	
	@Test
	public void verificarFueraDeRangoEnYN() {
		Tablero tablero = new Tablero(10, 5);
		
		boolean esperado = false;
		boolean obtenido = tablero.fueraDeRango(1, 1, 'N', 9);

		Assert.assertEquals(esperado, obtenido);
	}
	
	@Test
	public void verificarFueraDeRangoEnYS() {
		Tablero tablero = new Tablero(10, 5);
		
		boolean esperado = true;
		boolean obtenido = tablero.fueraDeRango(5, 3, 'S', 1);

		Assert.assertEquals(esperado, obtenido);
	}
	
	@Test
	public void verificarFueraDeRangoEnXE() {
		Tablero tablero = new Tablero(10, 5);
		
		boolean esperado = true;
		boolean obtenido = tablero.fueraDeRango(1, 1, 'E', 7);

		Assert.assertEquals(esperado, obtenido);
	}
	
	@Test
	public void verificarFueraDeRangoEnXO() {
		Tablero tablero = new Tablero(10, 5);
		
		boolean esperado = false;
		boolean obtenido = tablero.fueraDeRango(4, 1, 'O', 4);

		Assert.assertEquals(esperado, obtenido);
	}
}
