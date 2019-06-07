package edu.tecjerez.topicos.geometria;

public class Punto {
	
	int coordenadaX;
	int coordenadaY;
	PuntoPrueba pp = new PuntoPrueba();
	
	//metodo para calcular la distancia entre dos puntos 
	
	double obtenerDistancia(Punto punto1, Punto punto2) {
		
		return Math.sqrt(Math.pow(punto2.coordenadaX-punto1.coordenadaX, 2)+
				Math.pow(punto2.coordenadaY-punto1.coordenadaY, 2));
	}
	
}

  class PuntoPrueba{
	  //modificador de acceso DEFAULT 
  	double x = new Punto().obtenerDistancia(new Punto(), new Punto());
  	
}
 
	
