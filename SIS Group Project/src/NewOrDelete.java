import java.util.ArrayList;
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
	
	public static void addStudent(ArrayList<Student> students)
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
		
		GroupProject.students.add(new Student(firstName, lastName, GPA.calculateGpa(), classOne, classTwo, classThree, gradeOne, gradeTwo, gradeThree));
	}
	
	public static void deleteStudent(ArrayList<Student> students)
	{
		
	}

	private static double calculateGPA(String g1, String g2, String g3)
	{
		double total = gradeToPoints(g1) + gradeToPoints(g2) + gradeToPoints(g3);
		return Math.round((total / 3.0) * 100.0) / 100.0;
	}

	private static double gradeToPoints(String grade)
	{
		switch (grade)
		{
			case "A+":
			case "A":  return 4.0;
			case "A-": return 3.7;
			case "B+": return 3.3;
			case "B":  return 3.0;
			case "B-": return 2.7;
			case "C+": return 2.3;
			case "C":  return 2.0;
			case "C-": return 1.7;
			case "D+": return 1.3;
			case "D":  return 1.0;
			case "D-": return 0.7;
			default:   return 0.0;
		}
	}
}