import java.util.Scanner;

public class FindFactorial {
	
	public static void main(String[]args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER WE GIVE YOU FACTORIAL VALUE!!!!");
		int num=scan.nextInt();
		
		FindFactorial obj=new FindFactorial();
		int ans=obj.FactorialMethod(num);
		
		System.out.println("Here your Answer ="+ans);
	}
	
	public int FactorialMethod(int n) {
		
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
		
	}

}
