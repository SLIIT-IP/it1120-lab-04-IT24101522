import java.util.Scanner;
public class IT24101522Lab4Q3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "zero";

	System.out.print("The number is: " + result);

	input.close();
 }
}
			