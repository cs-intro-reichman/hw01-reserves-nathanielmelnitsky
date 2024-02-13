/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		//recieves range values
		int min = Integer.parseInt(args[0]);
		int max = Integer.parseInt(args[1]);

		// generates random doubles for each generated number
		double multVal1 = Math.random();
		double multVal2 = Math.random();
		double multVal3 = Math.random();

		//gen 3 random numbers
		int num1 = (int)(min + (multVal1*(max - min)));
		System.out.println(num1);

		int num2 = (int)(min + (multVal2*(max - min)));
		System.out.println(num2);

		int num3 = (int)(min + (multVal3*(max - min)));
		System.out.println(num3);

		//finds lowest val and prints
		int tester = num1;

		if(num2 < tester){
			tester = num2;
		}
		if(num3 < tester){
			tester = num3;
		}
		System.out.println("The minimal generated number was " + tester);






	}
}
