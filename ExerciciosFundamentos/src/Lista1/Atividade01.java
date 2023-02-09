package Lista1;

import java.util.Random;
import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		int num, cont = 0;
		int V[] = new int[30];
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < V.length; i++) {
			V[i] = rand.nextInt(50);
			System.out.print(V[i] + " ");
		}
		System.out.println(" ");
		System.out.println("escolha um numero entre 1 e 50");
		num = input.nextInt();
		for (int i = 0; i < V.length; i++) {
			if (num == V[i]) {
				cont++;
			}
		}
		System.out.println("foram repetidos " + cont + " de vezes o numero " + num);
	}
}