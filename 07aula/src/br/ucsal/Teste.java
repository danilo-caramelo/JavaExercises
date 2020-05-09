package br.ucsal;

public class Teste {

	public static void main(String[] args) {
		int pValor = 0, sValor = 1, y;
		while(pValor <= 1000) {
			System.out.print(pValor + " ");
			y = pValor + sValor;
			sValor = pValor;
			pValor = y;
		}
	}

}
