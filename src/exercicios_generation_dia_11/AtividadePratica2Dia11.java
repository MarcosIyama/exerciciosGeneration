package exercicios_generation_dia_11;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class AtividadePratica2Dia11 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		Integer comando;

		System.out.println("\n******************************************");
		System.out.println("\nComando --   Ação");
		System.out.println("\n   1    --   Adicionar Livro na pilha");
		System.out.println("   2    --   Listar todos os Livros");
		System.out.println("   3    --   Retirar Livro da pilha");
		System.out.println("   0    --   Sair");
		System.out.println("\n******************************************");

		do {
			System.out.println("\nDigite uma opção: ");
			comando = leia.nextInt();

			switch (comando) {
			case 1:
				System.out.println("\nDigite o nome do livro: ");
				leia.skip("\\R?");
				String livro = leia.nextLine();
				pilha.push(livro);
				System.out.println("\nPilha: ");
				Iterator<String> i1 = pilha.iterator();
				while (i1.hasNext()) {
					System.out.println(i1.next());
				}
				System.out.println("\nLivro Adicionado!");
				break;
			case 2:
				if (pilha.isEmpty() == true) {
					System.out.println("\nNão há nenhum Livro na pilha!");
				} else {
					System.out.println("\nLista de livros na Pilha: ");
					Iterator<String> i2 = pilha.iterator();
					while (i2.hasNext()) {
						System.out.println(i2.next());
					}
				}
				break;
			case 3:
				if (pilha.isEmpty() == true) {
					System.out.println("\nA Pilha está vazia!");
				} else {
					pilha.pop();
					System.out.println("\nPilha: ");
					Iterator<String> i3 = pilha.iterator();
					while (i3.hasNext()) {
						System.out.println(i3.next());
					}
					System.out.println("\nUm Livro foi retirado da pilha! ");
				}
				break;
			}

		} while (comando != 0);
		System.out.println("\nPrograma Finalizado!");
		leia.close();
	}

}
