package org.institutoserpis.ed;

public class ClaseAProbar {
	public static int VALORINICIAL = 0;
	
	public static void main(String[] args) {
		VALORINICIAL = 100;
		int i = 5;
		String s = "Hola";
		int a = 3;
		int b = 4;
//		int [] v = new int[] {1,3,5,7,9};
		
		//v = new int[5];
//		System.out.println("v[0]=" + v[0]);
//		System.out.println("v[1]=" + v[1]);
//		System.out.println("v[2]=" + v[2]);
//		System.out.println("v[3]=" + v[3]);
//		System.out.println("v[4]=" + v[4]);

		String[] v = new String [] {"Luis", "Ana", "Jose", "Juan", "Carlos"};
		for (int index=0; index<5; index++)
			//System.out.printf("v[%s] = %s\n", index, v[index]);
			System.out.println("v[" + index + "] = " + v[index]);
		
	}

}
