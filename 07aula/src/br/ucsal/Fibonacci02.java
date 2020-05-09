package br.ucsal;

public class Fibonacci02 {

	public static void main(String[] args) {
		int aValor = 0, dValor = 1;
		while(aValor <= 1000) {
		System.out.print(aValor + " ");
		dValor += aValor;
		aValor = dValor - aValor;
		}
	}

}
//                                Teste de mesa
//                aValor     |        dValor        |       Saída
// Início           0                   1                     -
// 1 Exec.                                                    0
