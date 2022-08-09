package Ejercicio4;

public class Vehiculo {
	
	private String marca;
	private String modelo;
	private float precio;

	
	//Constructor de la clase
	
	public Vehiculo(String marca, String modelo, float precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	// Obtener precio

	public float getPrecio() {
		return precio;
	}
	
	public String mostrarDatos() {
		return "\nMarca: "+marca + "\nModelo: "+modelo + "\nPrecio: $"+precio +"\n" ;
	}
}
