package com.senati.pe;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese numero de edad: ");
        int edad = sc.nextInt();
        
        if (edad >= 18)
        	System.out.println("Mayor de edad");
        else
        	System.out.println("Menor de edad");
        	
       

	}

}
