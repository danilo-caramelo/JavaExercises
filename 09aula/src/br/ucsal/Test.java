package br.ucsal;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int valori;
		System.out.println("Digite o valor inicial da sequência em um intervalo de 50 a 60 inclsuive ");
		valori = ent.nextInt();
		if (valori < 50 || valori > 60) {
			for(int contar = 0; valori <50 || valori > 60 && contar < 2; contar++) {
				System.out.println("Digite novamente ");
				valori = ent.nextInt();
			}
		}
		if(valori >= 50 && valori <= 60) {
			for(int contar = 0; contar < 10; contar++) {
				System.out.print(valori + " ");
				valori *= 5;
			}
		}
		ent.close();
	}

}
