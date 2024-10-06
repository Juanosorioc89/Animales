package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Principal {
	
	private Map<String, List<Animal>> clasificacion;
	
	private List<Animal> animales;
	
	public Principal() {
		clasificacion = new TreeMap<>();
		animales = new ArrayList<>();
	}
	
	public static void main(String[] args) {
		Principal principal = new Principal();
		principal.llenarAnimales();
		principal.clasificarAnimales();
		principal.mostrarAnimales();
	}
	
	public void llenarAnimales() {
		Scanner scanner = new Scanner(System.in);
		String continuar = "s";
		
		while (continuar.equalsIgnoreCase("s")) {
			System.out.println("Ingrese el nombre del animal");
			String nombre = scanner.nextLine();
			
			System.out.println("Ingrese el tipo (terrestre, aéreo, acuático):");
			String tipo = scanner.nextLine().toLowerCase();
			
			System.out.println("Ingrese el género (masculino, femenino):");
			String genero = scanner.nextLine().toLowerCase();
			
			Animal animal = new Animal(nombre, tipo, genero);
			animales.add(animal);
			
			System.out.println("Desea agregar otro animal? (s/n):");
			continuar = scanner.nextLine();
		}
			
	}
	
	public void clasificarAnimales() {
		for (Animal animal: animales) {
			List<Animal> listaTipo = clasificacion.getOrDefault(animal.getTipo(), new ArrayList<>());
			listaTipo.add(animal);
			clasificacion.put(animal.getTipo(), listaTipo);
		}
	}
	
	public void mostrarAnimales() {
		System.out.println("\nClasificacion de animales:");
		for (Map.Entry<String, List<Animal>> entrada : clasificacion.entrySet()) {
			System.out.println("\nTipo: " + entrada.getKey());
			for (Animal animal : entrada.getValue()) {
				System.out.println(animal);
			}
		}
	}	
}
