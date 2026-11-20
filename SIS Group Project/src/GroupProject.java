import java.util.ArrayList;
import java.io.IOException;
import java.io.File;

public class GroupProject
	{
		static ArrayList<Student> students = new ArrayList<>();
		public static void main(String[] args) throws IOException
			{
				FillArray.fillArray(students);

				switch (MainMenu.showMenu())
				{
					case 1:
						int choice = NewOrDelete.choice();
						if (choice == 1)
						{
							NewOrDelete.addStudent(students);
						}
						else if (choice == 2)
						{
							NewOrDelete.deleteStudent(students);
						}
						break;

					case 2:
						int scheduleChoice = GradesOrSchedule.choice();
						if (scheduleChoice == 1)
							{
								GradesOrSchedule.changeGrade(students);
							}
						else if (scheduleChoice == 2)
							{
								GradesOrSchedule.changeClass(students);
							}
						break;

					case 3:
						Sorting.sortMenu();
						break;
				}
				
				
				
			}

	}
