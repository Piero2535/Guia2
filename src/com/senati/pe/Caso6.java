package com.senati.pe;

import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		//Caso 6: Lea un sueldo, si es superior a 2800, calcule el impuesto del 5% sobre el sueldo, caso
				//contrario calcule el 2% sobre el sueldo.
				//variables
				float sueldo ,impuesto;
				//entrada de datos
				Scanner sc = new Scanner(System.in);
				System.out.print("ingresa el precio: ");
				sueldo=sc.nextFloat();
				//resolviendo condicionales 
				//si es superior a 2800
				if (sueldo>2800) {
					impuesto=(float)(sueldo*0.05);
				}
				else {
					impuesto=(float)(sueldo*0.02);
				}
				 //salida de datos
				 System.out.println("impuesto calculado: "+impuesto);
			}

		}

