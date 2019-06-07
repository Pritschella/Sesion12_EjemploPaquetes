
/*
 * Paquetes - Organizar archivos
 * 			  agrupaciónn tipos relacionados
 * 			  componentes
 * 
 * 		Mejor manejo - mantenimientos
 * 		Separación de codigo MODULOS
 * 
 * 		Seguridad (modificadores de correo) 
 * 		Mismos nombres clases pero en diferentes paquetes.
 * 
 * Nombar paquetes
 * 		  Convencion
 * 			utiliza el dominio web de la empresa/institución en forma inversa
 * 
 * 			Dominio ITSJ -> www.tecjerez.edu.mx
 * 
 * 			Por lo tanto el paquete quedaria:
 * 				edu.tecjerez.topicos.vista
 * 
 * 		  Sintaxis 
 * 			package directorio.subdirectorio ... class
 * 
 * 		  Ruta de paquete LANG de Java en Win
 * 			
 * 			c:/program file/java/jdk1.../lib --> INVESTIGAR!!!!
 * 
 * 		  Archivo JAR
 * 			Comprimido con clases para que la JVM lo "ejecute"
 * 
 * 		 Modificadores de acceso
 * 				permisos de acceso
 * 					public
 * 					protected
 * 					private
 * 					default
 * 					
 */

import javax.swing.SwingUtilities;

import edu.tecjerez.topicos.vista.VentanaInicio;

public class PruebaPaquetes {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicio();
			}
});
		
		
	}//main

}//class
