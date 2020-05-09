package br.ucsal;

import java.util.Scanner;

public class TesteLaboratorio30 {
	/*PROBLEMA: Crie uma sequencia (PA) de valores inteiros, positivos iniciada com o valor 10 e raz�o 6
	 * , na qual o valor limite da sequencia ser� informado pelo usu�rio, obedecendo aos seguintes 
	 * crit�rios e solicita��es:
	 *a) Sequencia elaborada
	 *b) O valor limite deve ser informado pelo usu�rio em um intervalo fechado de 50 e 100.
	 *c) Se o usu�rio informar qualquer valor fora desse intervalo, o algoritmo dever� permanecer 
	 *solicitando (loop) que o usu�rio informe o valor, at� que o valor informado esteja dentro do 
	 *intervalo. 
	 *A sequencia s� ser� constru�da quando o usu�rio informar o valor dentro do intervalo.
	 *d) Calcule a quantidade de elementos da sequencia
	 *e) Calcule a m�dia aritm�tica do primeiro e �ltimo valor da sequencia.
	 *f) a quantidade de n�meros pares existentes na sequencia
	 *g) a quantidade de n�meros �mpares
	 *h) a quantidade de n�meros �mpares divis�veis por 3
	 *i) a soma de todos os elementos da sequencia
	 *j) a m�dia ponderada do 4 e do 10 numeros da sequencia, considerando os pesos 4 e 6 respectivamente
	 * 
	 */
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int limite, valor = 10, contar = 1, par = 0, impar = 0, divi = 0, soma = 0, v4 = 0, v10 =0;
		double mediaAritmetica = 0, mediaP = 0;
		final int RAZAO = 5;
		do {
			System.out.println("Digite o limite da sequ�ncia em um n�mero entre 50 e 100 (inclusive)");
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
		
		System.out.println("\nquantidade de n�meros: " + (contar - 1));
		System.out.println("a m�dia aritim�tica do 1 e �ltimo elemento � " + mediaAritmetica);
		System.out.println("quantidade de n�meros pares: " + par);
		System.out.println("quantidade de n�meros �mpares: " + impar);
		System.out.println("n�meros �mpares divis�veis por 3: " + divi);
		System.out.println("Soma dos elementos da sequ�ncia: " + soma);
		System.out.println("M�dia ponderada do 4 e 10 elemento: " + (mediaP > 0 ? mediaP : "n�o foi poss�vel calcular a m�dia"));



		ent.close();
	}

}
