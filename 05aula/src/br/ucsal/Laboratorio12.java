package br.ucsal;

import java.util.Scanner;

public class Laboratorio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		double vel;
		int chave;
		System.out.println("digite a velocidade em que o veículo estava em km/h");
		vel = ent.nextDouble();
		if (vel <= 40) {
			chave = 1;
		} else if (vel <= 60) {
			chave = 2;
		} else if (vel <= 80) {
			chave = 3;
		} else {
			chave = 0;
		}
		
		
		switch (chave) {
		case 1: 
			System.out.println("não tem nenhuma multa");
			break;
		case 2: 
			System.out.println("multa de 160 reais");
			break;
		case 3: 
			System.out.println("multa de 200 reais");
			break;
		default:
			System.out.print("multa de 300 reais");
			break;
		}
		ent.close();
	}

}
