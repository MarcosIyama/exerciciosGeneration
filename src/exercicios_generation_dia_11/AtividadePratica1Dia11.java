package exercicios_generation_dia_11;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadePratica1Dia11 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		Integer comando;

		System.out.println("\n******************************************");
		System.out.println("\nComando --   Ação");
		System.out.println("\n   1    --   Adicionar Cliente na Fila");
		System.out.println("   2    --   Listar todos os Clientes");
		System.out.println("   3    --   Retirar Cliente da Fila");
		System.out.println("   0    --   Sair");
		System.out.println("\n******************************************");

		do {
			System.out.println("\nEntre com a ação desejada: ");
			comando = leia.nextInt();

			switch (comando) {
			case 1:
				System.out.println("\nDigite o nome: ");
				leia.skip("\\R?");
				String nome = leia.nextLine();
				fila.add(nome);
				System.out.println("\nFila: ");
				Iterator<String> i1 = fila.iterator();
				while (i1.hasNext()) {
					System.out.println(i1.next());
				}
				System.out.println("\nCliente Adicionado!");
				break;
			case 2:
				if (fila.isEmpty() == true) {
					System.out.println("\nNão há ninguém na fila!");
				} else {
					System.out.println("\nLista de Cliente na Fila: ");
					Iterator<String> i2 = fila.iterator();
					while (i2.hasNext()) {
						System.out.println(i2.next());
					}
				}
				break;
			case 3:
				if (fila.isEmpty() == true) {
					System.out.println("\nA Fila está vazia!");
				} else {
					fila.poll();
					System.out.println("\nFila: ");
					Iterator<String> i3 = fila.iterator();
					while (i3.hasNext()) {
						System.out.println(i3.next());
					}
					System.out.println("\nO Cliente foi Chamado! ");
				}
				break;
			}
		} while (comando != 0);
		System.out.println("\nPrograma Finalizado!");
		leia.close();
	}

}
