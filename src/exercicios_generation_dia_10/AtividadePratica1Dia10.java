package exercicios_generation_dia_10;

import java.util.ArrayList;
import java.util.Scanner;

public class AtividadePratica1Dia10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();

		for (Integer i = 0; i < 5; i++) {
			System.out.println("\nDigite o nome de uma cor: \n");
			String cor = leia.nextLine();
			cores.add(cor);
		}
		System.out.println("\nLista de cores: ");
		for (String lista : cores) {
			System.out.println(lista);
		}
		cores.sort(null);
		System.out.println("\nLista de cores em ordem alfabética: ");
		for (String lista : cores) {
			System.out.println(lista);
		}
		leia.close();
	}
}
