package exercicios_generation_dia_8;

import java.util.Scanner;

public class AtividadePratica5Dia8 {

	public static void main(String[] args) {
		// Variáveis
		int numero, positivoTotal = 0;
		
		Scanner leia = new Scanner(System.in);
		
		// Processamento
		do {
			System.out.println("\nDigite um número inteiro: ");
			numero = leia.nextInt();
			
			if (numero > 0) {
				positivoTotal = positivoTotal + numero;
			}
			
			
		} while (numero != 0);
		// Saída final
		System.out.println("\n\nA soma dos números positivos é: " + positivoTotal);
	}

}
