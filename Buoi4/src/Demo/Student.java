package Demo;

public class Student  {
	private String name;
	private String GPA;
	
	public Student() {
		super();
	}
	public Student(String name, String gPA) {
		super();
		this.name = name;
		GPA = gPA;
		
	}
	
	public String getName() {
		return name;
	}
	public String getGPA() {
		return GPA;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGPA(String gPA) {
		GPA = gPA;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", GPA=" + GPA + "]";
	}
	
	public String an() {
		return "com";
	}
	
}
