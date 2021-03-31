package com.senati.pe;

import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		int n1,n2,op,re;
		String ope=" ";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Primer Numero: ");
		n1=sc.nextInt();
		System.out.println("Segundo Numero: ");
		n2=sc.nextInt();
		System.out.println("ingresa el numero [1-6]");
		op=sc.nextInt();
		
		
		switch (op) {
		case 1: 
			ope="suma";
			re=(n1+n2);
			break;
		case 2 :
			ope="resta";
			re=(n1-n2);
			break;
		case 3 :
			ope="multiplicacion";
			re=(n1*n2);
			break;	
		case 4 :
			ope="division";
			if (n2 != 0) {
				re=(n1/n2);
				break;
			}
		case 5 :
			ope="resto";
			if (n2 != 0) {
				re=(n1%n2);
				break;
			}
		case 6 :
			ope="promedio";
			re=((n1+n2)/2);
			break;	
		
		
		default:
			re = 0;
		}
		if (re == 0) {
			System.out.println("numero incorrecto..");
		}
		else {
			System.out.println("Numero 1:  "+n1);
			System.out.println("Numero 2:  "+n2);
			System.out.println("la operacion es " + ope);
			System.out.println("la respuesta es " + re);
		}
	}

}

	

