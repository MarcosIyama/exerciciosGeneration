package exercicios_generation_dia_8;

import java.util.Scanner;

public class AtividadePratica2Dia8 {

	public static void main(String[] args) {
		// Variáveis
		int numero, i, iPar = 0, iImpar = 0;

		Scanner leia = new Scanner(System.in);
		// Processamento
		for (i = 1; i <= 10; i++) {
			System.out.println("\nDigite o " + i + "º número: ");
			numero = leia.nextInt();

			if (numero > 0) {
				if ((numero % 2) == 0) {
					iPar++;
				} else if ((numero % 2) == 1) {
					iImpar++;
				}
			} else {
				System.out.println("Númeral inválido.");
			}
		}
		// Saída de Dados
		System.out.println("\n\nTotal de números pares: " + iPar);
		System.out.println("\nTotal de números ímpares: " + iImpar);
	}

}
