
public class Student
	{
		private String firstName;
		private String lastName;
		private double gpa;
		private String classOne;
		private String classTwo;
		private String classThree;
		private String gradeOne;
		private String gradeTwo;
		private String gradeThree;
		
		public Student (String f, String l, double g, String cOne, String grOne, String cTwo, String grTwo, String cThree, String grThree)
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

		public String getClassOne()
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

		public String getGradeOne()
			{
					return gradeOne;
			}

		public void setGradeOne(String gradeOne)
			{
					this.gradeOne = gradeOne;
			}

		public String getGradeTwo()
			{
					return gradeTwo;
			}

		public void setGradeTwo(String gradeTwo)
			{
					this.gradeTwo = gradeTwo;
			}

		public String getGradeThree()
			{
					return gradeThree;
			}

		public void setGradeThree(String gradeThree)
			{
					this.gradeThree = gradeThree;
			}
	}
