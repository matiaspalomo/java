package testOperaciones;


import operaciones.Operaciones;

public class TestOperaciones {

	
	public static void main(String[] args) {
		var resultado= Operaciones.sumar(2, 4);
		System.out.println(resultado);
		
		var resultado2=Operaciones.sumar(2.0,2.3);
		System.out.println(resultado2);
		
		
		
	}
	
}
