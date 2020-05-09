package br.ucsal;

import java.util.Scanner;

public class Laboratorio31 {

	/*PROBLEMA: elabore uma sequencia (PG) de razão 5, contendo 10 elementos, cujo valor inicial será 
	 * informado pelo usuário dentro de um intervalo fechado de 50 a 60. O usuario só poderá informar 
	 * errado 03 vezes, passou desse número o mesmo deve apresentar mensagem de fim da execução por ter 
	 * informado o valor errado e não apresenta a sequencia. Utilize a estrutura "for"
	 */

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		final int RAZAO = 5, QTDE_ELEMENTOS = 10;
		int valori;

		System.out.println("digite o valor inicial da sequência entre 50 e 60 (inclusive)");
		valori = ent.nextInt();

		for (int contar = 0; valori < 50 || valori > 60 && contar < 2; contar++) {
			System.out.println("Informe novamente o valor");
			valori = ent.nextInt();
		}

		if(valori >= 50 && valori <= 60) {
			for (int contar = 0; contar < QTDE_ELEMENTOS; contar++) {
				System.out.print(valori + " ");
				valori *= RAZAO;
			}
		} else {
			System.out.print("Não foi elaborada a sequência porque informou o valor errado 3 vezes");
		}

		ent.close();
	}

}
