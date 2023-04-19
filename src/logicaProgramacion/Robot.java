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
	
	public void moverEnX(int cantidadPosiciones) {
	}
	
	public void moverEnY() {
	}
	
	@Override
	public boolean equals(Object object) {
		Robot robot = (Robot)object;
		
		return(this.getPosicionX() == robot.getPosicionX());
	}
}
