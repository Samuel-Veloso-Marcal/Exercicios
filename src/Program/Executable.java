package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.CNPJ;
import Entities.CP;
import Entities.CPF;

public class Executable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão registradas? ");
		int n = sc.nextInt();
		System.out.println();
		List<CP> Pessoas = new ArrayList<>();
		for (int i = 1; i<=n; i ++) {
			System.out.printf("%dª Pessoa:%nPessoa física ou jurídica (f/j)? ", i);
			char gh = sc.next().charAt(0);
			if (gh != 'f' && gh != 'j') {
			System.out.print("(f/j): ");
			gh = sc.next().charAt(0);
			}
			System.out.print("Nome: ");
			sc.next();
			String name = sc.nextLine();
			System.out.print("Renda anual: ");
			double renda = sc.nextDouble();
			if (gh == 'f') {
				System.out.print("Gastos em saude: ");
				double saude = sc.nextDouble();
				Pessoas.add(new CPF(name, renda, saude));
			}
			if (gh == 'j') {
				System.out.print("Numero de funcionarios: ");
				double funcionarios = sc.nextDouble();
				Pessoas.add(new CNPJ(name, renda, (int) funcionarios));
			}
			}
		double impostos = 0;
		for (CP x : Pessoas) {
			impostos += x.imposto();
			System.out.println(x.getName() + x);
		}
		System.out.printf("%nImposto total: R$%.2f", impostos);
		sc.close();
		}
	}


