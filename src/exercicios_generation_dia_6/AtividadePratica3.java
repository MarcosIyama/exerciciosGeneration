package exercicios_generation_dia_6;

import java.util.Scanner;

public class AtividadePratica3 {

	public static void main(String[] args) {
		// Variaveis
		float salBruto;
		float adNoturno;
		float hrExtras;
		float descontos;
		float salLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		// Entrada de Dados
		System.out.println("Insira o valor de seu SALÁRIO BRUTO: ");
		salBruto = leia.nextFloat();
		
		System.out.println("Insira o valor de seu ADICIONAL NOTURNO: ");
		adNoturno = leia.nextFloat();
		
		System.out.println("Insira o valor de suas HORAS EXTRAS: ");
		hrExtras = leia.nextFloat();
		
		System.out.println("Insira o valor dos DESCONTOS em seu salário: ");
		descontos = leia.nextFloat();
		
		// Porcessamento
		salLiquido = salBruto + adNoturno + (hrExtras * 5) - descontos;
		
		// Saída de Dados
		System.out.printf("O valor de seu SALÁRIO LÍQUIDO foi de R$%.2f.", salLiquido);

	}

}
