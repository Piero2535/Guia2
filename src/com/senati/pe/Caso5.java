package com.senati.pe;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("precio...: ");
	    float precio = sc.nextFloat();
	        
	    System.out.print("cantidad...: ");
	    int cantidad = sc.nextInt();
	        
	    float total = precio * cantidad;
	    
	    float dscto = 0;
	    
	    if (cantidad > 8)
	    	dscto = 0.1f * total;
	    
	    System.out.println("\n=========== Resultados ==============");
        System.out.println("total.......: " + total);
        System.out.println("descuento...: " + dscto);
        System.out.println("neto........: " + (total - dscto));

	}

}
