package ex_06;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	/*Desafio 6: Verificar Anagrama Crie um programa em Java que verifique se duas
palavras s�o anagramas. Ou seja, se as palavras possuem as mesmas letras, mas
em ordem diferente.*/
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String p1, p2;
		
		System.out.println("Digite as duas palavras para saber se s�o anagramas: ");
		p1 = sc.next().toUpperCase();
		p2 = sc.next().toUpperCase();
		
		char[] p1Arr = p1.toCharArray();
		Arrays.sort(p1Arr);
		char[] p2Arr = p2.toCharArray();
		Arrays.sort(p2Arr);
		
		if (Arrays.equals(p1Arr, p2Arr)) {
			System.out.println("S�o anagramas");
		} else {
			System.out.println("N�O s�o anagramas");
		}
		
		sc.close();

	}

}
