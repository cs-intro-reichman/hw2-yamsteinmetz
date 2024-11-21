// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int n = Integer.parseInt(args[0]);
		double sum = 0.0;
		int denominator = 1;
		int sign = 1;
		for( int i = 0; i<n; i++){
			sum += (double)sign * (1.0/denominator);
			denominator +=2;
			sign *= -1;
		}
		System.out.println("pi according to Java: "+ Math.PI);
		System.out.println("pi, approximated:     " + (sum*4));
	}
}
	