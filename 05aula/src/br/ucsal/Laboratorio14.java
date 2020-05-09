package br.ucsal;

import java.util.Scanner;

public class Laboratorio14 {

	public static void main(String[] args) {
		/*Uma empresa concede empréstimo até o limite de 30% do salário base (incluindo as taxas).
*A partir dessa informação, elabore um algoritmo que obtenha o valor do salário base do cliente,
*identifique o valor máximo que pode ser tomado como empréstimo, calcule a taxa cobrada sobre o
*valor solicitado (conforme tabela abaixo), obtenha o valor do empréstimo solicitado pelo cliente
*e informe o valor recebido pelo cliente ou a negação do empréstimo conforme regra definida.

*Calculo da Taxa de administração:
*até 1.000,00 ........................................ 2,5%
*acima de 1.000,00 até 2.000,00 ...................... 3,4%
*acima de 2.000,00 ................................... 4,2%

*Observe o exemplo abaixo a saída apresentada no eclipse:

*Digite seu salário base: R$ 5000
*Considerando o salário informado a taxa cobrada será de : 0.034
*portanto, o valor máximo para empréstimo será R$ 1449.0
*Digite quanto deseja obter de empréstimo: 1200
*Valor a ser creditado do empréstimo: 1159.2*/
		Scanner ent = new Scanner(System.in);
		double sal, tax, empB, empM, empSol, empL;
		System.out.println("Digite o seu sálario: ");
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
		System.out.println("considerando o salário informado, a taxa cobrada será de: " + tax);
		System.out.println("Portanto o valor máximo de empréstimo é: " + empM);
		System.out.println("Digite quanto deseja obter de empréstimo: ");
		empSol = ent.nextDouble();
		if (empSol > empM) {
			System.out.println("Este valor está acima do permitido.");
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
			System.out.println("O valor a ser creditado do empréstimo: " + empL);
			
		}
		ent.close();
	}

}
