package exercicios_generation_dia_6;

import java.util.Scanner;

public class AtividadePratica2 {

	public static void main(String[] args) {
		// Variaveis
		String nome;
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float mediaFinal;
		
		Scanner leia = new Scanner(System.in);
		
		
		//Entrada de Dados
		System.out.println("Insira o seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Insira sua primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Insira sua segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Insira sua terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Insira sua quarta e última nota: ");
		nota4 = leia.nextFloat();
		
		// Processamento
		mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		// Saída de dados
		System.out.printf("Participante %s, sua nota final foi: %.1f", nome, mediaFinal);
	}

}
