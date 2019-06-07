package edu.tecjerez.topicos.figuras;

public class Triangulo {

	//metodo que calcule el area de un triangulo a través de la formula de Heron
	
	public double formulaTriangulo(double a, double b, double c ){
		
		double s = (a + b + c) / 2;
		
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		return area;
	}
}
