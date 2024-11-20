// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String word = args[0];
                word = word.toUpperCase();
                int crowd = Integer.parseInt(args[1]);
                for (int i = 0; i<word.length(); i++){
                        char letter = word.charAt(i);
                        String x = (letter=='A'||letter=='E'||letter=='F'||letter=='H'||letter=='I'||letter=='L'||letter=='M'||letter=='N'||letter=='O'||letter=='R'||letter=='S'||letter=='X')?"an":"a";
                        System.out.println("Give me " + x+ " "+ letter+": "+letter+"!");
                }
                System.out.println("What does that spell?");
                for(int j = 0; j<crowd; j++){
                        System.out.println(word+"!!!");
                }

	    
                
        }
}
