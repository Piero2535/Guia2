package com.senati.pe;

// lee datos de varios tipos
import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		// Declaramos
		Scanner sc = new Scanner(System.in);
		
		// Entrada de datos numericos
		 System.out.print("Ingrese numero 1: ");
	        int n1 = sc.nextInt();
	        
	     System.out.print("Ingrese numero 2: ");
	        int n2 = sc.nextInt();
	        
	     System.out.print("Ingrese numero 3: ");
	        int n3 = sc.nextInt();
	        
	     System.out.print("Ingrese numero 4: ");
	        int n4 = sc.nextInt();
	        
	        // Entrada
	        String estado = "";
	        
	        // condicional
	        if (n1 == n2 & n1 == n3 & n1 == n4)
	        	 estado = "Los numeros son iguales";
	        else if (n1 < n2 & n1 < n3 & n1 < n4)
	        	estado = "El primero numero " + n1 + " es menor";
	        else if (n2 < n1 & n2 < n3 & n2 < n4)
	        	estado = "El segundo numero " + n2 + " es menor";
	        else if (n3 < n1 & n3 < n2 & n3 < n4)
	        	estado = "El tercer numero " + n3 + " es menor";
	        else
	        	estado = "El cuarto numero " + n4 + " es menor";
	        
	        // Impresion
	        System.out.println("\n=========== Resultados ==============");
	        System.out.println("Estado...: " + estado);
	       
	        
	       
	        
	       

	}

}
