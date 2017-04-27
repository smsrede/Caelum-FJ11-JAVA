package br.com.caelum.dia9;

public class EstudoArray1 {

	public static void main(String[] args) {
		/*
		var-args
		int... param
		String param
		*/
		//digamos temos primiramente esses valores a serem usados
		int idade1 = 1;
		int idade2 = 2;
		int idade3 = 3;
		int idade4 = 4;
		
		EstudoArray1 t = new EstudoArray1();
		t.metodo2("mensagem: ", 1,2,3);		
	}
	public void metodo2(String msg, int...param){
		System.out.println(msg + param[0]);
		System.out.println(msg + param[1]);
	}
	
}
