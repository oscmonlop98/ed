package org.institutoserpis.ed;

public class Vector {
	
	public static void main(String[] args) {
		int[] v = new int[] {16, 12, 15, 14, 17};
//		for (int item : v)
//			System.out.println(item);
//		
//		int index = indexOf(v, 12);
//		System.out.println("index=" + index);
		int minimo = min(v);
		System.out.println("El menor es " + minimo);
	}
	
	public static int indexOf (int[] v, int x) {
//		int index = 0;
//		while (index < v.length && v[index] != x)
//			index++;
//		if (index == v.length)
//			return -1;
//		return index;
		for (int index = 0; index < v.length; index++)
			if (v[index] == x)
				return index;
		return -1;
	}
	
	public static int min (int[] v) {
		int min= v[0];
		for (int index = 0; index < v.length; index++)
		if (min > v[index])
			index++;
		else
			min = v[index];			
		return min; 
	}

}
