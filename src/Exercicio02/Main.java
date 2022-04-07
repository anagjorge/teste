package Exercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite quantos valores deseja adicionar");
		int n = leitor.nextInt();
		int qtd[] = new int[n];
		int i = 0, pares = 0, repetidos = 0, impares = 0;

		for (i = 0; i < n; i++) {
			System.out.println("Digite um número:");
			qtd[i] = leitor.nextInt();

		}

		for (i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (qtd[i] == qtd[j]) {
					System.out.println("Valor repetido :" + qtd[i]);
					repetidos++;
				}
			}
			if (qtd[i] % 2 == 0) {
				pares++;
			}

			if (qtd[i] % 2 == 1) {
				impares++;
			}
		}
		System.out.println("");
		System.out.println("Quantidade de pares:" + pares);
		System.out.println("Quantidade de ímpares:" + impares);
		System.out.println("Quantidade de repetidos:" + repetidos);

	}
}