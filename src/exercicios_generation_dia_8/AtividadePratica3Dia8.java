package exercicios_generation_dia_8;

import java.util.Scanner;

public class AtividadePratica3Dia8 {

	public static void main(String[] args) {
		// Variáveis
		int idade = 0, iMenor = 0, iMaior = 0;

		Scanner leia = new Scanner(System.in);

		while (idade >= 0) {
			System.out.println("\nDigite uma idade: ");
			idade = leia.nextInt();

			if (idade >= 0) {
				if (idade < 21) {
					iMenor++;
				} else if (idade > 50) {
					iMaior++;
				}
			}
		}
		System.out.println("\n\nTotal de pessoas menores de 21 anos: " + iMenor);
		System.out.println("\nTotal de pessoas maiores de 50 anos: " + iMaior);

	}

}
