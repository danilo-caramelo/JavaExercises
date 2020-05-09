package br.ucsal;

import java.util.Scanner;

public class Laboratorio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		double n1, n2, n3;
		System.out.println("Digite três números");
		n1 = ent.nextDouble();
		n2 = ent.nextDouble();
		n3 = ent.nextDouble();
		if (n1 > n2 && n2 > n3) {
			System.out.println("o maior valor é " + n1 + " " + "e o menor valor é " + n3);
			} else if (n1 > n3 && n3 > n2) {
				System.out.println("o maior valor é " + n1 + " " + "e o menor valor é " + n2);
			} else if (n2 > n3 && n3 > n1) { 
				System.out.println("o maior valor é " + n2 + " " +  "e o menor valor é " + n1);
			} else if (n2 > n1 && n1 > n3) {
				System.out.println("o maior valor é " + n2 + " " +  "e o menor valor é " + n3);
			} else if (n3 > n2 && n2 > n1) {
				System.out.println("o maior valor é " + n3 + " " +  "e o menor valor é " +n1);
			} else  { 
				System.out.println("o maior valor é " + n3 + " " +  "e o menor valor é " + n2);
			} 
	ent.close();
	}

}
