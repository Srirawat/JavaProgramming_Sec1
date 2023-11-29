import java.util.Scanner;
public class Lab401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input value of X : ");
		int X = scan.nextInt();
		System.out.print("Input value of Y : ");
		int Y = scan.nextInt();
		
		System.out.print(" ");
		
		while(Y<X) {
			System.out.print("Input value of Y, again : ");
			Y = scan.nextInt();
		}
		
		for(int i = X+1;i<=Y;i++) {
			
			System.out.print("\n"+ X + " + " + i +" = "+ (X+=i));
		}

	}

}
