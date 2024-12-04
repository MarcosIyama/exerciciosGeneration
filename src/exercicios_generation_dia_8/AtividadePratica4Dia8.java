package exercicios_generation_dia_8;

import java.util.Scanner;

public class AtividadePratica4Dia8 {

	public static void main(String[] args) {
		// Variáveis
		String continuar;
		int idade, idg, dev;
		int idgMC = 0, idgHC = 0, idgNB = 0, idgMT = 0, idgHT = 0, idgO = 0; // Declarando contadores de IDG
		int devB = 0, devF = 0, devM = 0, devFS = 0; // Declarando contadores de pessoas desenvolvedoras
		int mulheresF = 0, hmma40 = 0, nbfsme30 = 0; // Declarando contadores de saídas finais
		float mediaIdade, idadeTotal = 0, participantes = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("Pesquisa interna da área de Desenvolvimento\n");

		System.out.println("\nDeseja iniciar a pesquisa (S/N): ");
		continuar = leia.next();

		while (continuar.equalsIgnoreCase("S")) {
			participantes++;

			System.out.println("\nIdade: ");
			idade = leia.nextInt();
			idadeTotal = idadeTotal + idade;

			System.out.println("\n\nCódigo -- Identidade de Gênero");
			System.out.println("\n  1  -- Mulher Cis");
			System.out.println("  2  -- Homem Cis");
			System.out.println("  3  -- Não Binário");
			System.out.println("  4  -- Mulher Trans");
			System.out.println("  5  -- Homem Trans");
			System.out.println("  6  -- Outros");
			System.out.println("\nDigite o código correspondente: ");
			idg = leia.nextInt();

			if (idg == 1) {
				idgMC++;
			} else if (idg == 2) {
				idgHC++;
			} else if (idg == 3) {
				idgNB++;
			} else if (idg == 4) {
				idgMT++;
			} else if (idg == 5) {
				idgHT++;
			} else if (idg == 6) {
				idgO++;
			}

			System.out.println("\n\nCódigo -- Pessoa Desenvolvedora");
			System.out.println("\n  1  -- Backend");
			System.out.println("  2  -- Frontend");
			System.out.println("  3  -- Mobile");
			System.out.println("  4  -- FullStack");
			System.out.println("\nDigite o código correspondente: ");
			dev = leia.nextInt();

			if (dev == 1) {
				devB++;
			} else if (dev == 2) {
				devF++;
			} else if (dev == 3) {
				devM++;
			} else if (dev == 4) {
				devFS++;
			}

			// Processamento para levantamentos específicos
			if (dev == 2) {
				if (idg == 1) {
					mulheresF++;
				} else if (idg == 4) {
					mulheresF++;
				}
			}
			if (idade > 40) {
				if (dev == 3) {
					if (idg == 2) {
						hmma40++;
					} else if (idg == 5) {
						hmma40++;
					}
				}
			}
			if (idade < 30) {
				if (dev == 4) {
					if (idg == 3) {
						nbfsme30++;
					}
				}
			}

			System.out.println("\n\nDeseja iniciar a pesquisa de um novo colaborador (S/N): ");
			continuar = leia.next();
		}
		mediaIdade = idadeTotal / participantes;

		// Saída Final
		System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + devB);

		System.out.println("\nTotal de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulheresF);

		System.out.println("\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + hmma40);

		System.out.println("\nTotal de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + nbfsme30);

		System.out.printf("\nO número total de pessoas que responderam à pesquisa: %.0f", participantes);

		System.out.printf("\n\nA média de idade das pessoas que responderam à pesquisa: %.2f", mediaIdade);
	}
}
