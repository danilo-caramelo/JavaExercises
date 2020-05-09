package br.ucsal;

import java.util.Scanner;

public class Laboratorio29 {

	public static void main(String[] args) {
		/*Elabore uma solu��o para o usu�rio informar um valor dentro de um intervalo fechado com 
		 * valores inteiros, positivos, de 500 a 1000. Caso o usu�rio n�o informe o valor dentro do 
		 * intervalo definitivo, deve solicitar que ele informe o valor novamente. A execu��o s� deve 
		 * terminar quando o valor do usu�rio estiver dentro do intervalo solicitado. 
		 Utilize a estrutura de repeti��o do while */

		Scanner ent = new Scanner(System.in);
		int valor, contar = 0;
		do {
			System.out.print("Informe um valor ");
			if(contar != 0) {
				System.out.print(", novamente ");
			}
			contar++;
			valor = ent.nextInt();
		} while (valor < 500 || valor > 1000);
		ent.close();
	}

}
