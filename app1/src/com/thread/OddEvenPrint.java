package com.thread;
public class OddEvenPrint {
	private static class PrintNumber {

		private boolean isEvenPrinted = true;

		public void printOdd(int number) throws InterruptedException {
			synchronized (this) {

				if (!isEvenPrinted)
					wait();

				System.out.println(number);

				isEvenPrinted = false;
				notify();
			}
		}

		public void printEven(int number) throws InterruptedException {
			synchronized (this) {
				if (isEvenPrinted)
					wait();

				System.out.println(number);
				isEvenPrinted = true;
				notify();
			}
		}
	}

	private static class OddNumberGenerator implements Runnable {
		private PrintNumber q;
		private int max;

		public OddNumberGenerator(PrintNumber q, int max) {
			this.q = q;
			this.max = max;
		}

		@Override
		public void run() {
			for (int i = 1; i < max; i = i + 2) {
				try {
					q.printOdd(i);
					Thread.sleep(1000);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
			}
		}
	}

	private static class EvenNumberGenerator implements Runnable {
		private PrintNumber printer;
		private int max;

		public EvenNumberGenerator(PrintNumber printer, int max) {
			this.printer = printer;
			this.max = max;
		}

		@Override
		public void run() {
			for (int i = 2; i <= max; i = i + 2) {
				try {
					printer.printEven(i);
					Thread.sleep(2000);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		int maxNumber = 50;
		PrintNumber printer = new PrintNumber();
        System.out.println("hello");
		new Thread(new EvenNumberGenerator(printer, maxNumber)).start();
		new Thread(new OddNumberGenerator(printer, maxNumber)).start();
	}
}

