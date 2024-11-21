// Demonstrates the Collatz conjecture.
public class Collatz {
    public static void main(String args[]) {
        int N = Integer.parseInt(args[0]); 
        String mode = args[1];

        if (mode.equals("v")) {
            for (int i = 1; i <= N; i++) {
                int num = i;
                int count = 1;
                System.out.print(num + " ");
                while (num != 1) {
                    if (num % 2 == 0) {
                        num = num / 2;
                    } else {
                        num = num * 3 + 1;
                    }
                    count++;
                    System.out.print(num + " ");
                }
                System.out.println("(" + count + ")");
                System.out.println();  
            }
            System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
        } 
        else if (mode.equals("c")) {
            boolean reached1 = true;  
            for (int i = 1; i <= N; i++) {
                int num = i;
                while (num != 1) {
                    if (num % 2 == 0) {
                        num = num / 2;
                    } else {
                        num = num * 3 + 1;
                    }
                }
                if (num != 1) {
                    reached1 = false;
                    break;  
                }
            }
            if (reached1) {
                System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
            } else {
                System.out.println("Some sequences did not reach 1.");
            }
        }
    }
}
