import java.util.Scanner;
import java.util.ArrayList;

public class GradesOrSchedule {
	static Scanner userIntInput = new Scanner(System.in);
	static int choice()
	{
		System.out.println("Change Student Grades/Schedule");
		System.out.println();
		System.out.println("1) Change Grade");
		System.out.println("2) Switch Classes");
		int selection = userIntInput.nextInt();
		return selection;
	}
	
	public static void changeGrade(ArrayList<Student> students)
	{
		
	}
	
	public static void changeClass(ArrayList<Student> students)
	{
		System.out.println("Which Student?");
		
		for (int i = 1; i < students.size() + 1; i++)
			{
				System.out.println(i + ") " + students.get(i - 1).getFirstName() + " " + students.get(i - 1).getLastName());
			}
		
		int studentChoice = userIntInput.nextInt() - 1;
		
		System.out.println("Which class do you want to switch?");
		System.out.println("1) " + students.get(studentChoice).getClassOne());
		System.out.println("2) " + students.get(studentChoice).getClassTwo());
		System.out.println("3) " + students.get(studentChoice).getClassThree());
	}

}
