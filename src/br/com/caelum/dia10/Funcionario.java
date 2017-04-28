package br.com.caelum.dia10;

public class Funcionario {
	public String nome;
	public String departamento;
	public String rg;
	public Data dataEntrada;
	public double salario;
	public boolean estaNaEmpresa;
	//Data data = new Data();
	
	
	//Icrementa o salario do empregado conforme aumento salarial desejado, passado no argumento
	public void bonifica(double aumento) {

		this.salario += aumento;
	}

	//responde se o emprego encontra-se empregado na empresa ou não
	public String admissao() {
		String admitidoOuNao;
		if (this.estaNaEmpresa) {
			admitidoOuNao = "Empregado está na Empresa";
		} else {
			admitidoOuNao = "Empregado não está mais na empresa";
		}
		return admitidoOuNao;
	}

	//calcula o ganho anual do empregado
	public double calculaGanhoAnual() {
		double ganhoAnual;
		ganhoAnual = this.salario * 12;

		return ganhoAnual;
	}
	
	
	//mostra todas as alteraões nos atrubutos durante os testes
	public void mostra(){
		System.out.println("Nome:				                   " + this.nome);
		System.out.println("Departamento:					   " + this.departamento);
		System.out.println("Data de Entrada:				   " + this.dataEntrada.formatada());
		System.out.println("RG:                                                " + this.rg);
		System.out.println("Salario                                            " + this.salario);
		System.out.println("Funcionario está na empresa?:                      " + this.admissao());
		
		System.out.println("\n");
		
		System.out.println("O Sal novo de " + this.nome + " é:                            " + this.salario + " Euros");
		System.out.println("O ganho anual é de: 			           " + this.calculaGanhoAnual());
				
	}

}
