package exercicios_generation_dia_10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AtividadePratica4Dia10 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Set<Integer> numerosFixos = new HashSet<Integer>();

		numerosFixos.add(2);
		numerosFixos.add(5);
		numerosFixos.add(1);
		numerosFixos.add(3);
		numerosFixos.add(4);
		numerosFixos.add(9);
		numerosFixos.add(7);
		numerosFixos.add(8);
		numerosFixos.add(10);
		numerosFixos.add(6);

		System.out.println("\nDigite o número que você deseja encontrar: \n");
		Integer numero = leia.nextInt();

		if (numerosFixos.contains(numero) == true) {
			System.out.print("\nO número " + numero + " foi encontrado!");
		} else {
			System.out.print("\nO número " + numero + " não foi encontrado!");
		}
		leia.close();
	}

}
