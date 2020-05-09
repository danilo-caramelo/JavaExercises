package br.ucsal;

public class solucao02 {

	public static void main(String[] args) {
		
	// uma variável definida em for, não faz parte do código. Existe somente dentro da estrutura de 
	// repetição.
	// posso criar quantas variáveis eu quiser dentro de for.
	// todas elas tem que ter o mesmo tipo de dado.
	// A ordem de execução é, primeiro ele verifica a condição, depois executa os comandos descritos 
	//	dentro de for e por fim, realiza a operação do enunciado com a variável. Aí repete tudo.
	// Se você quiser que ela execute a ação com a variavel antes de executar os comandos, tire-a do 
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
