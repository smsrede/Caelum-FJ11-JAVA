package br.com.caelum.dia2;

import java.util.Scanner;

public class EscopoScannerLoop {
	public static void main(String[] args) {

		// PODERIA USAR O BREAK PARA PARAR O LACÇO
		// for (int i = x; i < y; i++) {
		// if (i % 19 == 0) {
		// System.out.println("Achei um número divisível por 19 entre x e y");
		// break;
		// }
		// }
		// o (CONTINUE)
		// embora esteja no IF
		// faz pular a linha
		// subsequente que por acaso esta no
		// for
		for (int i = 0; i < 100; i++) {
			if (i > 50 && i < 60) {
				continue;
			}
			System.out.println(i);
		}

		// escopo de variável

		int diaDaSemana = 200;

		switch (diaDaSemana) {

		case 200:

			System.out.println("Domingo");

			break;

		case 2:

			System.out.println("Segunda-feira");

			break;

		case 3:

			System.out.println("Terça-feira");

			break;

		case 4:

			System.out.println("Quarta-feira");

			break;

		case 5:

			System.out.println("Quinta-feira");

			break;

		case 6:

			System.out.println("Sexta-feira");

			break;

		case 7:

			System.out.println("Sábado");

			break;

		default:

			System.out.println("Este não é um dia válido!");

		}

		boolean continuar = true;
		int opcao;
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("\t\tMenu de opções do curso Java Progressivo:");
			System.out.println("\t1. Ver o menu");
			System.out.println("\t2. Ler o menu");
			System.out.println("\t3. Repetir o menu");
			System.out.println("\t4. Tudo de novo");
			System.out.println("\t5. Não li, pode repetir?");
			System.out.println("\t0. Sair");

			System.out.print("\nInsira sua opção: ");
			opcao = entrada.nextInt();

			if (opcao == 0) {
				continuar = false;
				System.out.println("Programa finalizado.");
			} else {
				System.out.printf("\n\n\n\n\n\n");
			}

		} while (continuar);
		entrada.close();
		
		//quebrar o FOR Externo
		int j =2;
		primeiroloop:
			for(int i=0;i<3;i++){
				if(i == j){
			    	 System.out.println("p1"); 
			         //
			      }
			   //segundoloop:
			   for(j=0;j<5;j++){
			      if(i == j){
			    	 System.out.println("p2"); 
			    	 continue primeiroloop;
			      }
			   }
			}
	}

}