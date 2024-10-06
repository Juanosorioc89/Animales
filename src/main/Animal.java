package main;

public class Animal {
	
	private String nombre;
	private String tipo;
	private String genero;
	
	public Animal(String nombre, String tipo, String genero) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", tipo=" + tipo + ", genero=" + genero + "]";
	}
	
	
	

}
