package br.ucsal;

public class Laboratorio28 {

	/*PROBLEMA: elabore uma solução para criar uma sequencia de números inteiros de 1.000 e 1.500 
	 * (inclusive) composta por valores que quando divididos por 11 produz resto igual a 5.
	 * Ao final apresente as seguintes informações:
	 * a) a sequencia impressa
	 * b) quantos elementos fazem parte dessa sequencia
	 * c) qual a soma de todos os números dessa sequencia.
	 * valor % 11 == 5 */

	public static void main(String[] args) {
		int valor = 1000, soma = 0, contador =0;
		while(valor <= 1500) {
			if(valor %11 == 5) {
				System.out.print(valor + " ");
				soma += valor;
				contador++;
			}
			valor++;
		}
		System.out.println("\nb) " + contador);
		System.out.print("c) " + soma);
	}

}
