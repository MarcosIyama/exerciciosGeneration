package exercicios_generation_dia_7;

import java.util.Scanner;

public class AtividadePratica1Dia7 {

	public static void main(String[] args) {
		// Variáveis
		float nA;
		float nB;
		float nC;

		Scanner leia = new Scanner(System.in);

		// Entrada
		System.out.println("Digite o número A: ");
		nA = leia.nextFloat();

		System.out.println("Digite o número B: ");
		nB = leia.nextFloat();

		System.out.println("Digite o número C: ");
		nC = leia.nextFloat();

		// Processamento
		if (nA + nB > nC) {
			System.out.println("A soma de A + B é MAIOR do que C");

		} else if (nA + nB < nC) {
			System.out.println("A soma de A + B é MENOR do que C");

		} else {
			System.out.println("A soma de A + B é IGUAL a C");

		}
		leia.close();

	}
}
