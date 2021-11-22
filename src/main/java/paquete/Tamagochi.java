package paquete;

import java.util.Scanner;

public class Tamagochi {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String raza = "";
		do {	
		System.out.println("Hola! Dime que tipo de raza quieres que sea tu Tamagochi.");
		System.out.println("Los tipos de raza que hay son Perro, Gato, Hipopótamo y Carpincho");
		raza = sc.nextLine();
		}while (raza == "Perro" && raza == "Gato" && raza == "Hipopótamo" && raza == "Carpincho"); 
		
		System.out.println("Introduce el nombre de tu tamagochi:");
		String nombreMascota = sc.nextLine();
		while (nombreMascota.contains("0") || nombreMascota.contains("1") || nombreMascota.contains("2") || nombreMascota.contains("3") || nombreMascota.contains("4") || nombreMascota.contains("5") || nombreMascota.contains("6") || nombreMascota.contains("7") || nombreMascota.contains("8") || nombreMascota.contains("9")) {
			System.out.println("El nombre de tu mascota no puede tener numeros, introducelo de nuevo.");
			nombreMascota = sc.nextLine();
		}
	}
}


