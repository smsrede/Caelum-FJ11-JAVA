package br.com.caelum.dia10;

public class Data {
	int dia = 22;
	int mes = 05;
	int ano = 2017;
	
	public String formatada(){
		String dataFormadata;
		dataFormadata = this.dia + "/" + this.mes + "/" + this.ano;
		return dataFormadata;
	}

}
