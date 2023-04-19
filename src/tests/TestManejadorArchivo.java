package tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import logicaProgramacion.*;
import manejadorArchivo.ManejadorArchivo;

public class TestManejadorArchivo {
	@Test
	public void generandoObjetoRobot() {
		ManejadorArchivo manejadorArchivo = new ManejadorArchivo();
		Robot robotEsperado = new Robot(1, 1, 'N');
		Robot robotObtenido = manejadorArchivo.getRobot();
		
		Assert.assertEquals(robotEsperado, robotObtenido);
	}
	
	@Test
	public void generandoObjetoTablero() {
		ManejadorArchivo manejadorArchivo = new ManejadorArchivo();
		Tablero tableroEsperado = new Tablero(10, 5);
		Tablero tableroObtenido = manejadorArchivo.getTablero();
		
		Assert.assertEquals(tableroEsperado, tableroObtenido);
	}
	
	@Test
	public void generandoListaComandos() {
		ManejadorArchivo manejadorArchivo= new ManejadorArchivo();
		char listaComandosEsperada[] = {'A', '9', 'R', '1', 'A', '2'};
		char listaComandosObtenida[] = manejadorArchivo.getListaComandos();
		
		Assert.assertArrayEquals(listaComandosEsperada, listaComandosObtenida);
	}
}
