
import java.util.*;
public class Example_503 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		//1.input data from console(keyboard)
		System.out.print("Input a sentence : ");
		String sentence = scan.nextLine();
		int countspace = 0 ;
		
		while(!sentence.endsWith(".")) {
			System.out.print("Input a sentence, again : ");
			sentence = scan.nextLine();
		}
		for(int i = 0; i<=sentence.length()-1; i++) {
			if(sentence.charAt(i)==' ') {
				countspace ++;
			}
		}
		System.out.print("\nThis sentence has "+countspace+" spacebar.");
		System.out.print("\nThis sentence has "+(countspace+1)+" word.");

	}

}
