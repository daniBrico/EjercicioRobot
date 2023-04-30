package tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import logicaProgramacion.Robot;

public class TestRobot {
	
	// Prueba que el robot se mueva correctamente en x hacia el Este
	@Test
	public void probarMoverXEste() {
		Robot robot = new Robot(5, 3, 'E');
		robot.moverHaciaElEste(4);
		
		int valorEnXEsperado = 9;
		int valorEnXObtenido = robot.getPosicionX();
		
		Assert.assertEquals(valorEnXEsperado, valorEnXObtenido);
	}
	
	// Prueba que el robot se mueva correctamente en x hacia el Oeste
	@Test
	public void probarMoverXOeste() {
		Robot robot = new Robot(5, 3, 'O');
		robot.moverHaciaElOeste(4);
		
		int valorEnXEsperado = 1;
		int valorEnXObtenido = robot.getPosicionX();
		
		Assert.assertEquals(valorEnXEsperado, valorEnXObtenido);
	}
	
	// Prueba que el robot se mueva correctamente en y hacia el Norte
	@Test
	public void probarMoverYNorte() {
		Robot robot = new Robot(5, 3, 'N');
		robot.moverHaciaElNorte(2);
		
		int valorEnXEsperado = 5;
		int valorEnXObtenido = robot.getPosicionY();
		
		Assert.assertEquals(valorEnXEsperado, valorEnXObtenido);
	}
	
	// Prueba que el robot se mueva correctamente en y hacia el Sur
	@Test
	public void probarMoverYSur() {
		Robot robot = new Robot(5, 3, 'S');
		robot.moverHaciaElSur(2);
		
		int valorEnXEsperado = 1;
		int valorEnXObtenido = robot.getPosicionY();
		
		Assert.assertEquals(valorEnXEsperado, valorEnXObtenido);
	}
	
}
