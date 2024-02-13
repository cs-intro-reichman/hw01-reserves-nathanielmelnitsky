public class Triangle {
	 public static void main(String[] args){
	 	//declaring intputs
	 	int a = Integer.parseInt(args[0]);
	 	int b = Integer.parseInt(args[1]);
	 	int c = Integer.parseInt(args[2]);

	 	//checks if conditions are met for triangle 
	 	if(!(a + b < c) && !(a + c < b) && !(c + b < a)){
	 		System.out.println(a + ", " + b + ", " + c + ": true");
	 	}
	 	//if not prints false
	 	else{
	 		System.out.println(a + ", " + b + ", " + c + ": false");
	 	}

	 }
}

