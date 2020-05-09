package br.ucsal;

import java.util.Scanner;

public class NomeCompleto {
	/*1 - Criar um método para obter nome completo
	 * 2 - Criar um método para imprimir qualquer string
	 * 3 - Criar um método para pegar o sobrenome e acrescentar vírgula e o resto do nome
	 * (do início até antes do sobrenome).
	 */
	public static void main(String[] args) {
		obterNomeCompleto();
	}
	
	public static void obterNomeCompleto() {
		//Escreva aqui o método a ser usado.
		Scanner ent = new Scanner(System.in);
		imprimir("Digite o nome completo\n");
		String nome = ent.nextLine();
		palavraPorLinha(nome);
		ent.close();
	}
	
	public static void imprimir(String txt) {
		System.out.print(txt);
	}
	
	public static void sobrenome(String nome) {
		String nomeInverso = nome.substring(nome.length()-6,nome.length()) + ", " + nome.substring(0, nome.length()-6);
		imprimir(nomeInverso);
	}
	
	public static void palavraPorLinha(String nome) {
		imprimir("\n\n");
		for (int car= 0; car < nome.length(); car++) {
			if(nome.substring(car, car + 1).equals(" ")) {
			imprimir("\n");
		}
			imprimir(nome.substring(car,car + 1));
		}
	}
}
