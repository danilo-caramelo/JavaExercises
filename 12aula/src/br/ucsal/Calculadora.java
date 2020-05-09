package br.ucsal;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		obtemInformacoes();
	}
	
	public static void obtemInformacoes() {
		Scanner ent = new Scanner (System.in);
		int escolha, n1, n2;
		System.out.println("Digite a operação que deseja realizar "
							+"\n(1)Somar \n(2)Subtrair \n(3)Multiplicar \n(4)Dividir");
		escolha = ent.nextInt();
		System.out.println("Digite os dois números a serem operados ");
		n1 = ent.nextInt();
		n2 = ent.nextInt();
		switch (escolha) {
		case 1:
			System.out.print(soma(n1, n2));
			break;
		case 2:
			System.out.print(subtracao(n1, n2));
			break;
		case 3:
			System.out.print(multiplicacao(n1, n2));
			break;
		case 4:
			System.out.print(divisao(n1, n2));
			break;
		default:
			System.out.println("Você escreveu a operação errada");
		}
		ent.close();
	}
	public static int soma(int n1, int n2) {
		return n1 + n2;
	}
	public static int subtracao(int n1, int n2) {
		return n1 - n2;
	}
	public static int multiplicacao(int n1, int n2) {
		return n1 * n2;
	}
	public static int divisao(int n1, int n2) {
		return n1 / n2;
	}
}
