package edu;

import java.util.Scanner;

import edu.menuClininica.servicios.MenuImplementacion;
import edu.menuClininica.servicios.MenuInterfaz;

/**
 * Clase por el que se accede a la aplicacion
 * 290923 - ilp
 * @author csi23-ilp
 */

public class Inicio {
	
	/**
	 * Metodo principal de nuestra aplicacion 
	 * Define el procedimento, es de donde toda accion parte 
	 * Y a donde toda accion llega cuando acaba 
	 * 290923
	 * @author ilp
	 * @param args
	 */
	public static void main(String[] args) {
	    
		int seleccionUsuario;
		boolean cerrarMenu = false;
		Scanner comunicacionTecladoM = new Scanner (System.in);
		
		MenuInterfaz mi =new MenuImplementacion ();
		
		while (!cerrarMenu) {
			
			seleccionUsuario = mi.mostrarMenuYSeleccion(comunicacionTecladoM);
			
			switch(seleccionUsuario) {
			case 0:
				System.out.println("Se ejecuta caso 0");
				cerrarMenu=true;
				break;
			case 1:
				System.out.println("Se ejecuta caso 1");
				break;
			case 2:
				System.out.println("Se ejecuta caso 2");
				break;
			case 3:
				System.out.println("Se ejecuta caso 3");
				break;
			case 4:
				System.out.println("Se ejecuta caso 4");
				break;
			case 5:
				System.out.println("Se ejecuta caso 5");
				break;
				default:
					System.out.println("Se ejecuta caso default");
					break;
			}
			
		}

	}

}
