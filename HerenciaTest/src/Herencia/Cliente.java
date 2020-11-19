package Herencia;
import java.util.Date;

public class Cliente extends Persona{
	private Date fecha=new Date();
	private int idCliente;
	private boolean vip;
	private static int contadorDeId;
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getIdCliente() {
		return idCliente;
	}
	
	public boolean isVip() {
		return vip;
	}
	public void setVip(boolean vip) {
		this.vip = vip;
	}
	
	public Cliente(String nombre, String genero, int edad, String direccion, Date fecha, boolean vip) {
		super(nombre, genero, edad, direccion);
		this.fecha = fecha;
		this.idCliente = ++Cliente.contadorDeId;
		this.vip = vip;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [fecha=");
		builder.append(fecha);
		builder.append(", idCliente=");
		builder.append(idCliente);
		builder.append(", vip=");
		builder.append(vip);
		builder.append(", ");
		builder.append(super.toString());
	
		builder.append("]");
		return builder.toString();
	}
	
	
	  

}
