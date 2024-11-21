
	public class Collatz {
		public static void main(String args[]) {
			int N = Integer.parseInt(args[0]);
			String mode = args[1];
	
			for (int i = 1; i <= N; i++) {
				int num = i;
				int steps = 1;
	
				if (num == 1) {
					System.out.print(1 + " ");
					num =4;
					steps++;
				}
	
	
				if (mode.equals("v")) {
					System.out.print(num + " "); 
				}
				
			
				while (num != 1) {
					
					if (num % 2 == 0) {
						num = num / 2;
					} else {
						num = num * 3 + 1;
					}
	
					steps++;
	
					if (mode.equals("v")) {
						System.out.print(num + " ");
					}
				}
	
				if (mode.equals("v")) {
					System.out.print("(" + steps + ")");
				}
	
	
				if (mode.equals("v")) {
					System.out.println();
				}
			}
	
			System.out.println("Every one of the first " + args[0] + " hailstone sequences reached 1.");
		}
	}
	
