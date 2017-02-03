/**
 * @author Ami Gianchandani
 * date: January 11, 2017
 * Class project 
 * This program has a class of students and a classroom to represent all the students in 
 * a given class along with their ages and grade level
 * The student class creates a default student and allows the Runner to create a specific
 * student
 */


public class Student
{
	//class fields
	private int age;
	private int grade;
	private String name;
	
	private static int numStudents = 0;
	
	
	/**
	 * This method creates a default type Student with a default age of 10, grade of 10, 
	 * and name "Bob". This is the default constructor of the class.
	 */
	public Student()
	{
		this(10, 10, "Bob");
	
	}
	
	//overloaded constructor
	/**
	 * This method is a constructor for the Student Class that takes in two parameters for
	 * age and grade. The default name is Jack. Increments numStudents by 1
	 * @param int age a
	 * @param int grade g
	 */
	public Student (int a, int g)
	{
		this.age = a;
		this.grade = g;
		name = "Jack";
		numStudents++;
	}
	
	
	//overloaded constructor
	/**
	 * This method is a constructor for the Student Class that takes in three parameters
	 * for age, grade, and name. Increments numStudents by 1
	 * @param int age a
	 * @param int grade g
	 * @param String name n
	 */
	public Student(int a, int g, String n)
	{
		age = a;
		grade = g;
		name = n;
		numStudents++;
	}
	
	
	//accessors
	/**
	 * This method is an accessor to access the private variable age
	 * @return age 
	 */
	public int getAge()
	{
		return age;
	}
	
	/**
	 * This method is an accessor to access the private variable grade
	 * @return grade 
	 */
	public int getGrade()
	{
		return grade;
	}
	
	
	/**
	 * This method is an accessor to access the private variable name
	 * @return name 
	 */
	public String getName()
	{
		return name;
	}	
	
	/**
	 * This method is an accessor to access the private variable numStudents
	 * @return numStudents 
	 */
	public static int getNumStudents()
	{
		return numStudents;
	}
	
	
	//modifiers
	
	/**
	 * This method is an modifier to modify the private variable age.
	 * Sets age to parameter num
	 * @param int num 
	 */
	public void setAge (int num)
	{
		age = num;
	}
	
	
	/**
	 * This method is an modifier to modify the private variable grade
	 * Sets grade to parameter num
	 * @param int num	
	 */
	public void setGrade (int num)
	{
		grade = num;
	}
	
	
	/**
	 * This method is an modifier to modify the private variable name
	 * Sets grade to parameter n
	 * @param String n	
	 */
	public void setName (String n)
	{
		name = n;
	}
	
	
	
	//toString method to represent data as a string
	/**
	 * The toString method is a string representation of the Student.
	 * It has all the data of the student
	 * @return String Student
	 */
	public String toString()
	{
		return name + "(" + age + " years old, " + grade + "th grade)";
	}

	
	//member method
	
	/**
	 * This static method finds the older of two students using an if clause
	 * @param Student s1
	 * @param Student s2
	 * @return the older student
	 */
	public static String findOlder(Student s1, Student s2)
	{
		if (s1.age > s2.age)
		{
			return s1.name;
		}
		
		else 
		{
			return s2.name;
		}
		
	}
	
	
	//overloaded, nonstatic method
	
	/**
	 * This non-static method finds the older of two students using an if clause
	 * @param Student s1
	 * @return the older student
	 */
	public Student findOlder(Student s1)
	{
		if (s1.age > this.age)
		{
			return s1;
		}
		else
		{
			return this;
		}
	}
	
}
	