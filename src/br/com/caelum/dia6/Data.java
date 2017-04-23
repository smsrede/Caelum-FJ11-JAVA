package br.com.caelum.dia6;

public class Data {
	int dia = 22;
	int mes = 05;
	int ano = 2017;
	
	String formatada(){
		String dataFormadata;
		dataFormadata = this.dia + "/" + this.mes + "/" + this.ano;
		return dataFormadata;
	}

}
