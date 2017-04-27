package br.com.caelum.dia8;

public class TesteArrayChimura2 {

	public static void main(String[] args) {
		/*
		var-args
		int... param
		String param
		*/
		//digamos temos primiramente esses valores a serem usados
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		
		TesteArrayChimura2 t = new TesteArrayChimura2();
		t.metodo("mensagem: ", 1,2,3);		
	}
	public void metodo(String msg, int...param){
		System.out.println(msg + param[0]);
		System.out.println(msg + param[1]);
	}

}
