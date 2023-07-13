package ex_04;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	/*
	 * Desafio 4: Soma dos Dígitos Dado um número inteiro, crie um programa em Java
que calcule a soma dos dígitos desse número.
*/

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String num;
		int sum = 0;
		
		System.out.println("Digite um número inteiro: ");
		num = sc.nextLine();
		
		for (int i=0 ; i<num.length(); i++) {
			sum += Character.getNumericValue(num.charAt(i));
		}
		
		System.out.printf("Soma: %d", sum);
		
		sc.close();
	}

}
