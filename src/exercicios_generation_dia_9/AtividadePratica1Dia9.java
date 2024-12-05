package exercicios_generation_dia_9;

import java.util.Scanner;

public class AtividadePratica1Dia9 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int busca;

		System.out.println("Digite o número que você deseja encontrar: ");
		busca = leia.nextInt();

		if (busca > 0) {
			if (busca <= 10) {
				for (int i = 0; busca < 10; i++) {
					if (busca == vetor[i]) {
						System.out.println("O número " + busca + " está localizado na posição: " + i);
						break;
					}
				}
			} else {
				System.out.println("O número " + busca + " não foi encontrado!");
			}
		} else {
			System.out.println("O número " + busca + " não foi encontrado!");
		}
		leia.close();
	}

}
