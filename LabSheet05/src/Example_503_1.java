import javax.swing.*;
public class Example_503_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int countspace = 0 ;
		String sentence = JOptionPane.showInputDialog("Input a sentence: ");
		
		while(!sentence.endsWith(".")) {
			sentence = JOptionPane.showInputDialog("Input a sentence, again: ");
		}
		for(int i = 0; i<=sentence.length()-1; i++) {
			if(sentence.charAt(i)==' ') {
				countspace ++;
			}
		}
		JOptionPane.showMessageDialog(null,"This sentence has "+countspace+" spacebar." + "\nThis sentence has "+(countspace+1)+" word.");
		
	}

}
