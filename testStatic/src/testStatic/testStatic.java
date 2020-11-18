package testStatic;

import java.util.Scanner;

public class testStatic {
	static Scanner input=new Scanner(System.in);

	public static void main(String[] args) {
		
		Persona persona1=new Persona("Matias");
		Persona persona2=new Persona("jose");
		
		System.out.println(persona1);
		System.out.println(persona2);
	}

}
