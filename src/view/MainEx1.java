package view;

import java.util.Random;
import controller.ThreadVetor;

public class MainEx1 {

	public static void main(String[] args) {
		int vet[] = new int[1000];

		Random generator = new Random();
		for (int i = 0; i < 1000; i++) {
			vet[i] = generator.nextInt(99) + 1;
		}

		for (int i = 1; i < 2; i++) {
			Thread thread = new ThreadVetor(i, vet);
			thread.start();
		}

	}
}
