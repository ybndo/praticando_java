package ex_03;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	/* Desafio 3: Números Primos Crie um programa em Java que, dado um número
inteiro, verifique se ele é um número primo.
*/

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int c = 0;
		
		System.out.println("Digite um número inteiro para saber se ele é primo:");
		int num = sc.nextInt();
		
		for (int i=1 ; i<= num; i++) {
			if (num % i == 0) {
				c += 1;
			}
		}
		
		if (c == 2) {
			System.out.printf("\n%d é um número primo", num);
		} else {
			System.out.printf("\n%d não é um número primo", num);
		}
		
		sc.close();
		
	}

}
