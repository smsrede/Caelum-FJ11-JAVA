package br.com.caelum.dia6;

public class Funcionario {
	String nome;
	String departamento;
	String rg;
	Data dataEntrada;
	double salario;
	boolean estaNaEmpresa;
	//Data data = new Data();
	
	
	//Icrementa o salario do empregado conforme aumento salarial desejado, passado no argumento
	void bonifica(double aumento) {

		this.salario += aumento;
	}

	//responde se o emprego encontra-se empregado na empresa ou n�o
	String admissao() {
		String admitidoOuNao;
		if (this.estaNaEmpresa) {
			admitidoOuNao = "Empregado est� na Empresa";
		} else {
			admitidoOuNao = "Empregado n�o est� mais na empresa";
		}
		return admitidoOuNao;
	}

	//calcula o ganho anual do empregado
	double calculaGanhoAnual() {
		double ganhoAnual;
		ganhoAnual = this.salario * 12;

		return ganhoAnual;
	}
	
	
	//mostra todas as altera�es nos atrubutos durante os testes
	void mostra(){
		System.out.println("Nome:				                   " + this.nome);
		System.out.println("Departamento:					   " + this.departamento);
		System.out.println("Data de Entrada:				   " + this.dataEntrada.formatada());
		System.out.println("RG:                                                " + this.rg);
		System.out.println("Salario                                            " + this.salario);
		System.out.println("Funcionario est� na empresa?:                      " + this.admissao());
		
		System.out.println("\n");
		
		System.out.println("O Sal novo de " + this.nome + " �:                            " + this.salario + " Euros");
		System.out.println("O ganho anual � de: 			           " + this.calculaGanhoAnual());
				
	}

}
