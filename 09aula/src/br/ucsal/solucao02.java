package br.ucsal;

public class solucao02 {

	public static void main(String[] args) {
		
	// uma vari�vel definida em for, n�o faz parte do c�digo. Existe somente dentro da estrutura de 
	// repeti��o.
	// posso criar quantas vari�veis eu quiser dentro de for.
	// todas elas tem que ter o mesmo tipo de dado.
	// A ordem de execu��o �, primeiro ele verifica a condi��o, depois executa os comandos descritos 
	//	dentro de for e por fim, realiza a opera��o do enunciado com a vari�vel. A� repete tudo.
	// Se voc� quiser que ela execute a a��o com a variavel antes de executar os comandos, tire-a do 
	// enunciado e coloque nos comandos, como no exemplo 2.
		
	for(int var = 0; var < 10; var++) {
		System.out.print(var);
		System.out.print("-");
		System.out.print(">");
	
	}
	
	for(int var = 0; var < 10;) {
		var ++;
		System.out.print(var);
		System.out.print("-");
		System.out.print(">");
	
	}
		
	}

}
