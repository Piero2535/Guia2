package com.senati.pe;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Ingrese numero: ");
	        int n = sc.nextInt();

	        String mensaje = "Numero es par";
	        
	        if (n % 2 != 0)
	        	mensaje = "Numero es impar";
	        
	        System.out.println("\n=========== Resultados ==============");
	        System.out.println("Mensaje...: " + mensaje);
	        
	        
	        
	}

}
