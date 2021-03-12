package controller;


public class ThreadVetor extends Thread {
	private int m, vet[];

	public ThreadVetor(int m, int[] vet) {
		this.m = m;
		this.vet = vet;
	}

	@Override
	public void run() {
		calc();
	}

	private void calc() {
		int a;
		double tempoInicial = System.nanoTime();
		double tempoInicial2 = System.nanoTime();
		if (this.m % 2 == 0) {
			for (int i = 0; i < this.vet.length; i++) {
				a = vet[i];
			}
		} else {
			for (int b : vet) {
				a = b;
			}
		}
		double time = (System.nanoTime() - tempoInicial) / (Math.pow(10, 9));
		System.out.println("Tempo 'for': " + time + " segundos.");
		double time2 = (System.nanoTime() - tempoInicial2) / (Math.pow(10, 9));
		System.out.println("Tempo 'foreach': " + time2 + " segundos.");
	}
}
