import java.util.Scanner;

public class ConjugateRunner {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a present tense verb :: ");
		String word = keyboard.next();
		Conjugate test = new Conjugate(word);
		test.setString(word);
		System.out.println(test.toString());
	}
}
