package ex_14;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as palavras que deseja comparar separadas por um espa�o: ");
		String[] palavrasArr = sc.nextLine().toUpperCase().split(" ");
		
		System.out.println(Arrays.toString(palavrasArr));
		char[] palavraAtual = palavrasArr[0].toCharArray();
		char[] palavraTeste = palavrasArr[1].toCharArray();
		Arrays.sort(palavraAtual);
		Arrays.sort(palavraTeste);
		System.out.println(Arrays.toString(palavraAtual));
		System.out.println(Arrays.toString(palavraTeste));
		
		System.out.println(Arrays.equals(palavraAtual, palavraTeste));
		
		
		sc.close();

	}

}
