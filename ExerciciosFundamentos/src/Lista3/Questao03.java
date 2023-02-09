package Lista3;

import java.util.Random;
import java.util.Scanner;

public class Questao03 {
	public static int calculo(int x, int y, int z) {
		if (z == 0) {
			x = x + y;
		}
		if (z == 1) {
			x = x - y;
		}
		if (z == 2) {
			x = x * y;
		}
		if (z == 3) {
			x = x / y;
		}
		return x;
	}
	public static void main(String[] args) {
		int matriz[][] = new int[4][4];
		int pri = 0, seg = 0, type = 0;
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		for (int l = 0; l < 4; l++) {
			System.out.println(" ");
			System.out.println("linha " + l + " :");

			for (int c = 0; c < 4; c++) {
				if (c == 0) {
					pri = rand.nextInt(9);
					matriz[l][c] = pri;
				}
				if (c == 1) {
					seg = rand.nextInt(9);
					matriz[l][c] = seg;
				}
				if (c == 2) {
					System.out.println("digite o tipo de operação: ");
					System.out.println("0=adiçao  1=subtração  2=multiplicação 3=divisão");
					type = input.nextInt();
					matriz[l][c] = type;
				}
				if (c == 3) {
					matriz[l][c] = calculo(pri, seg, type);
				}
			}
		}
		for (int l = 0; l < 4; l++) {
			System.out.println("linha " + l + " :");

			for (int c = 0; c < 4; c++) {
				System.out.print(matriz[l][c] + " ");
			}
			System.out.println(" ");
		}
	}
}
