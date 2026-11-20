import java.util.ArrayList;

public class GroupProject
	{
		static ArrayList<Student> students = new ArrayList<>();
		public static void main(String[] args)
			{
				

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
						System.out.println(GradesOrSchedule.choice());
						break;

					case 3:
						Sorting.sortMenu();
						break;
				}
				
				
				
			}

	}
