// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
		int n = Integer.parseInt(args[0]);
		int countGreater = 0;
		int countLess = 0;
		for (int i = 0; i<n; i++){
			double random = Math.random();
			if (random<0.5){
				countLess++;
			}
			else {
				countGreater++;
			}
		}
		System.out.println(">0.5: "+ countGreater+ " times");
		System.out.println("<=0.5: "+ countLess+ " times");
	
	}
}
