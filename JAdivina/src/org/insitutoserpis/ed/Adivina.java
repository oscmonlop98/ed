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
		int numeroIntroducido = Integer.parseInt(tcl.nextLine());
		while (numeroIntroducido != numeroAleatorio) {
			if (numeroIntroducido < numeroAleatorio)
				System.out.println("Es mayor que ese");
			else
				System.out.println("Es menor que ese");
			System.out.println("Advivina un número (entre 1 y 1000): ");
			numeroIntroducido = Integer.parseInt(tcl.nextLine());
			
		}
		System.out.println("Enhorabuena has encontrado el número.");
		
	}

}
