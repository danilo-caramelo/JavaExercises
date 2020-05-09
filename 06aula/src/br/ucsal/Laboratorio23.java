package br.ucsal;

public class Laboratorio23 {

	public static void main(String[] args) {
		int num = 2;
		while (num <= 100) {
			if (num %5 == 0 && num %2 == 0) {
				System.out.print(num + " ");
			}
			num++;
		}
	}

}
