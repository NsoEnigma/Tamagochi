package paquete;

import java.util.Scanner;

public class Tamagochi {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Hola! Dime que tipo de raza quieres que sea tu Tamagochi.");
		System.out.println("Los tipos de raza que hay son Perro, Gato, Hipop�tamo y Carpincho.");
		String raza = sc.nextLine();
		
		while (!raza.equals ("Perro") && !raza.equals ("Gato") && !raza.equals ("Hipop�tamo") && !raza.equals ("Carpincho") 
				&& !raza.equals ("perro") && !raza.equals ("gato") && !raza.equals ("hipop�tamo") && !raza.equals ("carpincho")) { 
			System.out.println("Lo siento pero la raza que has introducido no esta disponible... Quizas est� en la proxima actualizaci�n!");
			System.out.println("Por favor, elige una de las razas disponibles.");
			raza = sc.nextLine();
		}
		

		System.out.println("Introduce el nombre de tu tamagochi:");
		String nombreMascota = sc.nextLine();
		while (nombreMascota.contains("0") || nombreMascota.contains("1") || nombreMascota.contains("2") || nombreMascota.contains("3") || nombreMascota.contains("4") 
				|| nombreMascota.contains("5") || nombreMascota.contains("6") || nombreMascota.contains("7") || nombreMascota.contains("8") || nombreMascota.contains("9")) {
			System.out.println("El nombre de tu mascota no puede tener numeros, introducelo de nuevo.");
			nombreMascota = sc.nextLine();
		}
		
		//Nombramos las estadisticas y le damos valores
		
		byte hambre = 50;
		byte sue�o = 50;
		byte higiene = 50;
		byte diversion = 50;
		byte paseo = 50;
		byte mate = 50;
		byte contador = 0; 
			
				
			if (raza.equals("Perro") || raza.equals("perro") ) {
				
				while (diversion > 0 && hambre > 0 && sue�o > 0 && higiene > 0 && paseo >0
						&& diversion <= 100 && hambre <= 100 && sue�o <= 100 && higiene <= 100 && paseo <= 100 && contador < 30 ) {
				
					System.out.println("----------------------------" + "\n" + "\t" +  nombreMascota + " el " + raza  + "\n" + "----------------------------" + "\n" + "Hambre- " + hambre + "\n" 
					+ "Sue�o- " + sue�o + "\n" + "Higiene- " + higiene + "\n" + "Diversion- " + diversion + "\n" + "Paseo- " + paseo);
			
			

					System.out.println("\n" + "Elige una acci�n: " + "\n" + "1- Comer" + "\n" + "2- Dormir" + "\n" + "3- Ducharse" + "\n" + "4- Jugar" + "\n" + "5- Pasear");
					byte opcion = Byte.parseByte(sc.nextLine());

					switch (opcion) {
						case 1:
							System.out.println("Has elegido la opcion de comer");
							hambre = (byte) (hambre + 20);
							sue�o = (byte) (sue�o - 5);
							higiene = (byte) (higiene - 5);
							diversion = (byte) (diversion - 5);
							paseo = (byte) (paseo - 5);
							contador = (byte) (contador + 1);
							break;
	
						case 2:
							System.out.println("Has elegido la opcion de dormir");
							sue�o = (byte) (sue�o + 20);
							hambre = (byte) (hambre - 5);
							higiene = (byte) (higiene - 5);
							diversion = (byte) (diversion - 5);
							paseo = (byte) (paseo - 5);
							contador = (byte) (contador + 1);
							break;
				
						case 3:
							System.out.println("Has elegido la opcion de ducharse");
							higiene = (byte) (higiene + 20);
							sue�o = (byte) (sue�o - 5);
							hambre = (byte) (hambre - 5);
							diversion = (byte) (diversion - 5);
							paseo = (byte) (paseo - 5);
							contador = (byte) (contador + 1);
							break;
		
						case 4:
							System.out.println("Has elegido la opcion de jugar");
							diversion = (byte) (diversion + 20);
							sue�o = (byte) (sue�o - 5);
							higiene = (byte) (higiene - 5);
							hambre = (byte) (hambre - 5);
							paseo = (byte) (paseo - 5);
							contador = (byte) (contador + 1);
							break;
					
						case 5:
							System.out.println("Has elegido la opcion de pasear");
							paseo = (byte) (paseo + 20);
							sue�o = (byte) (sue�o - 5);
							higiene = (byte) (higiene - 5);
							hambre = (byte) (hambre - 5);
							diversion = (byte) (diversion - 5);
							contador = (byte) (contador + 1);
							break;
					
				} 
				}
				if (hambre == 100) {System.out.println(nombreMascota + " ha comido lo suficiente esta satisfecho");}
				if (sue�o == 100) {System.out.println(nombreMascota + " ha dormido lo suficiente esta satisfecho");}
				if (higiene == 100) {System.out.println(nombreMascota + " ha sido lavado lo suficiente esta satisfecho");}
				if (diversion == 100) {System.out.println(nombreMascota + " ha jugado lo suficiente esta satisfecho");}
				if (paseo == 100) {System.out.println(nombreMascota + " ha paseado lo suficiente esta satisfecho");}
				if (hambre > 100) {System.out.println("Parece que " + nombreMascota + " muri� por darle mucho de comer!");}
				if (sue�o > 100) {System.out.println("Parece que " + nombreMascota + " muri� por dormir mucho!");}
				if (higiene > 100) {System.out.println("Parece que " + nombreMascota + " muri� por lavarlo demasiado!");}
				if (diversion > 100) {System.out.println("Parece que " + nombreMascota + " muri� por jugar demasiado!");}
				if (paseo > 100) {System.out.println("Parece que " + nombreMascota + " muri� por pasearlo demasiado!");}
				if (hambre <= 0) {System.out.println("Parece que " + nombreMascota + " muri� por no comer nada!");}
				if (sue�o <= 0) {System.out.println("Parece que " + nombreMascota + " muri� por no dormir lo suficiente!");}
				if (higiene <= 0) {System.out.println("Parece que " + nombreMascota + " muri� por no lavarlo!");}
				if (diversion <= 0) {System.out.println("Parece que " + nombreMascota + " muri� de aburrimiento!");}
				if (paseo <= 0) {System.out.println("Parece que " + nombreMascota + " muri� por no pasearlo!");}
				
				
				
			
			}
			
