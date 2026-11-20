import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FillArray
	{
		public static void fillArray(ArrayList<Student> students) throws IOException
		{
			Scanner studentFile = new Scanner(new File("StudentList.txt"));
			
			while(studentFile.hasNextLine())
				{
					students.add(new Student(studentFile.nextLine(), studentFile.nextLine(), 4.00, studentFile.nextLine(), studentFile.nextLine(), studentFile.nextLine(), studentFile.nextLine(), studentFile.nextLine(), studentFile.nextLine()));
				}
		}
	}
