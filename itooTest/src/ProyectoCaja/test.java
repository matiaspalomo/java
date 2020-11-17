package ProyectoCaja;

public class test {

	public static void main(String[] args) {
		
		int alto=1;
		int ancho=2;
		int profundidad=3;
		int resultado=0;
		
		Caja caja1=new Caja();
		caja1.alto=alto;
		caja1.ancho=ancho;
		caja1.profundo=profundidad;
		resultado=caja1.calcularVolumen();
		
		
		
		System.out.println(resultado);

		Caja caja2=new Caja(1,2,3);
		resultado=caja2.calcularVolumen();
		System.out.println(resultado);
		
		int x =10;
		System.out.println(x);
		cambiarValor(x);
		System.out.println(x);
		System.out.println("asdasdsad");
		
	}
	
	public static int cambiarValor(int arg)
	{
		
		System.out.println(arg);
		return arg=15;
	}
	

}
