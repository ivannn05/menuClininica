
package edu.menuClininica.servicios;

import java.util.Scanner;
/**
 * Implementacion de la intefaz menu
 * @author csi23-iloposa - 061023
 */
public class MenuImplementacion implements MenuInterfaz {

	@Override
	public int mostrarMenuYSeleccion (Scanner comunicacionTecladoM){
		 
		int opcionSeleccionada; 
		 
		System.out.println("#################################");
		System.out.println("0.Cerrar la aplicacion");
		System.out.println("1.Registro de paciente");
		System.out.println("2.Ingreaso de paciente");
		System.out.println("3.Alta de paciente");
		System.out.println("4.Resumen de ingresos y altas");
		System.out.println("5.Historial del paciente");
		System.out.println("#################################");
		System.out.println("Elija una opcion");
		
		opcionSeleccionada= comunicacionTecladoM.nextInt();
		
    		  return 0;	 
	}

}
