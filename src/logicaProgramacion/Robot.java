package logicaProgramacion;

public class Robot {
	private int posicionX;
	private int posicionY;
	private char cardinalidad;
	
	public Robot(int x, int y, char cardinalidad) {
		this.posicionX = x;
		this.posicionY = y;
		this.cardinalidad = cardinalidad;
	}
	
	public int getPosicionX() {
		return(this.posicionX);
	}
	
	public int getPosicionY() {
		return(this.posicionY);
	}
	
	public void getInformacion() {
		System.out.println("X Y C");
		System.out.println(this.posicionX + " " + this.posicionY + " " + this.cardinalidad);
	}
	
	public void moverHaciaElEste(int cantidadPosiciones) {
		this.posicionX += cantidadPosiciones;
	}
	
	public void moverHaciaElOeste(int cantidadPosiciones) {
		this.posicionX -= cantidadPosiciones;
	}
	
	public void moverHaciaElNorte(int cantidadPosiciones) {
		this.posicionY += cantidadPosiciones;
	}
	
	public void moverHaciaElSur(int cantidadPosiciones) {
		this.posicionY -= cantidadPosiciones;
	}
	
	public void moverRobot(int cantidadPosiciones){
		if(this.cardinalidad == 'E') {
			this.moverHaciaElEste(cantidadPosiciones);
		}else {
			if(this.cardinalidad == 'O') {
				this.moverHaciaElOeste(cantidadPosiciones);
			}else {
				if(this.cardinalidad == 'N') {
					this.moverHaciaElNorte(cantidadPosiciones);
				}else {
					if(this.cardinalidad == 'S') {
						this.moverHaciaElSur(cantidadPosiciones);
					}
				}
			}
		}
	}
	
	public void moverHaciaBorde(int borde) {
		if(this.cardinalidad == 'E') {
			this.posicionX = borde;
		}else {
			if(this.cardinalidad == 'O') {
				this.posicionX = 1;
			}else {
				if(this.cardinalidad == 'N') {
					this.posicionY = borde;
				}else {
					if(this.cardinalidad == 'S') {
						this.posicionY = 1;
					}
				}
			}
		}
	}
	
	public char getCardinalidad() {
		return(this.cardinalidad);
	}
	
	public void rotarRobot(int valorRotacion) {
		char puntosCardinales[] = {'N', 'E', 'S', 'O'};
		
		switch(this.cardinalidad) {
			case 'E':{
				valorRotacion+=1;
			}break;
			
			case 'S':{
				valorRotacion+=2;
			}break;
			
			case 'O':{
				valorRotacion=3;
			}break;
		}
		this.cardinalidad = puntosCardinales[valorRotacion%4];
	}
	
	@Override
	public boolean equals(Object object) {
		Robot robot = (Robot)object;
		
		return(this.getPosicionX() == robot.getPosicionX());
	}
}
