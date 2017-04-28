package br.com.caelum.dia10;

public class Banco {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Data data = new Data();
		 
		
		
		f1.nome="Samuel";
		f1.salario=100;
		f1.bonifica(1500);
		f1.departamento="Desenvolvimento JAVA";
		f1.dataEntrada = data;
		f1.rg="012.053.762.6";
		f1.salario=8000.00;
		f1.estaNaEmpresa=true;
		
		f2.nome="Samuel";
		f2.salario=100;
		f2.bonifica(1500);
		f2.departamento="Desenvolvimento JAVA";
		f2.dataEntrada = data;
		f2.rg="012.053.762.6";
		f2.salario=8000.00;
		f2.estaNaEmpresa=true;
		
		
		/*
		 * compara Funcionarios, que mesmo com atributos de valores iguais, prova que são diferentes
		 * pois as referências são diferentes
		 */
		//MODIFICADOR do resultado abaixo apontando as referencias para o mesmo objeto (funcionario)
		//Tornando ambos iguais caso descomente
		//f2 = f1;
		
		if(f1==f2){
			System.out.println("Funcionarios Iguais");
		}else{
			System.out.println("Funcionarios Diferentes\n");
		}
		

		//mostra todas mudanças realizadas nos atributos durante os testes
		f1.mostra();
		f2.mostra();
	
		
		
	}

}
