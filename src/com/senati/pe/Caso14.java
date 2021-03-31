package com.senati.pe;

// lee datos de varios tipos
import java.util.Scanner;

public class Caso14 {

	public static void main(String[] args) {
		
		// Declaramos
		Scanner sc = new Scanner(System.in);
		
		// Entradas
		System.out.println("Ingresa tu nombre: ");
		String alumno = sc.nextLine();
		
		System.out.println("Ingresa tu carrera[DS/RC/DG]: ");
		String car = sc.nextLine();
		
		System.out.println("Ingresa tu turno[M/T/N]: ");
		String turno = sc.nextLine();
		
		// Entrada de datos Numericos
		// Cuando la precisión de una variable de coma flotante no es suficiente
		double desc = 0, monto = 0, tpa, dolar;
		
		// Convertir caracteres en Mayusculas
		car = car.toUpperCase();
		
		
		
		// Declaramos (Expresion)
		switch (car) {
		
		// Desarrollo de Software
	    // Redes y Conectividad
		// Diseño Gráfico
		case "DS":
			monto = 1500;
			break;
		case "RG":
			monto = 1400;
			break;
		case "DG"  :
			monto = 1300;
			break;
		default:
			monto = 0;
			break;
			}
		
		// Convertir caracteres en Mayusculas
		turno = turno.toUpperCase();
		switch (turno) {
		case "M":
			desc = (monto * 0.1);
			break;
		case "T":
			desc = (monto * 0.2);
			break;
		case "N":
			desc = (monto * 0.15);
			break;
		default:
			desc = monto;
			break;
		}
		
		// Operamos        // total a pagar
		tpa = (monto - desc);
		
		dolar = tpa * 3.33;
		
		// Impresion
		System.out.println("Alumno:...............: " + alumno);
		System.out.println("Carrera:.................: " + car);
		System.out.println("Turno..................: " + turno);
		System.out.println("El monto por carrera..: "  + monto);
		System.out.println("El descuento............: " + desc);
		System.out.println("El monto total...........: " + tpa);
		System.out.println("El monto en dolares....: " + dolar);
		
		
	}

}
	
	
	
	
	
	
	
	
	
	
	

