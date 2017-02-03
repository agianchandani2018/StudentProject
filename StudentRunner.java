public class StudentRunner
{
	public static void main (String[] args)
	{
	
	Student s1 = new Student();
	Student s2 = new Student(15, 9);
	Student s3 = new Student(17, 11, "Neil");
	Student s4 = new Student();
	
	Classroom apcs = new Classroom(); //apcs is instance of classroom
	apcs.setStudent(5, s4);
	
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	
	System.out.println(s3.getAge());
	System.out.println(s3.getGrade());
	System.out.println(s3.getName());

	s2.setAge(16);
	s4.setAge(18);
	s4.setName("Dylan");
	s4.setGrade(12);
	
	System.out.println(Student.findOlder(s1, s4));
	System.out.println(s1.findOlder(s4));
	
	System.out.println(apcs);
	System.out.println(apcs.findOldest());
	
	}
}	