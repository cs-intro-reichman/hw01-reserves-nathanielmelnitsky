public class Coins {
	public static void main(String[] args) {

		int given = Integer.parseInt(args[0]);
		int remain = given % 25;
		int quarters = given / 25;
		System.out.println("Use " + quarters + " quarters " + remain + " cents");

	}
}