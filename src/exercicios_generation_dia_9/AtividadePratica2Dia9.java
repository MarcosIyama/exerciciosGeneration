package exercicios_generation_dia_9;

import java.util.Scanner;

public class AtividadePratica2Dia9 {

	public static void main(String[] args) {
		
		float total, media;
		int numeros[] = new int[10];
		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "º Número: ");
			numeros[i] = leia.nextInt();
		}
		
		System.out.println("\n\nElementos nos índices ímpares: " + numeros[1] + " " + numeros[3] + " " +  numeros[5] + " " +  numeros[7] + " " +  numeros[9]);
		
		/*System.out.print("\nElementos ímpares:");
		for (int indice = 0; indice < 10; indice++) {
			if ((numeros[indice] % 2) == 1) {
				System.out.print(" " + numeros[indice]);
			}
		}*/

		System.out.print("\nElementos pares:");
		for (int indice = 0; indice < 10; indice++) {
			if ((numeros[indice] % 2) == 0) {
				System.out.print(" " + numeros[indice]);
			}
		}
		total = numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4] + numeros[5] + numeros[6] + numeros[7] + numeros[8] + numeros[9];
		System.out.printf("\n\nSoma: %.0f", total);
		media = total / 10;
		System.out.printf("\n\nMédia: %.2f", media);
		
		leia.close();
	}
}
