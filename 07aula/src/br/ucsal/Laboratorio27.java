package br.ucsal;

public class Laboratorio27 {

	/*PROBLEMA: elabore uma solu��o para imprimir uma seq��ncia de nove (09) valores inteiros positivos,
	 *  iniciada pelos n�meros 1 e 2, onde os valores seguintes (posteriores) dever�o ser obtidos pela
	 *   multiplica��o dos dois n�meros imediatamente anteriores.
	 *   Ao final apresente as seguintes informa��es:
	 *   a) A seq��ncia impressa
	 *   b) A m�dia aritm�tica obtida com o 7� e o �ltimo n�mero da seq��ncia
	 *   c) A soma de todos os n�meros da seq��ncia
	 *   d) A soma de todos os n�meros divis�veis por 4*/
	
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
