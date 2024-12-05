package exercicios_generation_dia_7;

import java.util.Scanner;

public class AtividadePratica2Dia7 {

	public static void main(String[] args) {
		// Variáveis
		float numero;

		Scanner leia = new Scanner(System.in);

		// Entrada
		System.out.println("Digite um número: ");
		numero = leia.nextFloat();

		// Processamento
		if (numero > 0) {
			if ((numero % 2) == 0) {
				System.out.printf("O Número %.0f é par e positivo!", numero);

			} else if ((numero % 2) == 1) {
				System.out.printf("O Número %.0f é ímpar e positivo!", numero);

			}
		} else if (numero < 0) {
			if ((numero % 2) == 0) {
				System.out.printf("O Número %.0f é par e negativo!", numero);

			} else if ((numero % 2) == -1) {
				System.out.printf("O Número %.0f é ímpar e negativo!", numero);

			}
		} else {
			System.out.println("Númeral 0 é inválido.");
		}
		leia.close();

	}

}
