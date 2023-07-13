package ex_09;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {
	/*Desafio 9: Contagem de Caracteres Dada uma frase, crie um programa em Java que
conte quantas vezes cada caractere aparece na frase.*/
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Map<Character, Integer> letras = new HashMap<>();
		
		System.out.println("Digite uma palavra/frase: ");
		String s = sc.nextLine().toUpperCase();
		
		for (int i=0; i<=s.length()-1; i++) {
			if (letras.containsKey(s.charAt(i))) {
				letras.put(s.charAt(i), letras.get(s.charAt(i))+1);
			} else {
				letras.put(s.charAt(i), 1);
			}
		}
		System.out.println();
		for (Character letra : letras.keySet()) {
			
			Integer quantidade = letras.get(letra);
			System.out.println(letra + " aparece " + quantidade + " vez(es).");
		}
		
		sc.close();
	}
}
