package br.ucsal;
import java.util.Scanner;

public class Solucao {

	public static void main(String[] args) {
		obtemEscolha();
	}
	
	public static void obtemEscolha() {
		int valor = 12;
		Scanner ent = new Scanner(System.in);
		System.out.println("Escolha\n(1)Quadrado \n(2)Triplo");
		int escolha = ent.nextInt();
		switch (escolha) {
		case 1:
			System.out.print(obtemQuadrado(valor));
			break;
		case 2:
			System.out.print(obtemTriplo(valor));
			break;
		}
		ent.close();
	}
	
	public static int obtemQuadrado(int valor) {
		return valor * valor;
	}
	public static int obtemTriplo(int valor) {
		return valor * 3;
	}
	
}
