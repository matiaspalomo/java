package testHerencia;

import java.util.Date;

import Herencia.Cliente;
import Herencia.Empleado;

public class HerenciaTest {

	public static void main(String[] args) {
		
	/*	Empleado empleado1= new Empleado("matias", 10000);
		System.out.println(empleado1.toString());
		Empleado empleado2= new Empleado("asd", 10000);
		System.out.println(empleado2);
*/
		Cliente cliente1=new Cliente("matias","masculino",33,"fortunato",  new Date(),false);
		System.out.println(cliente1);
	}

}
