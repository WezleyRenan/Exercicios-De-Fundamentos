package Recursividade;

import java.util.Scanner;

public class Fatoracao extends Calculo {

	public static void main(String[] args) {

		int N;
		Scanner input = new Scanner(System.in);

		System.out.println("digite um numero");
		N = input.nextInt();
		Calculo calcular = new Calculo();
		System.out.println(calcular.fatorial(N));

	}

}
