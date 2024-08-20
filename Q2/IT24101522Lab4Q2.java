import java.util.Scanner;
public class IT24101522Lab4Q2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
			System.out.print("Please enter exam marks (out  of 100): ");
			int exammarks = input.nextInt();
			
			if (exammarks < 0 || exammarks > 100)
			{
				System.out.println("Invalid input for exam marks. Terminating program.");
				return;
			}
			System.out.print("Please enter lab submission marks (out of 100): ");
			int labsubmissionmarks = input.nextInt();
			

			if (labsubmissionmarks < 0 || labsubmissionmarks > 100)
			{
				System.out.println(" Invalid input for lab submission marks. Terminating program.");
				return;
			}
			System.out.print("Please enter the percentage given for the exam: ");
			int exampercentage = input.nextInt();
			
			if (exampercentage < 0 || exampercentage > 100)
			{
			
				System.out.println("Invalid input for exam percentage. Terminating  program.");
				return;
			}
			System.out.print("Please enter the percentage given for the lab submission: ");
			int labsubmissionpercentage = input.nextInt();
			
			if (labsubmissionpercentage < 0 || labsubmissionpercentage > 100)
			{
				System.out.println("invalid input for lab submission percentage: ");
				return;
			}

			if (exampercentage + labsubmissionpercentage > 100)
			{
				System.out.print("The percentage must add up to 100. Terminating program.");
				return;
			}
			
				float finallabsubmissionmarks = (labsubmissionmarks * labsubmissionpercentage)/100;
				float finalexammarks = (exammarks * exampercentage)/100;
				float finalmarks = finallabsubmissionmarks + finalexammarks;

			System.out.print("Final Exam Mark is:" + finalmarks);
 }
}			