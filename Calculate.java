public class Calculate {
	public static void main(String[] arg) {
		System.out.println("Calculate...");
		double zero = Double.valueOf(arg[0]);
		double first = Double.valueOf(arg[1]);
		double rand;
		do {
			rand = zero * Math.random();
			System.out.println(rand);
		} while (rand > first);
	}
}