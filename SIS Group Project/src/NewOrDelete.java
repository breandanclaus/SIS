import java.util.Scanner;
import java.util.ArrayList;

public class NewOrDelete {
	static Scanner userIntInput = new Scanner(System.in);
	static Scanner userStringInput = new Scanner(System.in);
	static Scanner userCharInput = new Scanner(System.in);
	static int choice()
	{
		System.out.println("Add or Delete a Student");
		System.out.println();
		System.out.println("1) Add a student");
		System.out.println("2) Delete a student");
		int selection = userIntInput.nextInt();
		return selection;
	}
	
	public static void addStudent()
	{
		System.out.println("Give first name");
		String firstName = userStringInput.nextLine();
		
		System.out.println("Give last name");
		String lastName = userStringInput.nextLine();
		
		System.out.println("First class?");
		String classOne = userStringInput.nextLine();
		
		System.out.println("Grade in that class?");
		char gradeOne = userCharInput.next().charAt(0);
		
		System.out.println("Second class?");
		String classTwo = userStringInput.nextLine();
		
		System.out.println("Grade in that class?");
		char gradeTwo = userCharInput.next().charAt(0);
		
		System.out.println("Third class?");
		String classThree = userStringInput.nextLine();
		
		System.out.println("Grade in that class?");
		char gradeThree = userCharInput.next().charAt(0);
		
		GroupProject.students.add(new Student(firstName, lastName, GPA.calculateGpa(), classOne, classTwo, classThree, gradeOne, gradeTwo, gradeThree))
	}

}
