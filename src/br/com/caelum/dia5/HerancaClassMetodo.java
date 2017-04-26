package br.com.caelum.dia5;

public class HerancaClassMetodo {

	public static void main(String[] args) {

		// c = cliente
		Conta minhaConta = new Conta();
		//Cliente c = new Cliente();
		// o retorno do NEW para a var "c" � uma ref, uma flecha
		// teste em tese:
		// minhaConta.titular = c;
		// ou
		minhaConta.titular = new Cliente();
		/*
		 * Note que Dentro da Conta n�o tenho "nome da conta", mas, um numero e
		 * um "titular" que vem a ser um cliente, com atributos pr�prios da
		 * class Cliente Note que s�o referencias
		 */
		Cliente clienteDamihaConta = minhaConta.titular;
		clienteDamihaConta.nome = "Samuca";
		// ou
		minhaConta.titular.nome = "Samuca";
		// Note que na linha anterior o caminho � menor

		// //Teste do m�todo transfere:
		// Conta destino = new Conta();
		// minhaConta.saldo = 1000;
		// minhaConta.transfere(destino, 200);
		// System.out.println("saldo minhaconta: " + minhaConta.saldo);
		// System.out.println("saldo destino: " + destino.saldo);

	}

	static class Conta {
		int numero;
		// String dono;
		double saldo;
		double limite;
		Cliente titular;
		// ...
		/*
		 * vari�veis de obj ou atributo
		 */

		// void saca(double quantidade) {
		// double novoSaldo = this.saldo - quantidade;
		// this.saldo = novoSaldo;
		// }

		// evolu��o do m�todo SACA
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

		boolean transfere(Conta destino, double valor) {
			boolean retirou = this.saca(valor);
			if (retirou) {
				// h� dinheiro para transferir
				destino.deposita(valor);
				return true;
			} else {
				// valor n disponivel para saque
				return false;
			}

		}
		/*
		 * No java a passagem de parametro para metodo funciona como atribui��o
		 * = quando passa uma var do tipo Class ela passara uma referencia
		 * (naturalmente)
		 */
		// -------------
		/*
		 * Note que conta n�o tem nome, cpf isso � do cliente
		 */

	}

	static class Cliente {
		String nome;
		String sobrenome;
		String cpf;
	}

	
	
}