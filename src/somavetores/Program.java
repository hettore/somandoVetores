package somavetores;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas posicoes cada vetor tera: ");
		int n = sc.nextInt();

		int vetorA[] = new int[n];
		int vetorB[] = new int[n];
		int vetorC[] = new int[n];

		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
		}

		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = sc.nextInt();
		}

		System.out.println("Vetor resultado da soma de cada posicao do vetorA + vetorB: ");
		for (int i = 0; i < vetorB.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.println(vetorC[i]);
		}

	}

}
