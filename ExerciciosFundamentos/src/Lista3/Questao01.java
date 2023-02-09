package Lista3;

import java.util.Scanner;

public class Questao01 {
	public static String metodA() {
		int peso;
		String mensagem;
		Scanner input = new Scanner(System.in);
		System.out.println("digite o peso");
		peso = input.nextInt();
		if (peso >= 995 && peso <= 1005) {
			mensagem = "peça não defeituosa";
		} else {
			mensagem = "peça defeitosa";
		}
		return mensagem;
	}
	public static String metodB() {
		int peso;
		String mensagem;
		Scanner input = new Scanner(System.in);
		System.out.println("digite o peso");
		peso = input.nextInt();
		if (peso >= 1990 && peso <= 2010) {
			mensagem = "peça não defeituosa";
		} else {
			mensagem = "peça defeitosas";
		}
		return mensagem;
	}
	public static void main(String[] args) {
		String validacao;
		Scanner input = new Scanner(System.in);
		System.out.println("digite um dos metodos A ou B e Z para finalizar:");
		char type = input.next().charAt(0);
		while (type != 'z' || type != 'Z') {
			if (type == 'z' || type == 'Z') {
				break;
			}
			if (type == 'a' || type == 'A') {
				validacao = metodA();
				System.out.println(validacao);
			}
			if (type == 'b' || type == 'B') {
				validacao = metodB();
				System.out.println(validacao);
			}
			System.out.println("digite um dos metodos A ou B e Z para finalizar:");
			type = input.next().charAt(0);
		}
	}
}