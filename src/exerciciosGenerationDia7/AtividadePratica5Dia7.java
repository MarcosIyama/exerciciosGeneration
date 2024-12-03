package exerciciosGenerationDia7;

import java.util.Scanner;

public class AtividadePratica5Dia7 {

	public static void main(String[] args) {
		// Variáveis
		int codigoProd;
		int quantProd;
		float valorProd;
		float valorTotal;
		
		
		Scanner leia = new Scanner(System.in);		
		
		// Entrada
		System.out.println("Cardápio:\n");
		System.out.println("\nCódigo -- Produto -- Valor (R$)");
		System.out.println("\n  1  -- Cachorro Quente -- R$ 10,00");
		System.out.println("  2  -- X-Salada -- R$ 15,00");
		System.out.println("  3  -- X-Bacon -- R$ 18,00");
		System.out.println("  4  -- Bauru -- R$ 12,00");
		System.out.println("  5  -- Refrigerante -- R$ 8,00");
		System.out.println("  6  -- Suco de laranja -- R$ 13,00");
		System.out.println("\nDigite o código do produto: ");
		codigoProd = leia.nextInt();
		System.out.println("Digite a quantidade: ");
		quantProd = leia.nextInt();
		
		// Processamento
		switch (codigoProd) {
		case 1:
			valorProd = 10.00f;
			valorTotal = valorProd * quantProd;
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
		case 2:
			valorProd = 15.00f;
			valorTotal = valorProd * quantProd;
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
		case 3:
			valorProd = 18.00f;
			valorTotal = valorProd * quantProd;
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
		case 4:
			valorProd = 12.00f;
			valorTotal = valorProd * quantProd;
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
		case 5:
			valorProd = 8.00f;
			valorTotal = valorProd * quantProd;
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
		case 6:
			valorProd = 13.00f;
			valorTotal = valorProd * quantProd;
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
		default:
			System.out.println("Opção inválida.");
		}
		leia.close();
		
	}

}
