import java.util.Scanner;
public class IT24101522Lab4Q1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		if(number > 0)
		{
			System.out.print("The number is: Positive");
		}
		else if(number < 0)
		{
			System.out.print("The number is: Negative");
		}
		else if(number == 0)
		{
			System.out.print("The number is: Zero");
		}
		input.close();
 }
}