package exercicios_generation_dia_6;

import java.util.Scanner;

public class AtividadePratica4 {

	public static void main(String[] args) {
		// Variáveis
		float n1;
		float n2;
		float n3;
		float n4;
		float resultado;
		
		Scanner leia = new Scanner(System.in);
		
		// Entrada de Dados
		System.out.println("Insira o 1º número: ");
		n1 = leia.nextFloat();
		
		System.out.println("Insira o 2º número: ");
		n2 = leia.nextFloat();
		
		System.out.println("Insira o 3º número: ");
		n3 = leia.nextFloat();
		
		System.out.println("Insira o 4º número: ");
		n4 = leia.nextFloat();
		
		// Processamento
		resultado = (n1 * n2) - (n3 * n4);
		
		// Saída de Dados
		System.out.printf("A diferença foi: %.1f", resultado);
		
	}

}
