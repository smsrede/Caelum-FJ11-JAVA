package br.com.caelum.dia9;

public class EstudoArray1 {

	public static void main(String[] args) {
		/*
		 * var-args int... param String param
		 */
		// digamos temos primiramente esses valores a serem usados
		int idade1 = 1;
		int idade2 = 2;
		int idade3 = 3;
		int idade4 = 4;

		// numero máximo para aposta
		// int n=10;
		// int numerosDoBilhete[] = new int[n];
		// ou
		int[] apostamax = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

		EstudoArray1 t = new EstudoArray1();

		t.bilheteDeLoteria("numeros da sorte: ", apostamax);

		// Aqui crio o array
		Conta[] minhasContas;
		minhasContas = new Conta[10];

		// Aqui crio a variavel que passarei no array
		Conta contaNova = new Conta();
		// aqui abasteço atributos para teste
		contaNova.saldo = 81000;
		contaNova.nome = "Samuel";
		// aqui passo a isntancia do obj para dentro da posição do array criada
		// do mesmo tipo
		// e recebe a estrutura iteira

		minhasContas[0] = contaNova; // percaba que aqui conNova esta com
										// atributos abastecidos
		// aqui comprovo que a posição 0 recebeu TUDO de Conta
		System.out.println(minhasContas[0].saldo);
		System.out.println(minhasContas[0].nome);

		// ou poderiamos fazer assim:
		// OBS: note que ora crio var conta do tipo Conta e passo no array
		// do tipo Conta (acima) -- ou -- (abaixo) instancio Conta jogando
		// direto
		// num array do tipo Conta (abaixo)
		// Repare que podia ser num FOR [i]

		// perceba que cada posição do array guarda referencias!

		minhasContas[1] = new Conta();
		minhasContas[2] = new Conta();
		minhasContas[1].saldo = 100000;
		minhasContas[2].saldo = 200000;

		System.out.println(minhasContas[1].saldo);
		System.out.println(minhasContas[2].saldo);
		
	}//fim do Main

	public void bilheteDeLoteria(String msg, int... param) {
		for (int i = 0; i < param.length; i++) {
			System.out.println(msg + param[i]);
		}// fim do for
	}//fim do bilhete

	
	
	public class Conta {
		int saldo;
		String nome;
	}

}
