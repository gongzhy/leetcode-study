
public class Problem27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		method();
		System.out.println((System.nanoTime() - startTime) / 1000000 + " ms");
	}

	public static void method() {
		int maxNum = 0;
		int maxResult = 0;
		one: for (int a = -999; a < 1000; a++) {
			two: for (int b = -999; b < 1000; b++) {
				int n = 0;
				three: while (true) {
					int q = n * n + a * n + b;
					if (q <= 0 || !isPrime(q)) {
						if (n > maxNum) {
							maxNum = n;
							maxResult = a * b;
						}
						continue two;
					}
					n++;
				}

			}
		}
		System.out.println(maxResult);
	}

	public static boolean isPrime(long num) {
		boolean flag = true;
		for (long i = 2l; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

}
