package br.ucsal;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int num;
		System.out.println("Digite um n�mero entre 500 e 1000");
		num = ent.nextInt();
		if (num < 500 || num > 1000) {
			do {
				System.out.println("Tente de novo, digite um n�mero entre 500 e 1000");
				num = ent.nextInt();
			} while(num < 500 || num > 1000);
		}
		System.out.println("O n�mero digitado foi " + num);
		ent.close();
	}
}