			if (raza.equals("Carpincho") || raza.equals("carpincho")) {
				
				while (diversion > 0 && hambre > 0 && sue�o > 0 && higiene > 0 && paseo >0
						&& diversion <= 100 && hambre <= 100 && sue�o <= 100 && higiene <= 100 && mate <= 100 && contador < 30 ) {
					
				
				System.out.println("\t" +  nombreMascota + " el " + raza  + "\n" + "----------------------------" + "\n" + "Hambre- " + hambre + "\n" 
						+ "Sue�o- " + sue�o + "\n" + "Higiene- " + higiene + "\n" + "Diversion- " + diversion + "\n" + "Mate- " + mate);
	
				System.out.println("\n" + "Elige una acci�n: " + "\n" + "1- Comer" + "\n" + "2- Dormir" + "\n" + "3- Ducharse" + "\n" + "4- Jugar" + "\n" + "5- Tomar mate");
				byte opcion = Byte.parseByte(sc.nextLine());
	
				switch (opcion) {
					case 1:
						System.out.println("Has elegido la opcion de comer");
						hambre = (byte) (hambre + 20);
						sue�o = (byte) (sue�o - 5);
						higiene = (byte) (higiene - 5);
						diversion = (byte) (diversion - 5);
						mate = (byte) (mate - 5);
						contador = (byte) (contador + 1);
						break;
		
					case 2:
						System.out.println("Has elegido la opcion de dormir");
						sue�o = (byte) (sue�o + 20);
						hambre = (byte) (hambre - 5);
						higiene = (byte) (higiene - 5);
						diversion = (byte) (diversion - 5);
						mate = (byte) (mate - 5);
						contador = (byte) (contador + 1);
						break;
			
					case 3:
						System.out.println("Has elegido la opcion de ducharse");
						higiene = (byte) (higiene + 20);
						sue�o = (byte) (sue�o - 5);
						hambre = (byte) (hambre - 5);
						diversion = (byte) (diversion - 5);
						mate = (byte) (mate - 5);
						contador = (byte) (contador + 1);
						break;
			
					case 4:
						System.out.println("Has elegido la opcion de jugar");
						diversion = (byte) (diversion + 20);
						sue�o = (byte) (sue�o - 5);
						higiene = (byte) (higiene - 5);
						hambre = (byte) (hambre - 5);
						mate = (byte) (mate - 5);
						contador = (byte) (contador + 1);
						break;
						
					case 5: 
						System.out.println("Has elegido la opcion de tomar mate");
						mate = (byte) (mate + 20);
						sue�o = (byte) (sue�o - 5);
						higiene = (byte) (higiene - 5);
						hambre = (byte) (hambre - 5);
						diversion = (byte) (diversion - 5);
						contador = (byte) (contador + 1);
						break;
					} 
					}
				
				if (hambre == 100) {System.out.println(nombreMascota + " ha comido lo suficiente esta satisfecho");}
				if (sue�o == 100) {System.out.println(nombreMascota + " ha dormido lo suficiente esta satisfecho");}
				if (higiene == 100) {System.out.println(nombreMascota + " ha sido lavado lo suficiente esta satisfecho");}
				if (diversion == 100) {System.out.println(nombreMascota + " ha jugado lo suficiente esta satisfecho");}
				if (mate == 100) {System.out.println(nombreMascota + " ha tomado suficiente mate, esta satisfecho");}
				if (hambre > 100) {System.out.println("Parece que " + nombreMascota + " muri� por darle mucho de comer!");}
				if (sue�o > 100) {System.out.println("Parece que " + nombreMascota + " muri� por dormir mucho!");}
				if (higiene > 100) {System.out.println("Parece que " + nombreMascota + " muri� por lavarlo demasiado!");}
				if (diversion > 100) {System.out.println("Parece que " + nombreMascota + " muri� por jugar demasiado!");}
				if (mate > 100) {System.out.println("Parece que " + nombreMascota + " muri� por sobredosis de mate!");}
				if (hambre <= 0) {System.out.println("Parece que " + nombreMascota + " muri� por no comer nada!");}
				if (sue�o <= 0) {System.out.println("Parece que " + nombreMascota + " muri� por no dormir lo suficiente!");}
				if (higiene <= 0) {System.out.println("Parece que " + nombreMascota + " muri� por no lavarlo!");}
				if (diversion <= 0) {System.out.println("Parece que " + nombreMascota + " muri� de aburrimiento!");}
				if (mate <= 0) {System.out.println("Parece que " + nombreMascota + " muri� por no darle mate!");}
				if (contador > 30) {System.out.println("Parece que " + nombreMascota + " murio de viejo y muy tranquilo! Felicidades has conseguido que viviera con un cuidado excelente!");} 
				
			}
			
			
			if (raza.equals("Gato") || raza.equals("gato") || raza.equals("hipop�tamo") || raza.equals("Hipop�tamo")) {
				
				while (diversion > 0 && hambre > 0 && sue�o > 0 && higiene > 0 && paseo >0
						&& diversion <= 100 && hambre <= 100 && sue�o <= 100 && higiene <= 100 && contador < 30 ) {
			
				System.out.println("\t" +  nombreMascota + " el " + raza  + "\n" + "----------------------------" + "\n" + "Hambre- " + hambre + "\n" 
								+ "Sue�o- " + sue�o + "\n" + "Higiene- " + higiene + "\n" + "Diversion- " + diversion);
			
				System.out.println("\n" + "Elige una acci�n: " + "\n" + "1- Comer" + "\n" + "2- Dormir" + "\n" + "3- Ducharse" + "\n" + "4- Jugar");
				byte opcion = Byte.parseByte(sc.nextLine());
			
				switch (opcion) {
					case 1:
						System.out.println("Has elegido la opcion de comer");
						hambre = (byte) (hambre + 20);
						sue�o = (byte) (sue�o - 5);
						higiene = (byte) (higiene - 5);
						diversion = (byte) (diversion - 5);
						contador = (byte) (contador + 1);
						break;
				
					case 2:
						System.out.println("Has elegido la opcion de dormir");
						sue�o = (byte) (sue�o + 20);
						hambre = (byte) (hambre - 5);
						higiene = (byte) (higiene - 5);
						diversion = (byte) (diversion - 5);
						contador = (byte) (contador + 1);
						break;
					
					case 3:
						System.out.println("Has elegido la opcion de ducharse");
						higiene = (byte) (higiene + 20);
						sue�o = (byte) (sue�o - 5);
						hambre = (byte) (hambre - 5);
						diversion = (byte) (diversion - 5);
						contador = (byte) (contador + 1);
						break;
					
					case 4:
						System.out.println("Has elegido la opcion de jugar");
						diversion = (byte) (diversion + 20);
						sue�o = (byte) (sue�o - 5);
						higiene = (byte) (higiene - 5);
						hambre = (byte) (hambre - 5);
						contador = (byte) (contador + 1);
						break;
				} 
				
				if (hambre == 100) {System.out.println(nombreMascota + " ha comido lo suficiente esta satisfecho");}
				if (sue�o == 100) {System.out.println(nombreMascota + " ha dormido lo suficiente esta satisfecho");}
				if (higiene == 100) {System.out.println(nombreMascota + " ha sido lavado lo suficiente esta satisfecho");}
				if (diversion == 100) {System.out.println(nombreMascota + " ha jugado lo suficiente esta satisfecho");}
				if (hambre > 100) {System.out.println("Parece que " + nombreMascota + " muri� por darle mucho de comer!");}
				if (sue�o > 100) {System.out.println("Parece que " + nombreMascota + " muri� por dormir mucho!");}
				if (higiene > 100) {System.out.println("Parece que " + nombreMascota + " muri� por lavarlo demasiado!");}
				if (diversion > 100) {System.out.println("Parece que " + nombreMascota + " muri� por jugar demasiado!");}
				if (hambre <= 0) {System.out.println("Parece que " + nombreMascota + " muri� por no comer nada!");}
				if (sue�o <= 0) {System.out.println("Parece que " + nombreMascota + " muri� por no dormir lo suficiente!");}
				if (higiene <= 0) {System.out.println("Parece que " + nombreMascota + " muri� por no lavarlo!");}
				if (diversion <= 0) {System.out.println("Parece que " + nombreMascota + " muri� de aburrimiento!");}
				if (contador > 30) {System.out.println("Parece que " + nombreMascota + " murio de viejo y muy tranquilo! Felicidades has conseguido que viviera con un cuidado excelente!");} 
			
			}
			}

			
			
		
		
		}	

			
	
		
		
}





