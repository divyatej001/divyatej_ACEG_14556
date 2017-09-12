import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(students==null)
			throw IllegalArgumentException;
		else 
		{
			for(int i=0;i<students.length;i++)
			{
				this.students[i].id=students.id;
				this.students[i].fullName=students.fullName;
				this.students[i].BirthDate=students.BirthDate;
				this.students[i].avgMark=students.avgMark;
			}
		}
		catch (IllegalArgumentException iae)
		{
		
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		try{
		if(students==null||index<0||index>=students.length)
			throw new IllegalArgumentException();
		return null;
		}
		
		catch (IllegalArgumentException iae)
		{
		
		}
		
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		try{
			if(students==null||index<0||index>=students.length)
				throw new IllegalArgumentException();
			else
			{
				this.students[index].id=students.id;
				this.students[index].fullName=students.fullName;
				this.students[index].BirthDate=students.BirthDate;
				this.students[index].avgMark=students.avgMark;
			}
			}
			return null;
			}
			
			catch (IllegalArgumentException iae)
			{
			
			}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		try{
			if(students==null)
				throw new IllegalArgumentException();
			else
			{
				int l=students.length;
				Student s=students[0],e;
				
				for(i=1;i<=l;i++)
				{
					e.id=students[i];
					e.fullName=students[i].fullName;
					e.BirthDate=.students[i].BirthDate;
					e.avgMark=students[i].avgMark;
					students[i].id=s.id;
					students[i].fullName=s.fullName;
					students[i].BirthDate=s.BirthDate;
					students[i].avgMark=s.avgMark;
					s.id=e.id;
					s.fullName=e.fullName;
					s.BirthDate=e.BirthDate;
					s.avgMark=e.avgMark;
				}
			}
			}
			return null;
		
			
			catch (IllegalArgumentException iae)
			{
			
			}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		try{
		int l=students.length;
		if(students==null||index<0||index>=students.length)
			throw new IllegalArgumentException();
		else
		{
		for(int i=index;i<l;i++)
		{
			students[i].id=students[i+1].id;
			students[i].fullName=students[i+1].fullName;
			students[i].BirthDate=students[i+1].BirthDate;
			students[i].avg.Mark=students[i+1].avgMark;
		}
		students[l-1]=null;
		}
		}
		catch(IllegalArgumentException iae)
		{
			
		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		try{
			if(indexOfStudent==0)
				throw new IllegalArgumentException();
			else
			{
				LocalDate n= new LocalDate.now();
				Years age = Years.yearsBetween(students[indexOfStudent].getBirthDate,n);
				return age;		
			}
		}
		catch IllegalArgumentException iae
		{
		}
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		Students[] s = new Students(50);
		int i,h=0,j=-1;
		for(i=0;i<students.length;i++)
			if(students[i].avgMark>h)
				h=students[i].avgMark;
		for(i=0;i<students.length;i++)
			if(students[i].avgMark==h)
				s[++j]=students[i];
		return s;

		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		try{
			int h;
			if(student==null)
				throw new IllegalArgumentException();
			for(int i=0;i<students.length;i++)
				if(student.id==students[i].id)
					h=i;
			return students[h+1];
	
		}
		return null;
		catch (IllegalArgumentException iae)
		{
		
		}
	}
}
