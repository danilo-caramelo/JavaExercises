package br.ucsal;

import java.util.Scanner;

public class Laboratorio13 {

	public static void main(String[] args) {
	Scanner ent = new Scanner(System.in);
	int n1, n2, n3, nM, nm, nh;
	System.out.println("Digite 3 números inteiros");
	n1 = ent.nextInt();
	n2 = ent.nextInt();
	n3 = ent.nextInt();
	
	if (n1 > n2 && n2 > n3) {
		nM = n1; nh = n2; nm = n3;
	} else if (n1 > n3 && n3 > n2) {
		nM = n1; nh = n3; nm = n2;
	} else if (n2 > n3 && n3 > n1) {
		nM = n2; nh = n3; nm = n1;
	} else if (n2 > n1 && n1 > n3) {
		nM = n2; nh = n1; nm = n3;
	} else if (n3 > n2 && n2 > n1) {
		nM = n3; nh = n2; nm = n1;
	} else {
		nM = n3; nh = n1; nm = n2;
	}
	System.out.println("A ordem decrescente é " + nM + " " + nh + " " + nm);
	System.out.println("A ordem crescente é " + nm + " " + nh + " " + nM);
	ent.close();
	}

}
