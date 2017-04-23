package br.com.caelum.dia6;

public class Porta {

	String aberta = "aberta";
	String cor = "Vermelha";
	double dimensãoX = 1.5;
	double dimensãoY = 0.5;
	double dimensãoZ = 1.0;

	// fecha a porta
	void abre() {
		this.aberta = "aberta";

		// abre a porta
	}

	void fecha() {
		this.aberta = "fechada";
	}

	// pinta a porta
	void pinta(String s) {

		this.cor = s;
	}

	// verifica se esta aberta
	boolean estaAberta() {
		if (this.aberta.contentEquals("aberta")) {
			return true;
		} else {
			return false;
		}
	}

	public void mostraTodos() {
		System.out.println(this.estaAberta());
		this.abre();
		System.out.println(this.estaAberta());
		this.fecha();
		System.out.println(this.estaAberta());
		this.pinta("vermelha");
		System.out.println(this.cor);
		
	}


}
