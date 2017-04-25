package br.com.caelum.dia7;

public class Array {
	public static void main(String[] args) {
   /*	
	 * Uma array é sempre um objeto, portanto, a variável idades é uma
	 * referência. Vamos precisar criar um objeto para poder usar a array.
	 * Como criamos o objeto-array? idades = new int[10];
	 
	// se fosse um bilhete de loteria
	//int numerosDoBilhete[] = new int[10];
	ContaTeste[] minhasContas = new ContaTeste[10];
	minhasContas[0].numero = 1;
	minhasContas[1].numero = 2;
	//=====================================
	//ou
	//lembre q sao ponteiros..no caso estao apontando para lugares distintos
	ContaTeste contaNova = new ContaTeste();
	contaNova.numero = 1000;
	minhasContas[0] = contaNova;
	minhasContas[1] = contaNova;
	//=====================================
	//ou
	minhasContas[1] = new ContaTeste();
	minhasContas[1].numero = 22222;
	*/
	
	idade();
	//criei um array, PREENCHI, E PASSEI COMO PARAMTRO
	
	int[] intArray = new int[]{1, 2, 3};
	
	imprimeArray(intArray);
	
	}//fim do  main
	
	
	static void idade(){
		//repare como foi declarado
		int[] idades = new int[10];
		for (int i = 0; i<10;i++){
			idades[i] = i *10;
		}
		for (int i = 0; i<10;i++){
			System.out.println(idades[i]);
		}
		
	}//fim do metodo idade
	
	
	static void imprimeArray(int[] array){
		for (int i=0; i<array.length;i++){
			System.out.println(array[i]);
		}
	}
	
	
}//fim da class
