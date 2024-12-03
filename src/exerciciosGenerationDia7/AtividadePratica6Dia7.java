package exerciciosGenerationDia7;

import java.util.Scanner;

public class AtividadePratica6Dia7 {

	public static void main(String[] args) {

		// Variáveis
		String nome;
		int cargo;
		float salario;
		float novoSalario;

		Scanner leia = new Scanner(System.in);

		// Entrada de Dados
		System.out.println("Insira o seu nome: ");
		nome = leia.nextLine();
		System.out.println("\n\nCódigo -- Cargo -- Reajuste");
		System.out.println("\n   1  -- Gerente -- 10%");
		System.out.println("   2  -- Vendedor -- 7%");
		System.out.println("   3  -- Supervisor -- 9%");
		System.out.println("   4  -- Motorista -- 6%");
		System.out.println("   5  -- Estoquista -- 5%");
		System.out.println("   6  -- Técnico de TI -- 8%");
		System.out.println("Insira o código de seu cargo: ");
		cargo = leia.nextInt();
		System.out.println("\nInsira o valor de seu salário: ");
		salario = leia.nextFloat();
		
		// Processamento
		switch (cargo) {
		case 1:
			novoSalario = salario + (salario * 0.1f);
			System.out.printf("\n- Colaborador: %s\n- Cargo: Gerente\n- Salário: R$ %.2f", nome, novoSalario);
			break;
		case 2:
			novoSalario = salario + (salario * 0.07f);
			System.out.printf("\n- Colaborador: %s\n- Cargo: Vendedor\n- Salário: R$ %.2f", nome, novoSalario);
			break;
		case 3:
			novoSalario = salario + (salario * 0.09f);
			System.out.printf("\n- Colaborador: %s\n- Cargo: Supervisor\n- Salário: R$ %.2f", nome, novoSalario);
			break;
		case 4:
			novoSalario = salario + (salario * 0.06f);
			System.out.printf("\n- Colaborador: %s\n- Cargo: Motorista\n- Salário: R$ %.2f", nome, novoSalario);
			break;
		case 5:
			novoSalario = salario + (salario * 0.05f);
			System.out.printf("\n- Colaborador: %s\n- Cargo: Estoquista\n- Salário: R$ %.2f", nome, novoSalario);
			break;
		case 6:
			novoSalario = salario + (salario * 0.08f);
			System.out.printf("\n- Colaborador: %s\n- Cargo: Técnico de TI\n- Salário: R$ %.2f", nome, novoSalario);
			break;
		default:
			System.out.println("\nCargo inválido.");
		}
		leia.close();
	}

}
