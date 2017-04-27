package br.com.caelum.dia8;

public class TesteArrayChimura {

	// atributos
	String id = "padrão"; // poderia ser no construtor

	public static void main(String[] args) {

		double[] d;// mera variavel
		// a JVM só quer saber o tamanho quando vc quer criar o array
		d = new double[5];

		// agora um array de objetos usando a classe TesteArrayChimura

		TesteArrayChimura t1 = new TesteArrayChimura();
		t1.id = "primeira classe";

		TesteArrayChimura t2 = new TesteArrayChimura();
		t2.id = "segunda classe";

		// criando um array da classe TesteArrayChimura
		TesteArrayChimura[] ta;
		ta = new TesteArrayChimura[3];

		/*
		 * estou enchendo cada posição no array com a informação toda da classe.
		 * ou seja, com a referencia basica à memoria, onde esta o objeto t1
		 * = @15db9742 ta[0] = @15db9742
		 */
		ta[0] = t1;
		ta[1] = t2;
		// aqui, eu coloco a referencia para instancia diretamente dentro do
		// espaço do array
		ta[2] = new TesteArrayChimura();

		System.out.println(ta[2].id);

		// para teste com metodoVarReferencia()
		String id2 = "padrão";
		TesteArrayChimura p = new TesteArrayChimura();
		p.metodoVarReferencia(id2);

		// para teste com metodoArray();
		int[] vetor = new int[3];
		vetor[0] = 1;
		vetor[1] = 2;
		vetor[2] = 3;
		TesteArrayChimura a = new TesteArrayChimura();
		a.metodoArray(vetor);

		// para teste com metodoMatrizBi();
		int[][] vetor2 = new int[2][3];
		vetor[0] = 1;
		vetor[1] = 2;
		vetor[2] = 3;
		TesteArrayChimura mb = new TesteArrayChimura();
		mb.metodoMatrizBi(vetor2);

	}

	// Passando array e matriz como argumento:

	public void metodoVarReferencia(String nome) {

	}

	// passando um vetor int
	public void metodoArray(int[] v) {
		System.out.println(v);
		System.out.println(v.length);
	}

	// passando um vetor int
	public void metodoMatrizBi(int[][] m){
		System.out.println(m);
		//lenth em vetor(quando não especificamos linha) rtorna numero de linhhas)
		System.out.println("numero de linhas: " + m.length);
		//quando passamos lenth com a primeira linha do vetor recuperamos quantas colunas
		System.out.println("numero de colunas na linha 0: " + m[0].length);
	}
}
