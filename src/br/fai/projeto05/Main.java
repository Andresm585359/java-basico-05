package br.fai.projeto05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();

	}
	
	private void start() {
		
		casosDeFamilia();
		
	}
	
	private void casosDeFamilia() {
		
		int numero;
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<=5;i++) {
			System.out.println("Insira o n�mero da condi��o");
			numero = scan.nextInt();
			
			switch(numero) {
			
				case 1: System.out.println("Primeira condi��o.");
				break;
			
				case 4: System.out.println("Segunda condi��o.");
				break;
			
				default: System.out.println("N�o encontrou uma condi��o.");
				break;
			}
		}
	}

}
