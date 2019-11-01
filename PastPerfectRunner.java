import java.util.*;
public class PastPerfectRunner {
	public static void main ( String[] args )
	{
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Enter a word to conjugate :: ");
	 String newword = keyboard.next();
	 PastPerfect test3 = new PastPerfect(newword);
	 System.out.print(test3);
	while (keyboard.next() != ""){
	 System.out.print("Enter a word to conjugate :: ");
	 String newword1 = keyboard.next();
	 PastPerfect test2 = new PastPerfect(newword1);
	 System.out.print(test2);
	 if (keyboard.next() == ""){
		keyboard.close();
	}
}
	
}
}