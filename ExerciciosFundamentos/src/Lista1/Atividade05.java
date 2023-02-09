package Lista1;

import java.util.Random;

public class Atividade05 { //conta quantas vezes determinado numero de 0 a 20 se repetem em 1000 tentativas

	public static void main(String[] args) {
		int V[] = new int[1000]; 
		int A = 0, B = 0, C = 0, D = 0, E = 0, F = 0, G = 0, H = 0, J = 0, K = 0, L = 0, M = 0, N = 0, O = 0, P = 0,
				Q = 0, R = 0, S = 0, T = 0, U = 0, W = 0;
		Random rand = new Random();
		for (int i = 0; i < V.length; i++) {
			V[i] = rand.nextInt(21);
			while (V[i] == 21) {
				V[i] = rand.nextInt(21);
			}
			switch (V[i]) {
			case 0:
				A++;
				break;
			case 1:
				B++;
				break;
			case 2:
				C++;
				break;
			case 3:
				D++;
				break;
			case 4:
				E++;
				break;
			case 5:
				F++;
				break;
			case 6:
				G++;
				break;
			case 7:
				H++;
				break;
			case 8:
				J++;
				break;
			case 9:
				K++;
				break;
			case 10:
				L++;
				break;
			case 11:
				M++;
				break;
			case 12:
				N++;
				break;
			case 13:
				O++;
				break;
			case 14:
				P++;
				break;
			case 15:
				Q++;
				break;
			case 16:
				R++;
				break;
			case 17:
				S++;
				break;
			case 18:
				T++;
				break;
			case 19:
				U++;
				break;
			case 20:
				W++;
				break;

			}
		}
		System.out.println("o numero 0 foi repetido " + A + " vezes");
		System.out.println("o numero 1 foi repetido " + B + " vezes");
		System.out.println("o numero 2 foi repetido " + C + " vezes");
		System.out.println("o numero 3 foi repetido " + D + " vezes");
		System.out.println("o numero 4 foi repetido " + E + " vezes");
		System.out.println("o numero 5 foi repetido " + F + " vezes");
		System.out.println("o numero 6 foi repetido " + G + " vezes");
		System.out.println("o numero 7 foi repetido " + H + " vezes");
		System.out.println("o numero 8 foi repetido " + J + " vezes");
		System.out.println("o numero 9 foi repetido " + K + " vezes");
		System.out.println("o numero 10 foi repetido " + L + " vezes");
		System.out.println("o numero 11 foi repetido " + M + " vezes");
		System.out.println("o numero 12 foi repetido " + N + " vezes");
		System.out.println("o numero 13 foi repetido " + O + " vezes");
		System.out.println("o numero 14 foi repetido " + P + " vezes");
		System.out.println("o numero 15 foi repetido " + Q + " vezes");
		System.out.println("o numero 16 foi repetido " + R + " vezes");
		System.out.println("o numero 17 foi repetido " + S + " vezes");
		System.out.println("o numero 18 foi repetido " + T + " vezes");
		System.out.println("o numero 19 foi repetido " + U + " vezes");
		System.out.println("o numero 20 foi repetido " + W + " vezes");
	}
}