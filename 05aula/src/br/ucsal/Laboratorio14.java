package br.ucsal;

import java.util.Scanner;

public class Laboratorio14 {

	public static void main(String[] args) {
		/*Uma empresa concede empr�stimo at� o limite de 30% do sal�rio base (incluindo as taxas).
*A partir dessa informa��o, elabore um algoritmo que obtenha o valor do sal�rio base do cliente,
*identifique o valor m�ximo que pode ser tomado como empr�stimo, calcule a taxa cobrada sobre o
*valor solicitado (conforme tabela abaixo), obtenha o valor do empr�stimo solicitado pelo cliente
*e informe o valor recebido pelo cliente ou a nega��o do empr�stimo conforme regra definida.

*Calculo da Taxa de administra��o:
*at� 1.000,00 ........................................ 2,5%
*acima de 1.000,00 at� 2.000,00 ...................... 3,4%
*acima de 2.000,00 ................................... 4,2%

*Observe o exemplo abaixo a sa�da apresentada no eclipse:

*Digite seu sal�rio base: R$ 5000
*Considerando o sal�rio informado a taxa cobrada ser� de : 0.034
*portanto, o valor m�ximo para empr�stimo ser� R$ 1449.0
*Digite quanto deseja obter de empr�stimo: 1200
*Valor a ser creditado do empr�stimo: 1159.2*/
		Scanner ent = new Scanner(System.in);
		double sal, tax, empB, empM, empSol, empL;
		System.out.println("Digite o seu s�lario: ");
		sal = ent.nextDouble();
		empB = sal*0.3;
		if (empB <= 1000) {
			tax = 0.025;
		} else if (empB > 1000 && empB <= 2000) {
			tax = 0.034;
		} 
		else {
			tax = 0.042;
		}
		empM = empB - (empB * tax);
		System.out.println("considerando o sal�rio informado, a taxa cobrada ser� de: " + tax);
		System.out.println("Portanto o valor m�ximo de empr�stimo �: " + empM);
		System.out.println("Digite quanto deseja obter de empr�stimo: ");
		empSol = ent.nextDouble();
		if (empSol > empM) {
			System.out.println("Este valor est� acima do permitido.");
		} 
		else {
			if (empSol <= 1000) {
				tax = 0.025;
			} else if (empSol > 1000 && empSol <= 2000) {
				tax = 0.034;
			} 
			else {
				tax = 0.042;
			}
			empL = empSol - (empSol * tax);
			System.out.println("O valor a ser creditado do empr�stimo: " + empL);
			
		}
		ent.close();
	}

}
