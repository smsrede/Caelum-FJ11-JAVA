package br.com.caelum.dia5;

public class FabricaDeCarro {

	public static void main(String[] args) {
		
		Carro meuCarro = new Carro();
		meuCarro.cor = "verde";
		meuCarro.modelo = "FUSCA";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		
		//liga o carro
		meuCarro.liga();
		
		//acelera o carro
		meuCarro.acelera(20);
		
		System.out.println(meuCarro.velocidadeAtual);
		
		//saber a marcha
		meuCarro.pegaMarcha();
	}

	static class Carro {
		String cor;
		String modelo;
		double velocidadeAtual;
		double velocidadeMaxima;

		// liga carro
		void liga() {
			System.out.println("O carro está ligado");
		}

		// acelera uma certa quantidade
		void acelera(double quantidade) {
			this.velocidadeAtual += quantidade;
		}

		// devolve a marcha do carro
		int pegaMarcha() {
			if (this.velocidadeAtual <= 0) {
				return -1;
			}
			if (this.velocidadeAtual > 0 && this.velocidadeAtual < 40){
				return 1;
			}
			if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80){
				return 2;
			}
			return 3;
		}

	}

}
