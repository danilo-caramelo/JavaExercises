package br.ucsal;

public class Laboratorio26 {

	public static void main(String[] args) {
// Elabore uma sequência de anos bissexto a partir de 1950 até os dias atuais
		int ano = 1950;
		while(ano <= 2020) {
		if((ano %4 == 0 && ano %100 != 0) || ano %400 == 0) {
		System.out.print(ano + " ");
		}
		ano++;	
		}
	}

}
