package manejadorArchivo;

import java.io.BufferedReader;
import java.io.FileReader;

import logicaProgramacion.Tablero;
import logicaProgramacion.Robot;

public class ManejadorArchivo {
	String informacionArchivo[];
	
	public ManejadorArchivo() {
		this.informacionArchivo = new String[2];
		this.leerArchivo();
	}
	
	public void leerArchivo() {
		try {
			int i=0;
			FileReader archivoEntrada = new FileReader("C:\\Users\\danie\\OneDrive\\Escritorio\\robot.in");
			
			BufferedReader br = new BufferedReader(archivoEntrada);
			
			String linea = "";
			
			while(linea != null) {
				linea = br.readLine();
				
				if(linea != null) {
					this.informacionArchivo[i] = linea;
					i++;					
				}
				
			}
			
			br.close();
			
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error: "+ e);
		}
	}
	
	public Tablero getTablero() {
		String datosEntrada = this.informacionArchivo[0];
		String informacionEntrada[];
		
		informacionEntrada = datosEntrada.split(" ");
		
		Tablero tablero = new Tablero(Integer.parseInt(informacionEntrada[3]), Integer.parseInt(informacionEntrada[4]));
		
		return(tablero);
	}
	
	public Robot getRobot() {
		String datosEntrada = this.informacionArchivo[0];
		String informacionEntrada[];
		
		informacionEntrada = datosEntrada.split(" ");
		
		Robot robot = new Robot(Integer.parseInt(informacionEntrada[0]), Integer.parseInt(informacionEntrada[1]), informacionEntrada[2].charAt(0));
		
		return(robot);
	}
	
	public char[] getListaComandos() {
		String datosEntrada = this.informacionArchivo[1];
		char informacionEntrada[];
		
		informacionEntrada = datosEntrada.toCharArray();
		
		return(informacionEntrada);
	}
}
