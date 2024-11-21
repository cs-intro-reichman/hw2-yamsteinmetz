// Demonstrates the Collatz conjecture.
/*public class Collatz {
    public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		for (int i = 1; i <= seed; i++) {
			int pointer = i;
			int steps = 1;
			if (mode.equals("v")) {
				System.out.println(pointer);
			}
			if (pointer == 1) {
				if (mode.equals("v")) {
					System.out.println( "4 2 1");
				}
				steps = 4;
			} else {
				while (pointer != 1) {
					if (pointer % 2 == 0) {
						pointer /= 2;
					} else {
						pointer = pointer * 3 + 1;
					}
					if (mode.equals("v")) {
						System.out.println(" " + pointer);
					}
					steps++;
				}
			}
			if (mode.equals("v")) {
				System.out.println(" (" + steps + ")");
			}
		}
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		}
	}*/
	public class Collatz {
		public static void main(String args[]) {
			int seed = Integer.parseInt(args[0]);
			String mode = args[1];
	
			// לולאה עבור כל מספר מ-1 עד seed
			for (int i = 1; i <= seed; i++) {
				int pointer = i;
				int steps = 1;  // מתחילים לספור צעדים מ-1
				String sequence = "" + pointer;  // התחלנו עם המספר הראשון
	
				// חישוב סדרת קולץ
				while (pointer != 1) {
					if (pointer % 2 == 0) {
						pointer /= 2;
					} else {
						pointer = pointer * 3 + 1;
					}
					sequence += " " + pointer;  // מוסיפים את המספר החדש לרצף
					steps++;
				}
	
				// הדפסת סדרת המספרים עם מספר הצעדים בסוגריים
				if (mode.equals("v")) {
					// הדפסה מלאה של הרצף עם הצעד האחרון
					System.out.println(sequence + " (" + steps + ")");
				}
			}
	
			// הודעה על כך שכל הסדרות הגיעו ל-1
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		}
	}
	
