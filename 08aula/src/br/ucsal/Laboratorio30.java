package br.ucsal;

import java.util.Scanner;

public class Laboratorio30 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int valor, valori = 10, contar = 0, par = 0, impar = 0, impar3 = 0, soma = 0, v2 = 0;
		double mediaA = 0, mediaP = 0;
		final int RAZAO = 6, P1 = 4, P2 = 6;
		do {
			System.out.println("Digite um número entre 50 a 100 para ser o limite da sequência");
			valor = ent.nextInt();
		} while (valor < 50 || valor > 100);
		mediaA = valori;
		do { 
			System.out.print(valori + " ");
			if (valori%2 == 0 && valori <= valor) {
				par++;
			}
			if (valori%2 != 0 && valori <= valor) {
				impar++;
				if(valori%3 == 0) {
					impar3++;
				}
			}
			if (contar == 3) {
				mediaP = valori;
			}
			if (contar == 9) {
				v2 = valori;
			}
			soma += valori;
			contar++;
			valori += RAZAO;
		} while (valori <= valor);
		mediaA = (mediaA + (valori - RAZAO))/2; 
		mediaP = (mediaP*P1 + v2*P2)/(P1 + P2);
		System.out.print("\nnúmero de elementos da sequencia: " + contar);
		System.out.print("\nA media aritimetica do primeiro e ultimo: " + mediaA);
		System.out.print("\nNúmeros pares: " + par);
		System.out.print("\nNúmeros ímpares: " + impar);
		System.out.print("\nNúmeros ímpares divisíveis por três: " + impar3);
		System.out.print("\nA soma de todos os elemntos é: " + soma);
		System.out.print("\nA média ponderada do 4 e do 10 elementos é: " + mediaP);
		if (mediaP == 0) {
			System.out.print("\nA sequência não possui o 4 nem o 10 elemento ");
		}
		if (v2 == 0) {
			System.out.print("\nA sequência não possui o 10 elemento ");
		}
		ent.close();
	}
}

