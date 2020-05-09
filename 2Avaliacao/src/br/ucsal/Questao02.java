package br.ucsal;

import java.util.Scanner;

public class Questao02 {
	Scanner ent = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int num = 0;
		for(int i = 0; i < 3 && num < 50 || num > 60; i++) {
			System.out.println("Digite um número entre 50 a 60");
			num = ent.nextInt();
		}
		if (num >= 50 && num <= 60) {
			for(int i = 0; i < 10; i++) {
				System.out.print(num + " ");
				num = num*5;
			}
		}
		else {
			System.out.println("Fim da execução, o valor está errado");
		}
		ent.close();
	}
}
