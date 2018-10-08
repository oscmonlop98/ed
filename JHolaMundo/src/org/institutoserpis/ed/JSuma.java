package org.institutoserpis.ed;

import java.math.BigDecimal;
import java.util.Scanner;

public class JSuma {

	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		BigDecimal num1 = new BigDecimal(tcl.nextLine());
		System.out.println("Introduce el segundo: ");
		BigDecimal num2 = new BigDecimal(tcl.nextLine());
		
		BigDecimal suma = num1.add(num2);
		BigDecimal resta = num1.subtract(num2);
		BigDecimal producto = num1.multiply(num2);
		BigDecimal division = num1.divide(num2);
		System.out.println("Primer Número = "+ num1);
		System.out.println("Segundo Número = "+ num2);
		System.out.println("El resultado de la suma es = " + suma);
		System.out.println("El resultado de la resta es = " + resta);
		System.out.println("El resultado del producto es = " + producto);
		System.out.println("El resultado de la division es = " + division);
				
		
		
	}

}
