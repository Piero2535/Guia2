package com.senati.pe;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		// Lea una nota y muestre un mensaje según la siguiente escala: 
				//▪ 00 – 07, muestre “Sin Palabras”. 
				//▪ 08 – 10, muestre “Malo”. 
				//▪ 11 – 14, muestre “Regular”. 
				//▪ 15 – 17, muestre “Notable”. 
				//▪ 18 – 20, muestre “Excelente”.
				//variables
				float nota;
				//entrada de datos
				Scanner sc = new Scanner(System.in);
				System.out.print("ingresa la nota : ");
				nota=sc.nextFloat();
				//condicionales
				if (nota<=20 & nota>=18) {
					System.out.println("EXELENTE..");	
				}
				else if (nota<=17 & nota>=15) {
					System.out.println("NOTABLE..");
				}
				else if (nota<=14 &  nota>=11) {
					System.out.println("REGULAR..");
				}
				else if (nota<=10 & nota>=8) {
					System.out.println("MALO..");
				}
				else if (nota<=7 & nota>=0) {
					System.out.println("SIN PALABRAS..");
				}
				else {
					System.out.println("ESA NOTA ES INCORRECTA..");
				}
				}

		}


