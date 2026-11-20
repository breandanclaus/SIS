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
		
		Student changingStudent = students.get(studentChoice);
		
		System.out.println("Which class do you want to switch?");
		System.out.println("1) " + changingStudent.getClassOne());
		System.out.println("2) " + changingStudent.getClassTwo());
		System.out.println("3) " + changingStudent.getClassThree());
		
		int classChoice = userIntInput.nextInt();
		
		switch (classChoice)
		{
			case 1:
				System.out.print("You are replacing " + changingStudent.getClassOne() + ".");
				System.out.println("What would you like to replace it with?");
				System.out.println("1) " + changingStudent.getClassTwo());
				System.out.println("2) " + changingStudent.getClassThree());
				
				int switchChoice = userIntInput.nextInt();
				
				String temp = changingStudent.getClassOne();
				if (switchChoice == 1)
					{
						changingStudent.setClassOne(changingStudent.getClassTwo());
						changingStudent.setClassTwo(temp);
						System.out.println(temp + "is now "  + changingStudent.getClassOne());
					}
				else if (switchChoice == 2)
					{
						changingStudent.setClassOne(changingStudent.getClassThree());
						changingStudent.setClassThree(temp);
						System.out.println(temp + "is now " + changingStudent.getClassOne());
					}
				break;
				
			case 2:
				System.out.print("You are replacing " + changingStudent.getClassTwo() + ".");
				System.out.println("What would you like to replace it with?");
				System.out.println("1) " + changingStudent.getClassOne());
				System.out.println("2) " + changingStudent.getClassThree());
				
				switchChoice = userIntInput.nextInt();
				
				temp = changingStudent.getClassTwo();
				if (switchChoice == 1)
					{
						changingStudent.setClassTwo(changingStudent.getClassOne());
						changingStudent.setClassOne(temp);
						System.out.println(temp + "is now " + changingStudent.getClassTwo());
					}
				else if (switchChoice == 2)
					{
						changingStudent.setClassTwo(changingStudent.getClassThree());
						changingStudent.setClassThree(temp);
						System.out.println(temp + "is now " + changingStudent.getClassTwo());
					}
				break;
				
			case 3: 
				System.out.print("You are replacing " + changingStudent.getClassThree() + ".");
				System.out.println("What would you like to replace it with?");
				System.out.println("1) " + changingStudent.getClassOne());
				System.out.println("2) " + changingStudent.getClassTwo());
				
				switchChoice = userIntInput.nextInt();
				
				temp = changingStudent.getClassThree();
				if (switchChoice == 1)
					{
						changingStudent.setClassThree(changingStudent.getClassOne());
						changingStudent.setClassOne(temp);
						System.out.println(temp + "is now " + changingStudent.getClassThree());
					}
				else if (switchChoice == 2)
					{
						changingStudent.setClassThree(changingStudent.getClassTwo());
						changingStudent.setClassTwo(temp);
						System.out.println(temp + "is now " + changingStudent.getClassThree());
					}
				break;
		}
	}

}
