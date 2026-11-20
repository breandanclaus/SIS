
public class Student
	{
		private String firstName;
		private String lastName;
		private double gpa;
		private static String classOne;
		private String classTwo;
		private String classThree;
		private char gradeOne;
		private char gradeTwo;
		private char gradeThree;
		
		public Student (String f, String l, double g, String cOne, String cTwo, String cThree, char grOne, char grTwo, char grThree)
		{
			setFirstName(f);
			setLastName(l);
			setGpa(g);
			setClassOne(cOne);
			setClassTwo(cTwo);
			setClassThree(cThree);
			setGradeOne(grOne);
			setGradeTwo(grTwo);
			setGradeThree(grThree);
		}

		public String getFirstName()
			{
					return firstName;
			}

		public void setFirstName(String firstName)
			{
					this.firstName = firstName;
			}

		public String getLastName()
			{
					return lastName;
			}

		public void setLastName(String lastName)
			{
					this.lastName = lastName;
			}

		public double getGpa()
			{
					return gpa;
			}

		public void setGpa(double gpa)
			{
					this.gpa = gpa;
			}

		public static String getClassOne()
			{
					return classOne;
			}

		public void setClassOne(String classOne)
			{
					this.classOne = classOne;
			}

		public String getClassTwo()
			{
					return classTwo;
			}

		public void setClassTwo(String classTwo)
			{
					this.classTwo = classTwo;
			}

		public String getClassThree()
			{
					return classThree;
			}

		public void setClassThree(String classThree)
			{
					this.classThree = classThree;
			}

		public char getGradeOne()
			{
					return gradeOne;
			}

		public void setGradeOne(char gradeOne)
			{
					this.gradeOne = gradeOne;
			}

		public char getGradeTwo()
			{
					return gradeTwo;
			}

		public void setGradeTwo(char gradeTwo)
			{
					this.gradeTwo = gradeTwo;
			}

		public char getGradeThree()
			{
					return gradeThree;
			}

		public void setGradeThree(char gradeThree)
			{
					this.gradeThree = gradeThree;
			}
	}
