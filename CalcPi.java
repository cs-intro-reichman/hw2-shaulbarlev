// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int n = Integer.parseInt(args[0]);
		double sum = 0;
		int k = 1;

		for (int i = 0; i < n; i++) {
			// System.out.println(k);
			if (i % 2 == 0) {
				sum += (double) 1/k;
			}
			else {
				sum -= (double) 1/k;
			}

			k+=2;
			// System.out.println((double) 1/k);

		}
		System.out.println("pi according to Java: "+Math.PI);
		System.out.println("pi, approximated:     "+sum*4);
	}
}
