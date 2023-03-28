package Fibonacci;

import java.util.Scanner;

public class Principal extends Calculo{

	public static void main(String[] args) {
		int N;
		
		Calculo calculo = new Calculo();
		Scanner input = new Scanner (System.in);
		System.out.println("digite um numero");
		N = input.nextInt();
		for (int i = 0; i < N; i++) {
			System.out.println(calculo.Fibon(i));
			
		}
		
	}

}
