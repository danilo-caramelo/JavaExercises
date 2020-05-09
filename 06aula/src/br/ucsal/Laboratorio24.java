package br.ucsal;

public class Laboratorio24 {

	public static void main(String[] args) {
		int num = 1;
		while (num <= 100) {
			if (num %3 == 0 && num %2 != 0) {
			System.out.print(num + " ");
			}
		num++;
		}
	}

}
