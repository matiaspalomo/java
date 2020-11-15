package Artimetica;



import Persona.Persona;

public class test {

	public static void main(String[] args) {
		//Aritmetica artimetica=new Aritmetica(8,5);
		
//		System.out.println(artimetica.Sumar());
	
		Persona persona1=new Persona();
		persona1.setEdad(12);
		System.out.println(persona1.getEdad());
		cambiaValor(persona1);
		
		System.out.println(persona1.getEdad());
	}
	
	public static void cambiaValor(Persona persona)
	{
		persona.setEdad(21);
		
	}

}
