public class Classroom
{
	
	private Student[] section;
	private int period;
	

	/**
	 * This is the default constructor for the Classroom class
	 * This constructor creates an array of students called section
	 * Populates the array with default students
	 */
	public Classroom()
	{
		section = new Student[13];  //initializing
		
		for (int i = 0; i < section.length; i ++)
		{
			section[i] = new Student();
		}	
		
		period = 0;  //initializes period
	}


	/**
	 * This is a constructor for the Classroom class
	 * this assigns a student to a section and sets period to the parameter
	 * @param Student[] a
	 * @param int p
	 */
	public Classroom(Student[] a, int p)
	{
		section = a;
		period = p;
	}
	
	
	
	//accessors
	/**
	 * This method is an accessor to access the private variable Student[]
	 * @return section 
	 */
	public Student[] getSection()
	{
		return section;
	}
	
	/**
	 * This method is an accessor to access the private variable Student[]
	 * @param int i
	 * @return section[i] student 
	 */
	public Student getStudent(int i)
	{
		return section[i];
	}	
	
	/**
	 * This method is an accessor to access the private variable period
	 * @return period
	 */
	public int getPeriod()
	{
		return period;
	}
	
	
	//modifiers
	/**
	 * This method is an modifier to modify the private variable Student within section.
	 * Sets student in section at index i to parameter student s
	 * @param int i
	 * @param Student s
	 */
	public void setStudent(int i, Student s)
	{
		section[i] = s;
	}

	/**
	 * This method is an modifier to modify the private variable period
	 * Sets period to parameter i
	 * @param int i
	 */
	public void setPeriod(int i)
	{
		period = i;
	}


	//toString method
	/**
	 * The toString method is a string representation of the Classroom.
	 * It has all the data of the classroom including period and each student
	 * @return String period + students
	 */
	public String toString()
	{
		String s = "";
		s += "period: " + period + "\n";
		
		for (int i = 0; i < section.length; i ++)
		{
			s+= section[i].toString() + "\n";
		}
		return s;
	}	
	
	/**
	 * This method finds the oldest student within the classroom. It does this by calling
	 * the findOlder method and a selection sort.
	 * returns the oldest student in section[]
	 */
	
	public Student findOldest()
	{
		Student oldest = section[0];
		
		for (int i = 1; i < section.length; i ++)
		{
			oldest = oldest.findOlder(section[i]);

		}
		return oldest;
	}	

}