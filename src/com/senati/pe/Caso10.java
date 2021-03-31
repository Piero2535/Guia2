package com.senati.pe;

import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		//variables
				String emple;
				int horast,mint;
				float tarifaxh,desc,bono;
				//entrada de datos
				Scanner sc = new Scanner(System.in);
				System.out.print("ingresa su nombre: ");
				emple=sc.nextLine();
				System.out.print("ingresa horas trabajadas: ");
				horast=sc.nextInt();
				System.out.print("ingresa la tarifa por hora: ");
				tarifaxh=sc.nextFloat();	
				System.out.print("ingresa los minutos de tardanzaa: ");
				mint=sc.nextInt();
				//calculando
				//importe
				float importe=(horast*tarifaxh);
				//bono
				if (horast>60) {
					bono=(float)(importe*0.13);
				}
				else {
					bono=(float)(importe*0.04);
				}
				//descuento
				if (mint>15) {
					desc=(float)(importe*0.03);
				}
				else {
					desc=(float)(importe*0.0);
				}
				//meta trasada
				float alcansado=(horast*100/70);
				//salida de datos
				System.out.println("el importe: "+importe);
				System.out.println("el bono: "+bono);
				System.out.println("descuento: "+desc);
				System.out.println("meta alcansada: "+alcansado);
			}

		}