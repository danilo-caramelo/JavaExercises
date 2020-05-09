package br.ucsal;

import java.util.Scanner;

public class TesteLaboratorio30 {
	/*PROBLEMA: Crie uma sequencia (PA) de valores inteiros, positivos iniciada com o valor 10 e razão 6
	 * , na qual o valor limite da sequencia será informado pelo usuário, obedecendo aos seguintes 
	 * critérios e solicitações:
	 *a) Sequencia elaborada
	 *b) O valor limite deve ser informado pelo usuário em um intervalo fechado de 50 e 100.
	 *c) Se o usuário informar qualquer valor fora desse intervalo, o algoritmo deverá permanecer 
	 *solicitando (loop) que o usuário informe o valor, até que o valor informado esteja dentro do 
	 *intervalo. 
	 *A sequencia só será construída quando o usuário informar o valor dentro do intervalo.
	 *d) Calcule a quantidade de elementos da sequencia
	 *e) Calcule a média aritmética do primeiro e último valor da sequencia.
	 *f) a quantidade de números pares existentes na sequencia
	 *g) a quantidade de números ímpares
	 *h) a quantidade de números ímpares divisíveis por 3
	 *i) a soma de todos os elementos da sequencia
	 *j) a média ponderada do 4 e do 10 numeros da sequencia, considerando os pesos 4 e 6 respectivamente
	 * 
	 */
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int limite, valor = 10, contar = 1, par = 0, impar = 0, divi = 0, soma = 0, v4 = 0, v10 =0;
		double mediaAritmetica = 0, mediaP = 0;
		final int RAZAO = 5;
		do {
			System.out.println("Digite o limite da sequência em um número entre 50 e 100 (inclusive)");
			limite = ent.nextInt();
		} while(limite <50 || limite > 100);
		while (valor <= limite) {
			System.out.print(valor + " ");
			soma += valor;
			valor += RAZAO;
			contar ++;
			if(contar == 2) {
				mediaAritmetica = valor - RAZAO;
			}
			if(contar == 4) {
				v4 = valor;
			}
			if(contar == 10) {
				v10 = valor;
			}
			mediaP = (v4*4 + v10*6);
			mediaP /= 10;
			if (valor %2 == 0) {
				par++;
			} else {
				impar++;
				if(valor %3 == 0) {
					divi++;
				}
			}
		}
		mediaAritmetica = (mediaAritmetica + (valor - RAZAO))/ 2;
		if(contar < 10 ) {
			mediaP = 0;
		}
		
		System.out.println("\nquantidade de números: " + (contar - 1));
		System.out.println("a média aritimética do 1 e último elemento é " + mediaAritmetica);
		System.out.println("quantidade de números pares: " + par);
		System.out.println("quantidade de números ímpares: " + impar);
		System.out.println("números ímpares divisíveis por 3: " + divi);
		System.out.println("Soma dos elementos da sequência: " + soma);
		System.out.println("Média ponderada do 4 e 10 elemento: " + (mediaP > 0 ? mediaP : "não foi possível calcular a média"));



		ent.close();
	}

}
