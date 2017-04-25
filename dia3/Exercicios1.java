package br.com.caelum.dia3;

public class Exercicios1 {
	public static void main(String[] args) {
		
		
//		for (int i=150;i<=300;i++){
//			System.out.println(i);
//		}
//		int soma=0;
//		for (int i=1;i<=1000;i++){
//			soma +=i;
//		}
//		System.out.println(soma);
		
//		for (int i=1;i<100;i++){
//			if (i%3==0)
//			System.out.println(i);
//			
//		}
		
		//int fatorial = 1;
		for (int n = 1; n <= 10; n++) {
			
			System.out.println("Fatorial de"+" 1 é: "+"("+(n*n-1)+")");
		}	
		
		
		
		//System.out.println(fatorial1(3));
		//System.out.println(fatorial2(3));
	
//	private static int fatorial1(int n){
//		if(n==0)
//			return 1;
//		else return n * fatorial1(n-1);
//	}
//	
//	public static int fatorial2(int num){
//		int total =1;
//		for(int i=num;i>1;i--){
//			total *=i;
//		}
//		return total;
//	}
	

		for(int a=0, b=1, i=0; i<15; b+=a, a=b-a, i++) {
			System.out.print(a + " ");
			}  

	}
	

}