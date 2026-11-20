import java.util.Collections;

public class Sorting
	{
		public static void sortMenu()
		{
			int choice = SortStudents.choice();
			if(choice == 1)
				{
					sortName();
				}
			else if(choice == 2)
				{
					sortGPA();
				}
			else if(choice == 3)
				{
					sortPeriod();
				}
		}
			public static void sortName()
			{
				Collections.sort(GroupProject.students, new NameSorter());
			}
			public static void sortGPA()
			{
				
			}
			public static void sortPeriod()
			{
				
			}
	}
