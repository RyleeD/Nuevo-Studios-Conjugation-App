import java.util.Scanner;

public class ConjugationsMain {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		ConjugateFuture test = new ConjugateFuture();
		
		for(int i = 0; i < 50; i++){
			
			System.out.print("Enter an infinitive verb :: ");
			String inf = keyboard.next();
			
			test.setInfinitive(inf);
			test.conjugateVerb();
			System.out.println("");
		}
		
		keyboard.close();
	}

}
