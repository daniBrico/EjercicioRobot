package logicaProgramacion;

import manejadorArchivo.ManejadorArchivo;

public class Juego {
	Tablero tablero;
	Robot robot;
	char listaComandos[];
	
	public Juego() {}
	
	public void comenzarJuego() {
		ManejadorArchivo manejadorArchivo = new ManejadorArchivo();
		this.tablero = manejadorArchivo.getTablero();
		this.robot = manejadorArchivo.getRobot();
		this.listaComandos = manejadorArchivo.getListaComandos();
	}
	
	// Este constructor permite que funcione el test del métood calcularPosicionFinal();
	public Juego(Tablero tablero, Robot robot, char listaComandos[]) {
		this.tablero = tablero;
		this.robot = robot;
		this.listaComandos = listaComandos;
	}
	
	// Al ejecutarse este objeto, se obtiene la posición final del robot
	public void calcularPosicionFinal() {
		for(int i=0;i<this.listaComandos.length;i+=2) {
			if(this.listaComandos[i] == 'A') {
				if(tablero.fueraDeRango(robot.getPosicionX(), robot.getPosicionY(), robot.getCardinalidad(), Character.getNumericValue(this.listaComandos[i+1]))) {
					if((robot.getCardinalidad() == 'O') || (robot.getCardinalidad() == 'E')) {
						this.robot.moverHaciaBorde(this.tablero.getNumeroColumnas());
					}else {
						if((robot.getCardinalidad() == 'N') || (robot.getCardinalidad() == 'S')) {
							this.robot.moverHaciaBorde(this.tablero.getNumeroFilas());
						}else {
							// trabajar este error
						}
					}
				}else {
					robot.moverRobot(Character.getNumericValue(this.listaComandos[i+1]));
				}
			}else {
				if(this.listaComandos[i] == 'R') {
					robot.rotarRobot((int)this.listaComandos[i+1]);
				}
			}
		}
	}
}
