package ex_02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		 
		
		System.out.println("Quantos números serão digitados?");
		int n = sc.nextInt();
		
		int[] numeros = new int[n];
		
		for (int i=0; i<numeros.length; i++) {
			System.out.printf("Digite o %dº número:%n", i+1);
			numeros[i] = sc.nextInt();
		}
		
		for (int i=0; i<numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				sum += numeros[i];
				count++;
			}
		}
		
		System.out.println("\n" + Arrays.toString(numeros));
		System.out.printf("Média: %s", String.format("%.2f", (float)sum/count));
		
		sc.close();

	}

}
