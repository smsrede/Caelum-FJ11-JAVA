package br.com.caelum.dia6;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		Fibonacci fi = new Fibonacci();

		for (int i = 0; i <= 5; i++) {
			System.out.print(fi.fibo2(i) + "\n");
		}
		
		
	}

	
	//sequencia Fibonacci
	long fibo1(int f) {
			if (f < 2) {
				return f;
			} else {
				return fibo1(f - 1) + fibo1(f - 2);
			}
	}
	
	//fibonacci usando o operador ternario
	long fibo2(int f){
		return (f<2)? f : fibo2(f-1) + fibo2(f-2);
		
	}

}
