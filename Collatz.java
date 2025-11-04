// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
		String flag = args[1];
		
		for (int i = 1; i <= n; i++) { // Going across one n
			int k = i;
			int steps = 1;
			while (k > 1 || steps < 2) { // exploring k until converge to 1
				if (flag.equals("v")) System.out.print(k);
				if (k>=1) System.out.print(" ");

				if ( k % 2 == 0) {
					k /= 2;
				}
				else {
					k *= 3; k++;
				}
				steps++;
			}

			if (flag.equals("v")) System.out.println(k + " (" + steps + ")");
			// System.out.println("");
		}

		if (flag.equals("v")) System.out.println("");
		System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
	}
}
