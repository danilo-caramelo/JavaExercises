package br.ucsal;

public class Laboratorio27 {

	/*PROBLEMA: elabore uma solução para imprimir uma seqüência de nove (09) valores inteiros positivos,
	 *  iniciada pelos números 1 e 2, onde os valores seguintes (posteriores) deverão ser obtidos pela
	 *   multiplicação dos dois números imediatamente anteriores.
	 *   Ao final apresente as seguintes informações:
	 *   a) A seqüência impressa
	 *   b) A média aritmética obtida com o 7º e o último número da seqüência
	 *   c) A soma de todos os números da seqüência
	 *   d) A soma de todos os números divisíveis por 4*/
	
	public static void main(String[] args) {
		int aValor = 1, dValor = 2, vAux = 1, contar = 1, somaSeteNove = 0, somaTotal = 0, somaD =0;
		while (contar <= 9) {
			System.out.print(aValor + " ");
			if (contar == 7 || contar == 9) {
				somaSeteNove += aValor;
			}
			if (aValor %4 == 0) {
				somaD += aValor;
			}
			somaTotal += aValor;
				
			vAux = aValor * dValor;
			aValor = dValor;
			dValor = vAux;
			contar++;
		}
		System.out.println("\nb) " + (somaSeteNove/2));
		System.out.println("c) " + somaTotal);
		System.out.println("d) "+ somaD);
		
	}

}
