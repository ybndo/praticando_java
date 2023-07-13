package ex_07;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	/*Desafio 7: Fatorial Dado um número inteiro, crie um programa em Java que calcule o
fatorial desse número.*/
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int fatorial = 1;
		
		System.out.println("Digite um número para calcular seu fatorial: ");
		int num = sc.nextInt();

		for (int i=1; i <= num; i++) {
			fatorial *= i;
		}
		
		System.out.printf("O fatorial de %d é: %d", num, fatorial);
		
		sc.close();
	}
	
}
