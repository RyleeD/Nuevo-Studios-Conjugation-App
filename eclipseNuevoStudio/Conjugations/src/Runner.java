import java.util.HashMap;
import java.util.Scanner;


public class Runner {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the word :: ");
		String word = keyboard.next();
		
		System.out.print("Enter the subject :: ");
		String sub = keyboard.next();
		
		Conjugate test = new Conjugate(word,sub);
		
		System.out.println(test.combine());
		
	}

}
