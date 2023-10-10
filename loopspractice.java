import java.util.Scanner;

public class loopspractice {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a positive number");
		
		int i = input.nextInt();
		
		int x = 0;
		
		while(x < i ) {
//			
			
			x++;
			
			
			System.out.printf("%d, ", x);
			
		}
		
		input.close();
	}

}
