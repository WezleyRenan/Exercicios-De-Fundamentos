package Lista2;

import java.util.Scanner;

public class AtividadeRadar1 {

	public static void main(String[] args) {
		int cont = 1, igual = 0, multapequena = 0, multaacima = 0, limite = 0, soma, maior = 0, h = 0;
		double maxima = 80;
		Scanner input = new Scanner(System.in);
		int V[] = new int[10];
		for (int i = 0; i < V.length; i++) {
			System.out.println("digite a velocidade ");
			V[i] = input.nextInt();
			while (V[i] % 10 != 0 || V[i] < 40 || V[i] > 150) {
				System.out.println("velocidade invalida!!! por favor digite uma divisivel por 10 e entre 40km/h e 150km/h");
				V[i] = input.nextInt();
			}
			if (maior < V[i]) {
				maior = V[i];
			}
		}
		for (int i = 0; i < V.length; i++) {
			if (cont != V.length - 1) {
			}
			if (cont < V.length) {
				if (V[i] == V[cont]) {
					igual++;
				}
			}
			cont++;
		}
		maxima = maxima * 1.2;
		for (int i = 0; i < V.length; i++) {
			if ((V[i] >= 80) && (V[i] <= maxima)) {
				multapequena = multapequena + 100;
				limite++;
			}
			if (V[i] > maxima) {
				multaacima = multaacima + 300;
			}
		}
		for (int i = 0; i < V.length; i++) {
			h++;
			if (V[i] == maior) {
				System.out.println("A maior velocidade foi do " + h + " Radar");
			}
		}
		soma = multaacima + multapequena;
		System.out.println("numero de velocidades até 20% da velocidade máxima: " + limite);
		System.out.println("total de multas(R$): " + soma);
		System.out.println("número de velocidades iguais consecutivas: " + igual + " vez(es)");
	}
}