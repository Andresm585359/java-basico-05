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
			System.out.println("Insira o número da condição");
			numero = scan.nextInt();
			
			switch(numero) {
			
				case 1: System.out.println("Primeira condição.");
				break;
			
				case 4: System.out.println("Segunda condição.");
				break;
			
				default: System.out.println("Não encontrou uma condição.");
				break;
			}
		}
	}

}
