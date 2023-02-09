package Lista1;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		int V[] = new int[10];
		int P[] = new int[10];
		int I[] = new int[10];
		int AP[] = new int[10];
		int AI[] = new int[10];
		int J = 0, K = 0, L = 0, M = 0;
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < V.length; i++) {
			System.out.println("Digite sua idade:");
			V[i] = input.nextInt();
			if (V[i] % 2 == 0) {
				P[J] = V[i];
				if (P[J] > 18) {
					AP[L] = P[J];
					L++;
				}
				J++;
			}
			if (V[i] % 2 != 0) {
				I[K] = V[i];
				if (I[K] > 18) {
					AI[M] = I[K];
					M++;
				}
				K++;
			}
		}
		System.out.println("vetor V:");
		for (int i = 0; i < V.length; i++) {
			System.out.print(V[i] + " ");
		}
		System.out.println(" ");
		System.out.println("vetor I:");
		for (int i = 0; i < V.length; i++) {
			if (I[i] != 0) {
				System.out.print(I[i] + " ");
			}
		}
		System.out.println(" ");
		System.out.println("vetor P:");
		for (int i = 0; i < V.length; i++) {
			if (P[i] != 0) {
				System.out.print(P[i] + " ");
			}
		}
		System.out.println(" ");
		System.out.println("vetor AP:");
		for (int i = 0; i < V.length; i++) {
			if (AP[i] != 0) {
				System.out.print(AP[i] + " ");
			}
		}
		System.out.println(" ");
		System.out.println("vetor AI:");
		for (int i = 0; i < V.length; i++) {
			if (AI[i] != 0) {
				System.out.print(AI[i] + " ");
			}
		}
	}
}
