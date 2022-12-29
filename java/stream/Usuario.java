package net.codeamos.java.stream;

public class Usuario {
	private String nombre;
	private int edad;
	private boolean status;
	public Usuario(String nombre, int edad, boolean status) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.setStatus(status);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", edad=" + edad + ", status=" + status + "]";
	}
	
}
