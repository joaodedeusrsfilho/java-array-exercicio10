package aula19_Arrays;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*
		 * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo
		 * tipo e tamanho, sendo que cada elemento do vetorB deverá ser o resto da
		 * divisão do respectivo elemento de A por 2(dois) ou seja: B[i] = A[i] % 2.
		 */
		Scanner ler = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Vetor A Digite o valor da posicao " + i + " ");
			vetorA[i] = ler.nextInt();
			vetorB[i] = vetorA[i] % 2;
		}
		System.out.print("VetorA = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.print("VetorB = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
	}
}
