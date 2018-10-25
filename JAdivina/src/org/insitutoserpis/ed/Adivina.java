package org.insitutoserpis.ed;

import java.util.Random;
import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {
//		double doubleAleatorio = Math.random() * 1000;
//		int numeroAleatorio = (int)doubleAleatorio + 1;
		Scanner tcl = new Scanner(System.in);
		Random random = new Random();
		int numeroAleatorio = random.nextInt(1000) + 1;
		System.out.println("numeroAleatorio=" + numeroAleatorio);
		System.out.println("Advivina un número (entre 1 y 1000): ");
		
		int minimo = 1;
		int maximo = 1000;
		int contadorIntentos = 0;
		
		contadorIntentos++;
		System.out.printf("Adivina un número (entre %s y %s) [intento %s]: ", minimo, maximo, contadorIntentos);
		
		int numeroIntroducido = Integer.parseInt(tcl.nextLine());
		while (numeroIntroducido != numeroAleatorio) {
			if (numeroIntroducido < numeroAleatorio) {
				System.out.println("Es mayor que ese");
			
				minimo = numeroIntroducido + 1;
			} else { 
				System.out.println("Es menor que ese");
			System.out.print("Adivina un número (entre 1 y 1000): ");
				maximo = numeroIntroducido - 1;
			}
			contadorIntentos++;
			System.out.printf("Adivina un número (entre %s y %s) [intento %s]: ", minimo, maximo, contadorIntentos);
			numeroIntroducido = Integer.parseInt(tcl.nextLine());
		}
		System.out.println("Enhorabuena has encontrado el número.");
		
	}

}
