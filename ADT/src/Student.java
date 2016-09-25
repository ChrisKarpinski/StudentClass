
public class Student {

	private String studentName;
	private int studentAverage;
	
	public Student (int average, String name) {
		
		this.studentName = name;
		this.studentAverage = average;
		
	}
	
	public String GetName() {
		
		String nameStudent = this.studentName;
		return nameStudent;
	}
	
	public int GetAverage () {
		
		int averageOfStudent = this.studentAverage;
		return averageOfStudent;
	}
}
