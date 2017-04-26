package br.com.caelum.dia6;

//copia da classe Conta em dia 5
public class ContaNova {
	int numero;
	// String dono;
	double saldo;
	double limite;
	Cliente titular;
	// ...
	/*
	 * variáveis de obj ou atributo
	 */

	// void saca(double quantidade) {
	// double novoSaldo = this.saldo - quantidade;
	// this.saldo = novoSaldo;
	// }

	// evolução do método SACA
	boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}

	void deposita(double quantidade) {
		this.saldo += quantidade;
	}

	/*
	 * //O metodo transferencia void transfere(Conta destino, double valor){
	 * this.saldo = this.saldo - valor; destino.saldo = destino + valor; }
	 */
	// transfere melhorado:

	boolean transfere(ContaNova destino, double valor) {
		boolean retirou = this.saca(valor);
		if (retirou) {
			// há dinheiro para transferir
			destino.deposita(valor);
			return true;
		} else {
			// valor n disponivel para saque
			return false;
		}

	}
	/*
	 * No java a passagem de parametro para metodo funciona como atribuição
	 * = quando passa uma var do tipo Class ela passara uma referencia
	 * (naturalmente)
	 */
	// -------------
	/*
	 * Note que conta não tem nome, cpf isso é do cliente
	 */

}