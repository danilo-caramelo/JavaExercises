package br.ucsal;

import java.util.Scanner;

public class Parametro {

	public static void main(String[] args) {
		obterNomeCompleto();
	}
	
	public static void obterNomeCompleto() {
		Scanner ent = new Scanner (System.in);
		imprimir("informe o nome completo\n");
		String nome = ent.nextLine();
		imprimir("O nome " + nome + " possui " + nome.length() + " caracteres.\n");
		segundoNome(nome);
		terceiroNome(nome);
		ent.close();
	}
	
	public static void imprimir(String txt) {
		System.out.print(txt);
	}
	
	public static void segundoNome(String nome) {
		imprimir(nome.substring(9,25) + "\n");
	}
	
	public static void terceiroNome(String nome) {
		imprimir(nome.substring(nome.length()-7,nome.length()));
	}
	
	public static void quartoNome(String nome) {
		
	}


}
