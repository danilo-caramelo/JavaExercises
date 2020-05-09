package br.ucsal;

public class Laboratorio25 {

	public static void main(String[] args) {
		int pValor = 0, sValor = 1, vAux = 0;
		while (pValor <= 1000) {
			System.out.print(pValor + " ");
			vAux = pValor + sValor;
			pValor = sValor;
			sValor = vAux;
			
			
	//                                 Teste de mesa
	//                 --------------------------------------------------
	//                   pValor  |   sValor   |    vAux     |   Saída
	//Início               0           1             0            -
	// 1 execução          1           1             1         0
	// 2 execução          1           2             2         0 1
	// 3 execução          2           3             3         0 1 1
	// 4 execução          3           5             5         0 1 1 2
			
		}
	}	

}
