package br.ucsal;

import java.util.Scanner;

public class AnosBissextos02 {

	public static void main(String[] args) {
// Elabore uma sequência de anos bissextos a partir do ano inicial e final informado pelo usuário
		Scanner ent = new Scanner(System.in);
		int ano, anoF;
		System.out.println("Digite o ano inicial");
		ano = ent.nextInt();
		System.out.println("Digite o ano final");
		anoF = ent.nextInt();
		while(ano <= anoF) {
			if((ano %4 == 0 && ano %100 != 0) || ano %400 == 0) {
				System.out.print(ano + " ");
			}
			ano++;
		}
	ent.close();
	}

}
