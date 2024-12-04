package exercicios_generation_dia_6;

import java.util.Scanner;

public class AtividadePratica1 {

	public static void main(String[] args) {
		
		// Variaveis
		String name; // Nome
		float salary; // Salário
		float allowance; // Abono
		float result; // Resultado
		
		Scanner read = new Scanner(System.in);
		
		// Entrada de dados
		System.out.println("Insira o seu nome: ");
		name = read.nextLine();
		
		System.out.println("Digite o valor de seu salário: ");
		salary = read.nextFloat();
		
		System.out.println("Digite o valor de seu abono salarial: ");
		allowance = read.nextFloat();
		
		
		// Processamento
		result = salary + allowance;
		
		//Saída de Dados
		System.out.printf("%s, o valor de seu salário agora é de R$%.2f.", name, result);

		
	}

}
