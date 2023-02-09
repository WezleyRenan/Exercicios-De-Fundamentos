package Lista1;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		double M[] = new double[8];
		int A[] = new int[8];
		int j = 0, h = 0, cont = 0;
		double media, soma = 0;
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < M.length; i++) {
			System.out.println("digite a nota do aluno");
			M[i] = input.nextDouble();
		}
		for (int i = 0; i < M.length; i++) {
			if (M[i] >= 6) {
				j++;
				soma = M[i] + soma;
			}
		}
		media = soma / j;
		System.out.println("a media é : " + media);
		for (int i = 0; i < M.length; i++) {
			cont++;
			if (M[i] >= media) {
				A[h] = cont;
				h++;
			}
		}
		System.out.println("os alunos acima da media: ");
		for (int i = 0; i < A.length; i++) {
			if (A[i] != 0) {
				System.out.print(+A[i] + " ");
			}
		}
	}
}
