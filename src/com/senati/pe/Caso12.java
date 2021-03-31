package com.senati.pe;

//lee datos de varios tipos
import java.util.Scanner;

public class Caso12 {

	public static void main(String[] args) {
		// Declaramos
		Scanner sc=new Scanner(System.in);
		
		System.out.print("ingrese nombre empleado: ");
		String nombre = sc.nextLine();
		
		System.out.print("ingrese el nivel  entre[1-4]: ");
		int nivel = sc.nextInt();
		
		System.out.print("ingrese el sueldo: ");
		float sueldo = sc.nextFloat();
		
		float incre = 0;
		if (nivel <= 4) {
			switch (nivel) {
			case 1:
				incre = 4.5f;
				break;
			case 2:
				incre = 6.0f;
				break;
			case 3:
				incre = 8.5f;
				break;
			case 4:
				incre = 11.0f;
				break;
		}
		
		}
		else if (nivel > 5) {
			incre = 0;
		}
		
		float incre1 = (sueldo * incre) / 100;
		float nsueldo=(float)(sueldo+incre1);
		
		//Impresion
		System.out.println("empleado.......: " + nombre);
		System.out.println("nivel..........: " + nivel);
		System.out.println("sueldo.........: " + sueldo);
		System.out.println("incremento.....: " + incre);
		System.out.println("nuevo sueldo...: " + nsueldo);

}

}
